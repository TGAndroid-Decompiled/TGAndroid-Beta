package org.scilab.forge.jlatexmath;

public class BoldAtom extends Atom {
    private Atom base;

    public BoldAtom(Atom atom) {
        this.base = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        if (this.base != null) {
            TeXEnvironment teXEnvironmentCopy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
            teXEnvironmentCopy.getTeXFont().setBold(true);
            return this.base.createBox(teXEnvironmentCopy);
        }
        return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
