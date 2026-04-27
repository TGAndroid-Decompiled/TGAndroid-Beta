package org.scilab.forge.jlatexmath;

public class StyleAtom extends Atom {
    private Atom at;
    private int style;

    public StyleAtom(int i, Atom atom) {
        this.style = i;
        this.at = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        int style = teXEnvironment.getStyle();
        teXEnvironment.setStyle(this.style);
        Box boxCreateBox = this.at.createBox(teXEnvironment);
        teXEnvironment.setStyle(style);
        return boxCreateBox;
    }
}
