package org.scilab.forge.jlatexmath;
public class CharAtom extends CharSymbol {
    private final char f21179c;
    private boolean mathMode;
    private String textStyle;

    public CharAtom(char c2, String str, boolean z10) {
        this.f21179c = c2;
        this.textStyle = str;
        this.mathMode = z10;
    }

    private Char getChar(TeXFont teXFont, int i3, boolean z10) {
        char c2 = this.f21179c;
        if (z10 && Character.isLowerCase(c2)) {
            c2 = Character.toUpperCase(this.f21179c);
        }
        String str = this.textStyle;
        if (str == null) {
            return teXFont.getDefaultChar(c2, i3);
        }
        return teXFont.getChar(c2, str, i3);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        String textStyle;
        if (this.textStyle == null && (textStyle = teXEnvironment.getTextStyle()) != null) {
            this.textStyle = textStyle;
        }
        boolean smallCap = teXEnvironment.getSmallCap();
        CharBox charBox = new CharBox(getChar(teXEnvironment.getTeXFont(), teXEnvironment.getStyle(), smallCap));
        if (smallCap && Character.isLowerCase(this.f21179c)) {
            return new ScaleBox(charBox, 0.800000011920929d, 0.800000011920929d);
        }
        return charBox;
    }

    @Override
    public CharFont getCharFont(TeXFont teXFont) {
        return getChar(teXFont, 0, false).getCharFont();
    }

    public char getCharacter() {
        return this.f21179c;
    }

    public boolean isMathMode() {
        return this.mathMode;
    }

    public String toString() {
        return "CharAtom: '" + this.f21179c + "'";
    }

    public CharAtom(char c2, String str) {
        this(c2, str, false);
    }
}
