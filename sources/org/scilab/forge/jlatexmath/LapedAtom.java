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
        Box boxCreateBox = this.at.createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(boxCreateBox);
        verticalBox.setWidth(0.0f);
        char c = this.type;
        if (c == 'l') {
            boxCreateBox.setShift(-boxCreateBox.getWidth());
        } else if (c == 'r') {
            boxCreateBox.setShift(0.0f);
        } else {
            boxCreateBox.setShift((-boxCreateBox.getWidth()) / 2.0f);
        }
        return verticalBox;
    }
}
