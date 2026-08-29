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
        Box strutBox;
        Box create;
        float f9;
        Atom atom = this.base;
        if (atom != null) {
            strutBox = atom.createBox(teXEnvironment);
        } else {
            strutBox = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float width = new SpaceAtom(3, 1.0f, 0.0f, 0.0f).createBox(teXEnvironment).getWidth();
        if (this.dble) {
            create = XLeftRightArrowFactory.create(teXEnvironment, strutBox.getWidth());
            f9 = width * 4.0f;
        } else {
            create = XLeftRightArrowFactory.create(this.left, teXEnvironment, strutBox.getWidth());
            f9 = -width;
        }
        VerticalBox verticalBox = new VerticalBox();
        if (this.over) {
            verticalBox.add(create);
            verticalBox.add(new HorizontalBox(strutBox, create.getWidth(), 2));
            float height = verticalBox.getHeight() + verticalBox.getDepth();
            verticalBox.setDepth(strutBox.getDepth());
            verticalBox.setHeight(height - strutBox.getDepth());
            return verticalBox;
        }
        verticalBox.add(new HorizontalBox(strutBox, create.getWidth(), 2));
        verticalBox.add(new StrutBox(0.0f, f9, 0.0f, 0.0f));
        verticalBox.add(create);
        verticalBox.setDepth((verticalBox.getHeight() + verticalBox.getDepth()) - strutBox.getHeight());
        verticalBox.setHeight(strutBox.getHeight());
        return verticalBox;
    }

    public UnderOverArrowAtom(Atom atom, boolean z10) {
        this.left = false;
        this.base = atom;
        this.over = z10;
        this.dble = true;
    }
}
