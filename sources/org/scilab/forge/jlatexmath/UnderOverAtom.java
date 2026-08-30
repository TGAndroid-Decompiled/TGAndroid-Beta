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

    public UnderOverAtom(Atom atom, Atom atom2, int i10, float f10, boolean z4, boolean z10) {
        SpaceAtom.checkUnit(i10);
        this.base = atom;
        if (z10) {
            this.under = null;
            this.underSpace = 0.0f;
            this.underUnit = 0;
            this.underScriptSize = false;
            this.over = atom2;
            this.overUnit = i10;
            this.overSpace = f10;
            this.overScriptSize = z4;
            return;
        }
        this.under = atom2;
        this.underUnit = i10;
        this.underSpace = f10;
        this.underScriptSize = z4;
        this.overSpace = 0.0f;
        this.over = null;
        this.overUnit = 0;
        this.overScriptSize = false;
    }

    private static Box changeWidth(Box box, float f10) {
        if (box != null && Math.abs(f10 - box.getWidth()) > 1.0E-7f) {
            return new HorizontalBox(box, f10, 2);
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

    public UnderOverAtom(Atom atom, Atom atom2, int i10, float f10, boolean z4, Atom atom3, int i11, float f11, boolean z10) {
        SpaceAtom.checkUnit(i10);
        SpaceAtom.checkUnit(i11);
        this.base = atom;
        this.under = atom2;
        this.underUnit = i10;
        this.underSpace = f10;
        this.underScriptSize = z4;
        this.over = atom3;
        this.overUnit = i11;
        this.overSpace = f11;
        this.overScriptSize = z10;
    }
}
