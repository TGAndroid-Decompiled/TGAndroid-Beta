package org.scilab.forge.jlatexmath;
public class CharAtom extends CharSymbol {
    private final char f18018c;
    private boolean mathMode;
    private String textStyle;

    public CharAtom(char c3, String str, boolean z4) {
        this.f18018c = c3;
        this.textStyle = str;
        this.mathMode = z4;
    }

    private Char getChar(TeXFont teXFont, int i10, boolean z4) {
        char c3 = this.f18018c;
        if (z4 && Character.isLowerCase(c3)) {
            c3 = Character.toUpperCase(this.f18018c);
        }
        String str = this.textStyle;
        if (str == null) {
            return teXFont.getDefaultChar(c3, i10);
        }
        return teXFont.getChar(c3, str, i10);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        String textStyle;
        if (this.textStyle == null && (textStyle = teXEnvironment.getTextStyle()) != null) {
            this.textStyle = textStyle;
        }
        boolean smallCap = teXEnvironment.getSmallCap();
        CharBox charBox = new CharBox(getChar(teXEnvironment.getTeXFont(), teXEnvironment.getStyle(), smallCap));
        if (smallCap && Character.isLowerCase(this.f18018c)) {
            return new ScaleBox(charBox, 0.800000011920929d, 0.800000011920929d);
        }
        return charBox;
    }

    @Override
    public CharFont getCharFont(TeXFont teXFont) {
        return getChar(teXFont, 0, false).getCharFont();
    }

    public char getCharacter() {
        return this.f18018c;
    }

    public boolean isMathMode() {
        return this.mathMode;
    }

    public String toString() {
        return "CharAtom: '" + this.f18018c + "'";
    }

    public CharAtom(char c3, String str) {
        this(c3, str, false);
    }
}
