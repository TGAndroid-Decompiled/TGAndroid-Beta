package org.scilab.forge.jlatexmath;

public class TtAtom extends Atom {
    private Atom base;

    public TtAtom(Atom atom) {
        this.base = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironmentCopy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
        teXEnvironmentCopy.getTeXFont().setTt(true);
        Box boxCreateBox = this.base.createBox(teXEnvironmentCopy);
        teXEnvironmentCopy.getTeXFont().setTt(false);
        return boxCreateBox;
    }
}
