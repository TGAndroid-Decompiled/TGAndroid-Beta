package org.scilab.forge.jlatexmath;

public class MathAtom extends Atom {
    protected Atom base;
    private int style;

    public MathAtom(Atom atom, int i) {
        this.base = atom;
        this.style = i;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironmentCopy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
        teXEnvironmentCopy.getTeXFont().setRoman(false);
        int style = teXEnvironmentCopy.getStyle();
        teXEnvironmentCopy.setStyle(this.style);
        Box boxCreateBox = this.base.createBox(teXEnvironmentCopy);
        teXEnvironmentCopy.setStyle(style);
        return boxCreateBox;
    }
}
