package org.scilab.forge.jlatexmath;
public class LapedAtom extends Atom {
    private Atom at;
    private char type;

    public LapedAtom(Atom atom, char c) {
        this.at = atom;
        this.type = c;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.at.createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(createBox);
        verticalBox.setWidth(0.0f);
        char c = this.type;
        if (c != 'l') {
            if (c != 'r') {
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
