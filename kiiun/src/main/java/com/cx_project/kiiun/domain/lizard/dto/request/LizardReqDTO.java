package com.cx_project.kiiun.domain.lizard.dto.request;

import com.cx_project.kiiun.global.enums.Morph;
import com.cx_project.kiiun.global.enums.Species;
import lombok.Builder;
import lombok.Getter;

@Getter
public class LizardReqDTO {
    private String lizardName;
    private String adoptDate;
    private String birthDate;
    private Species species;
    private Morph morph;
    private boolean wantsMate;
    private float optTemperature;
    private float optHumidity;
    private String hausNumber;

    public LizardReqDTO() {

    }

    @Builder
    public LizardReqDTO(String lizardName, String adoptDate, String birthDate, Species species, Morph morph, boolean wantsMate, float optTemperature, float optHumidity, String hausNumber) {
        this.lizardName = lizardName;
        this.adoptDate = adoptDate;
        this.birthDate = birthDate;
        this.species = species;
        this.morph = morph;
        this.wantsMate = wantsMate;
        this.optTemperature = optTemperature;
        this.optHumidity = optHumidity;
        this.hausNumber = hausNumber;
    }
}
