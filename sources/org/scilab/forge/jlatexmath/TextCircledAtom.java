package org.scilab.forge.jlatexmath;

public class TextCircledAtom extends Atom {
    private Atom at;

    public TextCircledAtom(Atom atom) {
        this.at = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreateBox = SymbolAtom.get("bigcirc").createBox(teXEnvironment);
        boxCreateBox.setShift(SpaceAtom.getFactor(1, teXEnvironment) * (-0.07f));
        HorizontalBox horizontalBox = new HorizontalBox(this.at.createBox(teXEnvironment), boxCreateBox.getWidth(), 2);
        horizontalBox.add(new StrutBox(-horizontalBox.getWidth(), 0.0f, 0.0f, 0.0f));
        horizontalBox.add(boxCreateBox);
        return horizontalBox;
    }
}
