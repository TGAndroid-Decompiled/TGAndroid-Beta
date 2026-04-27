package org.scilab.forge.jlatexmath;

public class VdotsAtom extends Atom {
    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreateBox = SymbolAtom.get("ldotp").createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox(boxCreateBox, 0.0f, 4);
        Box boxCreateBox2 = new SpaceAtom(5, 0.0f, 4.0f, 0.0f).createBox(teXEnvironment);
        verticalBox.add(boxCreateBox2);
        verticalBox.add(boxCreateBox);
        verticalBox.add(boxCreateBox2);
        verticalBox.add(boxCreateBox);
        float depth = verticalBox.getDepth();
        float height = verticalBox.getHeight();
        verticalBox.setDepth(0.0f);
        verticalBox.setHeight(depth + height);
        return verticalBox;
    }
}
