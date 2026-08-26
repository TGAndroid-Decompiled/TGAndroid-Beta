package org.scilab.forge.jlatexmath;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;

public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(Fragment$$ExternalSyntheticOutline0.m("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
