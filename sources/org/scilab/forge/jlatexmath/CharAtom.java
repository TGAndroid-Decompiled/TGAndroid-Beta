package org.scilab.forge.jlatexmath;

public class CharAtom extends CharSymbol {
    private final char c;
    private boolean mathMode;
    private String textStyle;

    public CharAtom(char c, String str, boolean z) {
        this.c = c;
        this.textStyle = str;
        this.mathMode = z;
    }

    private Char getChar(TeXFont teXFont, int i, boolean z) {
        char upperCase = this.c;
        if (z && Character.isLowerCase(upperCase)) {
            upperCase = Character.toUpperCase(this.c);
        }
        String str = this.textStyle;
        return str == null ? teXFont.getDefaultChar(upperCase, i) : teXFont.getChar(upperCase, str, i);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        String textStyle;
        if (this.textStyle == null && (textStyle = teXEnvironment.getTextStyle()) != null) {
            this.textStyle = textStyle;
        }
        boolean smallCap = teXEnvironment.getSmallCap();
        CharBox charBox = new CharBox(getChar(teXEnvironment.getTeXFont(), teXEnvironment.getStyle(), smallCap));
        return (smallCap && Character.isLowerCase(this.c)) ? new ScaleBox(charBox, 0.800000011920929d, 0.800000011920929d) : charBox;
    }

    @Override
    public CharFont getCharFont(TeXFont teXFont) {
        return getChar(teXFont, 0, false).getCharFont();
    }

    public char getCharacter() {
        return this.c;
    }

    public boolean isMathMode() {
        return this.mathMode;
    }

    public String toString() {
        return "CharAtom: '" + this.c + "'";
    }

    public CharAtom(char c, String str) {
        this(c, str, false);
    }
}
