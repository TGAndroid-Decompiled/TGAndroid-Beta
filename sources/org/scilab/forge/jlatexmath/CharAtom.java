package org.scilab.forge.jlatexmath;

public class CharAtom extends CharSymbol {

    private final char f19583c;
    private boolean mathMode;
    private String textStyle;

    public CharAtom(char c10, String str, boolean z10) {
        this.f19583c = c10;
        this.textStyle = str;
        this.mathMode = z10;
    }

    private Char getChar(TeXFont teXFont, int i10, boolean z10) {
        char upperCase = this.f19583c;
        if (z10 && Character.isLowerCase(upperCase)) {
            upperCase = Character.toUpperCase(this.f19583c);
        }
        String str = this.textStyle;
        return str == null ? teXFont.getDefaultChar(upperCase, i10) : teXFont.getChar(upperCase, str, i10);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        String textStyle;
        if (this.textStyle == null && (textStyle = teXEnvironment.getTextStyle()) != null) {
            this.textStyle = textStyle;
        }
        boolean smallCap = teXEnvironment.getSmallCap();
        CharBox charBox = new CharBox(getChar(teXEnvironment.getTeXFont(), teXEnvironment.getStyle(), smallCap));
        return (smallCap && Character.isLowerCase(this.f19583c)) ? new ScaleBox(charBox, 0.800000011920929d, 0.800000011920929d) : charBox;
    }

    @Override
    public CharFont getCharFont(TeXFont teXFont) {
        return getChar(teXFont, 0, false).getCharFont();
    }

    public char getCharacter() {
        return this.f19583c;
    }

    public boolean isMathMode() {
        return this.mathMode;
    }

    public String toString() {
        return "CharAtom: '" + this.f19583c + "'";
    }

    public CharAtom(char c10, String str) {
        this(c10, str, false);
    }
}
