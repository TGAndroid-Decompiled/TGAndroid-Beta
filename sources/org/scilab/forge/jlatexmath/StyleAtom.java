package org.scilab.forge.jlatexmath;
public class StyleAtom extends Atom {
    private Atom at;
    private int style;

    public StyleAtom(int i9, Atom atom) {
        this.style = i9;
        this.at = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        int style = teXEnvironment.getStyle();
        teXEnvironment.setStyle(this.style);
        Box createBox = this.at.createBox(teXEnvironment);
        teXEnvironment.setStyle(style);
        return createBox;
    }
}
