package org.scilab.forge.jlatexmath;

public class SmallCapAtom extends Atom {
    protected Atom base;

    public SmallCapAtom(Atom atom) {
        this.base = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        boolean smallCap = teXEnvironment.getSmallCap();
        teXEnvironment.setSmallCap(true);
        Box boxCreateBox = this.base.createBox(teXEnvironment);
        teXEnvironment.setSmallCap(smallCap);
        return boxCreateBox;
    }
}
