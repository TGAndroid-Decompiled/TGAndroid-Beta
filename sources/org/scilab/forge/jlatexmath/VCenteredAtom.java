package org.scilab.forge.jlatexmath;

public class VCenteredAtom extends Atom {
    private final Atom atom;

    public VCenteredAtom(Atom atom) {
        this.atom = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreateBox = this.atom.createBox(teXEnvironment);
        boxCreateBox.setShift((-((boxCreateBox.getHeight() + boxCreateBox.getDepth()) / 2.0f)) - teXEnvironment.getTeXFont().getAxisHeight(teXEnvironment.getStyle()));
        return new HorizontalBox(boxCreateBox);
    }
}
