package org.scilab.forge.jlatexmath;
public class FixedCharAtom extends CharSymbol {
    private final CharFont f19515cf;

    public FixedCharAtom(CharFont charFont) {
        this.f19515cf = charFont;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new CharBox(teXEnvironment.getTeXFont().getChar(this.f19515cf, teXEnvironment.getStyle()));
    }

    @Override
    public CharFont getCharFont(TeXFont teXFont) {
        return this.f19515cf;
    }
}
