package org.scilab.forge.jlatexmath;

public class FixedCharAtom extends CharSymbol {

    private final CharFont f19587cf;

    public FixedCharAtom(CharFont charFont) {
        this.f19587cf = charFont;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new CharBox(teXEnvironment.getTeXFont().getChar(this.f19587cf, teXEnvironment.getStyle()));
    }

    @Override
    public CharFont getCharFont(TeXFont teXFont) {
        return this.f19587cf;
    }
}
