package org.scilab.forge.jlatexmath;

public class UnderOverArrowAtom extends Atom {
    private Atom base;
    private boolean dble;
    private boolean left;
    private boolean over;

    public UnderOverArrowAtom(Atom atom, boolean z10, boolean z11) {
        this.dble = false;
        this.base = atom;
        this.left = z10;
        this.over = z11;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreate;
        float f10;
        Atom atom = this.base;
        Box boxCreateBox = atom != null ? atom.createBox(teXEnvironment) : new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        float width = new SpaceAtom(3, 1.0f, 0.0f, 0.0f).createBox(teXEnvironment).getWidth();
        if (this.dble) {
            boxCreate = XLeftRightArrowFactory.create(teXEnvironment, boxCreateBox.getWidth());
            f10 = width * 4.0f;
        } else {
            boxCreate = XLeftRightArrowFactory.create(this.left, teXEnvironment, boxCreateBox.getWidth());
            f10 = -width;
        }
        VerticalBox verticalBox = new VerticalBox();
        if (this.over) {
            verticalBox.add(boxCreate);
            verticalBox.add(new HorizontalBox(boxCreateBox, boxCreate.getWidth(), 2));
            float height = verticalBox.getHeight() + verticalBox.getDepth();
            verticalBox.setDepth(boxCreateBox.getDepth());
            verticalBox.setHeight(height - boxCreateBox.getDepth());
            return verticalBox;
        }
        verticalBox.add(new HorizontalBox(boxCreateBox, boxCreate.getWidth(), 2));
        verticalBox.add(new StrutBox(0.0f, f10, 0.0f, 0.0f));
        verticalBox.add(boxCreate);
        verticalBox.setDepth((verticalBox.getHeight() + verticalBox.getDepth()) - boxCreateBox.getHeight());
        verticalBox.setHeight(boxCreateBox.getHeight());
        return verticalBox;
    }

    public UnderOverArrowAtom(Atom atom, boolean z10) {
        this.left = false;
        this.base = atom;
        this.over = z10;
        this.dble = true;
    }
}
