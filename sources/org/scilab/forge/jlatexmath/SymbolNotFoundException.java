package org.scilab.forge.jlatexmath;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;

public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(SurfaceContainer$$ExternalSyntheticOutline0.m("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
