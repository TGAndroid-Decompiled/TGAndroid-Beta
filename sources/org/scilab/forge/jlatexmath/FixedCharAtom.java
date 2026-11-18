package org.scilab.forge.jlatexmath;
public class FixedCharAtom extends CharSymbol {
    private final CharFont f22575cf;

    public FixedCharAtom(CharFont charFont) {
        this.f22575cf = charFont;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new CharBox(teXEnvironment.getTeXFont().getChar(this.f22575cf, teXEnvironment.getStyle()));
    }

    @Override
    public CharFont getCharFont(TeXFont teXFont) {
        return this.f22575cf;
    }
}
