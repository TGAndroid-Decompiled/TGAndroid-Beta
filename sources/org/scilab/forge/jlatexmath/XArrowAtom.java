package org.scilab.forge.jlatexmath;
public class XArrowAtom extends Atom {
    private boolean left;
    private Atom over;
    private Atom under;

    public XArrowAtom(Atom atom, Atom atom2, boolean z4) {
        this.over = atom;
        this.under = atom2;
        this.left = z4;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box strutBox;
        Box strutBox2;
        Atom atom = this.over;
        if (atom != null) {
            strutBox = atom.createBox(teXEnvironment.supStyle());
        } else {
            strutBox = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        }
        Atom atom2 = this.under;
        if (atom2 != null) {
            strutBox2 = atom2.createBox(teXEnvironment.subStyle());
        } else {
            strutBox2 = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        }
        Box createBox = new SpaceAtom(0, 1.5f, 0.0f, 0.0f).createBox(teXEnvironment.supStyle());
        Box createBox2 = new SpaceAtom(0, 1.5f, 0.0f, 0.0f).createBox(teXEnvironment.subStyle());
        Box createBox3 = new SpaceAtom(5, 0.0f, 2.0f, 0.0f).createBox(teXEnvironment);
        float max = Math.max((createBox.getWidth() * 2.0f) + strutBox.getWidth(), (createBox2.getWidth() * 2.0f) + strutBox2.getWidth());
        Box create = XLeftRightArrowFactory.create(this.left, teXEnvironment, max);
        HorizontalBox horizontalBox = new HorizontalBox(strutBox, max, 2);
        HorizontalBox horizontalBox2 = new HorizontalBox(strutBox2, max, 2);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(horizontalBox);
        verticalBox.add(createBox3);
        verticalBox.add(create);
        verticalBox.add(createBox3);
        verticalBox.add(horizontalBox2);
        float depth = verticalBox.getDepth() + verticalBox.getHeight();
        float depth2 = createBox3.getDepth() + createBox3.getHeight();
        float depth3 = horizontalBox2.getDepth() + horizontalBox2.getHeight() + depth2;
        verticalBox.setDepth(depth3);
        verticalBox.setHeight(depth - depth3);
        return new HorizontalBox(verticalBox, (createBox3.getHeight() * 2.0f) + verticalBox.getWidth(), 2);
    }
}
