package org.scilab.forge.jlatexmath;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;

public class TextStyleMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 4887043712790844966L;

    public TextStyleMappingNotFoundException(String str) {
        super(SurfaceContainer$$ExternalSyntheticOutline0.m("No mapping found for the text style '", str, "'! Insert a <TextStyleMapping>-element in 'DefaultTeXFont.xml'."));
    }
}
