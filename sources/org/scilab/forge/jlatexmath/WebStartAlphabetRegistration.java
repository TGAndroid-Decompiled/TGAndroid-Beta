package org.scilab.forge.jlatexmath;

import org.scilab.forge.jlatexmath.cyrillic.CyrillicRegistration;
import org.scilab.forge.jlatexmath.greek.GreekRegistration;

public class WebStartAlphabetRegistration implements AlphabetRegistration {
    private Character.UnicodeBlock[] blocks;
    private AlphabetRegistration reg;

    private WebStartAlphabetRegistration(Character.UnicodeBlock[] unicodeBlockArr) {
        this.blocks = unicodeBlockArr;
    }

    public static void register(Character.UnicodeBlock[] unicodeBlockArr) {
        DefaultTeXFont.registerAlphabet(new WebStartAlphabetRegistration(unicodeBlockArr));
    }

    @Override
    public Character.UnicodeBlock[] getUnicodeBlock() {
        return this.blocks;
    }

    @Override
    public Object getPackage() throws AlphabetRegistrationException {
        Character.UnicodeBlock[] unicodeBlockArr = this.blocks;
        if (unicodeBlockArr == AlphabetRegistration.JLM_GREEK) {
            this.reg = new GreekRegistration();
        } else if (unicodeBlockArr == AlphabetRegistration.JLM_CYRILLIC) {
            this.reg = new CyrillicRegistration();
        } else {
            throw new AlphabetRegistrationException("Invalid Unicode Block");
        }
        return this.reg;
    }

    @Override
    public String getTeXFontFileName() {
        return this.reg.getTeXFontFileName();
    }
}
