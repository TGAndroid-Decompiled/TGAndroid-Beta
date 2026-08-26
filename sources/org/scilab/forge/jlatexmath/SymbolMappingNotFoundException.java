package org.scilab.forge.jlatexmath;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;

public class SymbolMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 2659192520874275262L;

    public SymbolMappingNotFoundException(String str) {
        super(SurfaceContainer$$ExternalSyntheticOutline0.m("No mapping found for the symbol '", str, "'! Insert a <SymbolMapping>-element in 'DefaultTeXFont.xml'."));
    }
}
