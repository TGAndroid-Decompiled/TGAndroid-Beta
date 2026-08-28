package org.scilab.forge.jlatexmath.greek;

import java.lang.Character;
import org.scilab.forge.jlatexmath.AlphabetRegistration;
public class GreekRegistration implements AlphabetRegistration {
    @Override
    public String getTeXFontFileName() {
        return "fonts/language_greek.xml";
    }

    @Override
    public Character.UnicodeBlock[] getUnicodeBlock() {
        return new Character.UnicodeBlock[]{Character.UnicodeBlock.GREEK, Character.UnicodeBlock.GREEK_EXTENDED};
    }

    @Override
    public Object getPackage() {
        return this;
    }
}
