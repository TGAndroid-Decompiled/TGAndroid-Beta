package org.scilab.forge.jlatexmath;
public class RomanAtom extends Atom {
    protected Atom base;

    public RomanAtom(Atom atom) {
        this.base = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        if (this.base != null) {
            TeXEnvironment copy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
            copy.getTeXFont().setRoman(true);
            return this.base.createBox(copy);
        }
        return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
