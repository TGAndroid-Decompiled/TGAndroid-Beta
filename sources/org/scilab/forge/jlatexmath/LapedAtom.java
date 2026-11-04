package org.scilab.forge.jlatexmath;
public class LapedAtom extends Atom {
    private Atom at;
    private char type;

    public LapedAtom(Atom atom, char c2) {
        this.at = atom;
        this.type = c2;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.at.createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(createBox);
        verticalBox.setWidth(0.0f);
        char c2 = this.type;
        if (c2 != 'l') {
            if (c2 != 'r') {
                createBox.setShift((-createBox.getWidth()) / 2.0f);
                return verticalBox;
            }
            createBox.setShift(0.0f);
            return verticalBox;
        }
        createBox.setShift(-createBox.getWidth());
        return verticalBox;
    }
}
