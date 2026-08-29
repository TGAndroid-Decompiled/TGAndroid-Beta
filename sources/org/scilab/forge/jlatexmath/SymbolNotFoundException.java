package org.scilab.forge.jlatexmath;

import a4.w;
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(w.n("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
