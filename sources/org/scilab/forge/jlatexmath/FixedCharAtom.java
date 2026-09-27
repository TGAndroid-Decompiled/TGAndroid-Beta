package org.scilab.forge.jlatexmath;
public class FixedCharAtom extends CharSymbol {
    private final CharFont f15792cf;

    public FixedCharAtom(CharFont charFont) {
        this.f15792cf = charFont;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new CharBox(teXEnvironment.getTeXFont().getChar(this.f15792cf, teXEnvironment.getStyle()));
    }

    @Override
    public CharFont getCharFont(TeXFont teXFont) {
        return this.f15792cf;
    }
}
