package org.scilab.forge.jlatexmath.cyrillic;

import org.scilab.forge.jlatexmath.AlphabetRegistration;

public class CyrillicRegistration implements AlphabetRegistration {
    @Override
    public String getTeXFontFileName() {
        return "fonts/language_cyrillic.xml";
    }

    @Override
    public Character.UnicodeBlock[] getUnicodeBlock() {
        return new Character.UnicodeBlock[]{Character.UnicodeBlock.CYRILLIC};
    }

    @Override
    public Object getPackage() {
        return this;
    }
}
