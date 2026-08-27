package org.scilab.forge.jlatexmath;

public class XArrowAtom extends Atom {
    private boolean left;
    private Atom over;
    private Atom under;

    public XArrowAtom(Atom atom, Atom atom2, boolean z10) {
        this.over = atom;
        this.under = atom2;
        this.left = z10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Atom atom = this.over;
        Box boxCreateBox = atom != null ? atom.createBox(teXEnvironment.supStyle()) : new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        Atom atom2 = this.under;
        Box boxCreateBox2 = atom2 != null ? atom2.createBox(teXEnvironment.subStyle()) : new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        Box boxCreateBox3 = new SpaceAtom(0, 1.5f, 0.0f, 0.0f).createBox(teXEnvironment.supStyle());
        Box boxCreateBox4 = new SpaceAtom(0, 1.5f, 0.0f, 0.0f).createBox(teXEnvironment.subStyle());
        Box boxCreateBox5 = new SpaceAtom(5, 0.0f, 2.0f, 0.0f).createBox(teXEnvironment);
        float fMax = Math.max((boxCreateBox3.getWidth() * 2.0f) + boxCreateBox.getWidth(), (boxCreateBox4.getWidth() * 2.0f) + boxCreateBox2.getWidth());
        Box boxCreate = XLeftRightArrowFactory.create(this.left, teXEnvironment, fMax);
        HorizontalBox horizontalBox = new HorizontalBox(boxCreateBox, fMax, 2);
        HorizontalBox horizontalBox2 = new HorizontalBox(boxCreateBox2, fMax, 2);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(horizontalBox);
        verticalBox.add(boxCreateBox5);
        verticalBox.add(boxCreate);
        verticalBox.add(boxCreateBox5);
        verticalBox.add(horizontalBox2);
        float depth = verticalBox.getDepth() + verticalBox.getHeight();
        float depth2 = horizontalBox2.getDepth() + horizontalBox2.getHeight() + boxCreateBox5.getDepth() + boxCreateBox5.getHeight();
        verticalBox.setDepth(depth2);
        verticalBox.setHeight(depth - depth2);
        return new HorizontalBox(verticalBox, (boxCreateBox5.getHeight() * 2.0f) + verticalBox.getWidth(), 2);
    }
}
