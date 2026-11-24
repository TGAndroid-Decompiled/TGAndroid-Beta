package org.scilab.forge.jlatexmath;
public class UnderOverAtom extends Atom {
    private final Atom base;
    private final Atom over;
    private final boolean overScriptSize;
    private final float overSpace;
    private final int overUnit;
    private final Atom under;
    private final boolean underScriptSize;
    private final float underSpace;
    private final int underUnit;

    public UnderOverAtom(Atom atom, Atom atom2, int i, float f, boolean z, boolean z2) {
        SpaceAtom.checkUnit(i);
        this.base = atom;
        if (z2) {
            this.under = null;
            this.underSpace = 0.0f;
            this.underUnit = 0;
            this.underScriptSize = false;
            this.over = atom2;
            this.overUnit = i;
            this.overSpace = f;
            this.overScriptSize = z;
            return;
        }
        this.under = atom2;
        this.underUnit = i;
        this.underSpace = f;
        this.underScriptSize = z;
        this.overSpace = 0.0f;
        this.over = null;
        this.overUnit = 0;
        this.overScriptSize = false;
    }

    private static Box changeWidth(Box box, float f) {
        if (box != null && Math.abs(f - box.getWidth()) > 1.0E-7f) {
            return new HorizontalBox(box, f, 2);
        }
        return box;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox;
        Box box;
        TeXEnvironment teXEnvironment2;
        TeXEnvironment teXEnvironment3;
        Atom atom = this.base;
        if (atom == null) {
            createBox = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            createBox = atom.createBox(teXEnvironment);
        }
        float width = createBox.getWidth();
        Atom atom2 = this.over;
        Box box2 = null;
        if (atom2 != null) {
            if (this.overScriptSize) {
                teXEnvironment3 = teXEnvironment.subStyle();
            } else {
                teXEnvironment3 = teXEnvironment;
            }
            box = atom2.createBox(teXEnvironment3);
            width = Math.max(width, box.getWidth());
        } else {
            box = null;
        }
        Atom atom3 = this.under;
        if (atom3 != null) {
            if (this.underScriptSize) {
                teXEnvironment2 = teXEnvironment.subStyle();
            } else {
                teXEnvironment2 = teXEnvironment;
            }
            box2 = atom3.createBox(teXEnvironment2);
            width = Math.max(width, box2.getWidth());
        }
        VerticalBox verticalBox = new VerticalBox();
        teXEnvironment.setLastFontId(createBox.getLastFontId());
        if (this.over != null) {
            verticalBox.add(changeWidth(box, width));
            verticalBox.add(new SpaceAtom(this.overUnit, 0.0f, this.overSpace, 0.0f).createBox(teXEnvironment));
        }
        Box changeWidth = changeWidth(createBox, width);
        verticalBox.add(changeWidth);
        float depth = (verticalBox.getDepth() + verticalBox.getHeight()) - changeWidth.getDepth();
        if (this.under != null) {
            verticalBox.add(new SpaceAtom(this.overUnit, 0.0f, this.underSpace, 0.0f).createBox(teXEnvironment));
            verticalBox.add(changeWidth(box2, width));
        }
        verticalBox.setDepth((verticalBox.getDepth() + verticalBox.getHeight()) - depth);
        verticalBox.setHeight(depth);
        return verticalBox;
    }

    @Override
    public int getLeftType() {
        return this.base.getLeftType();
    }

    @Override
    public int getRightType() {
        return this.base.getRightType();
    }

    public UnderOverAtom(Atom atom, Atom atom2, int i, float f, boolean z, Atom atom3, int i2, float f2, boolean z2) {
        SpaceAtom.checkUnit(i);
        SpaceAtom.checkUnit(i2);
        this.base = atom;
        this.under = atom2;
        this.underUnit = i;
        this.underSpace = f;
        this.underScriptSize = z;
        this.over = atom3;
        this.overUnit = i2;
        this.overSpace = f2;
        this.overScriptSize = z2;
    }
}
