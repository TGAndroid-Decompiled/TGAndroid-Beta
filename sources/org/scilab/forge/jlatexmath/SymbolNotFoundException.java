package org.scilab.forge.jlatexmath;

import aa.d;
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(d.o("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
