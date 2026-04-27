package org.scilab.forge.jlatexmath;

public class DdotsAtom extends Atom {
    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float width = TeXFormula.get("ldots").root.createBox(teXEnvironment).getWidth();
        Box boxCreateBox = SymbolAtom.get("ldotp").createBox(teXEnvironment);
        HorizontalBox horizontalBox = new HorizontalBox(boxCreateBox, width, 0);
        HorizontalBox horizontalBox2 = new HorizontalBox(boxCreateBox, width, 2);
        HorizontalBox horizontalBox3 = new HorizontalBox(boxCreateBox, width, 1);
        Box boxCreateBox2 = new SpaceAtom(5, 0.0f, 4.0f, 0.0f).createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(horizontalBox);
        verticalBox.add(boxCreateBox2);
        verticalBox.add(horizontalBox2);
        verticalBox.add(boxCreateBox2);
        verticalBox.add(horizontalBox3);
        verticalBox.setHeight(verticalBox.getHeight() + verticalBox.getDepth());
        verticalBox.setDepth(0.0f);
        return verticalBox;
    }
}
