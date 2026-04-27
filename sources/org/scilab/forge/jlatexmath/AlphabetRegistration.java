package org.scilab.forge.jlatexmath;

import java.lang.Character;

public interface AlphabetRegistration {
    Object getPackage();

    String getTeXFontFileName();

    Character.UnicodeBlock[] getUnicodeBlock();
}
