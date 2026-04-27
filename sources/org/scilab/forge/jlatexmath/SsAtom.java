package org.scilab.forge.jlatexmath;

public class SsAtom extends Atom {
    private Atom base;

    public SsAtom(Atom atom) {
        this.base = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironmentCopy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
        teXEnvironmentCopy.getTeXFont().setSs(true);
        Box boxCreateBox = this.base.createBox(teXEnvironmentCopy);
        teXEnvironmentCopy.getTeXFont().setSs(false);
        return boxCreateBox;
    }
}
