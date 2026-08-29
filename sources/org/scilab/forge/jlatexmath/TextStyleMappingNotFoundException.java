package org.scilab.forge.jlatexmath;

import a4.w;
public class TextStyleMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 4887043712790844966L;

    public TextStyleMappingNotFoundException(String str) {
        super(w.n("No mapping found for the text style '", str, "'! Insert a <TextStyleMapping>-element in 'DefaultTeXFont.xml'."));
    }
}
