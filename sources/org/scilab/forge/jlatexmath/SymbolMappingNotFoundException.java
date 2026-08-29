package org.scilab.forge.jlatexmath;

import a4.w;
public class SymbolMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 2659192520874275262L;

    public SymbolMappingNotFoundException(String str) {
        super(w.n("No mapping found for the symbol '", str, "'! Insert a <SymbolMapping>-element in 'DefaultTeXFont.xml'."));
    }
}
