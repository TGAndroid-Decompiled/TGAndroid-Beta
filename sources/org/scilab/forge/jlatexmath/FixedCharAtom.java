package org.scilab.forge.jlatexmath;
public class FixedCharAtom extends CharSymbol {
    private final CharFont f17045cf;

    public FixedCharAtom(CharFont charFont) {
        this.f17045cf = charFont;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new CharBox(teXEnvironment.getTeXFont().getChar(this.f17045cf, teXEnvironment.getStyle()));
    }

    @Override
    public CharFont getCharFont(TeXFont teXFont) {
        return this.f17045cf;
    }
}
