package org.scilab.forge.jlatexmath;

public class CharFont {
    public int boldFontId;
    public char c;
    public int fontId;

    public CharFont(char c, int i) {
        this(c, i, i);
    }

    public CharFont(char c, int i, int i2) {
        this.c = c;
        this.fontId = i;
        this.boldFontId = i2;
    }
}
