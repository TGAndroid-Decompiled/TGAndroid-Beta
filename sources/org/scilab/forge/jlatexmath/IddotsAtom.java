package org.scilab.forge.jlatexmath;

public class IddotsAtom extends Atom {
    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float width = TeXFormula.get("ldots").root.createBox(teXEnvironment).getWidth();
        Box boxCreateBox = SymbolAtom.get("ldotp").createBox(teXEnvironment);
        HorizontalBox horizontalBox = new HorizontalBox(boxCreateBox, width, 1);
        HorizontalBox horizontalBox2 = new HorizontalBox(boxCreateBox, width, 2);
        HorizontalBox horizontalBox3 = new HorizontalBox(boxCreateBox, width, 0);
        Box boxCreateBox2 = new SpaceAtom(5, 0.0f, 4.0f, 0.0f).createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(horizontalBox);
        verticalBox.add(boxCreateBox2);
        verticalBox.add(horizontalBox2);
        verticalBox.add(boxCreateBox2);
        verticalBox.add(horizontalBox3);
        verticalBox.setHeight(verticalBox.getDepth() + verticalBox.getHeight());
        verticalBox.setDepth(0.0f);
        return verticalBox;
    }
}
