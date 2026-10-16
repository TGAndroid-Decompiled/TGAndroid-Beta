package org.scilab.forge.jlatexmath;
public class FixedCharAtom extends CharSymbol {
    private final CharFont f16367cf;

    public FixedCharAtom(CharFont charFont) {
        this.f16367cf = charFont;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new CharBox(teXEnvironment.getTeXFont().getChar(this.f16367cf, teXEnvironment.getStyle()));
    }

    @Override
    public CharFont getCharFont(TeXFont teXFont) {
        return this.f16367cf;
    }
}
