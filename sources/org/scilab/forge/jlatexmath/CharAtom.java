package org.scilab.forge.jlatexmath;
public class CharAtom extends CharSymbol {
    private final char f14606c;
    private boolean mathMode;
    private String textStyle;

    public CharAtom(char c10, String str, boolean z10) {
        this.f14606c = c10;
        this.textStyle = str;
        this.mathMode = z10;
    }

    private Char getChar(TeXFont teXFont, int i10, boolean z10) {
        char c10 = this.f14606c;
        if (z10 && Character.isLowerCase(c10)) {
            c10 = Character.toUpperCase(this.f14606c);
        }
        String str = this.textStyle;
        if (str == null) {
            return teXFont.getDefaultChar(c10, i10);
        }
        return teXFont.getChar(c10, str, i10);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        String textStyle;
        if (this.textStyle == null && (textStyle = teXEnvironment.getTextStyle()) != null) {
            this.textStyle = textStyle;
        }
        boolean smallCap = teXEnvironment.getSmallCap();
        CharBox charBox = new CharBox(getChar(teXEnvironment.getTeXFont(), teXEnvironment.getStyle(), smallCap));
        if (smallCap && Character.isLowerCase(this.f14606c)) {
            return new ScaleBox(charBox, 0.800000011920929d, 0.800000011920929d);
        }
        return charBox;
    }

    @Override
    public CharFont getCharFont(TeXFont teXFont) {
        return getChar(teXFont, 0, false).getCharFont();
    }

    public char getCharacter() {
        return this.f14606c;
    }

    public boolean isMathMode() {
        return this.mathMode;
    }

    public String toString() {
        return "CharAtom: '" + this.f14606c + "'";
    }

    public CharAtom(char c10, String str) {
        this(c10, str, false);
    }
}
