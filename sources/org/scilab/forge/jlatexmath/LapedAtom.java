package org.scilab.forge.jlatexmath;

public class LapedAtom extends Atom {
    private Atom at;
    private char type;

    public LapedAtom(Atom atom, char c10) {
        this.at = atom;
        this.type = c10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreateBox = this.at.createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(boxCreateBox);
        verticalBox.setWidth(0.0f);
        char c10 = this.type;
        if (c10 == 'l') {
            boxCreateBox.setShift(-boxCreateBox.getWidth());
            return verticalBox;
        }
        if (c10 != 'r') {
            boxCreateBox.setShift((-boxCreateBox.getWidth()) / 2.0f);
            return verticalBox;
        }
        boxCreateBox.setShift(0.0f);
        return verticalBox;
    }
}
