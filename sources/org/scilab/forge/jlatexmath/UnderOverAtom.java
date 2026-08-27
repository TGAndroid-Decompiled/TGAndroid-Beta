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

    public UnderOverAtom(Atom atom, Atom atom2, int i10, float f10, boolean z10, boolean z11) {
        SpaceAtom.checkUnit(i10);
        this.base = atom;
        if (z11) {
            this.under = null;
            this.underSpace = 0.0f;
            this.underUnit = 0;
            this.underScriptSize = false;
            this.over = atom2;
            this.overUnit = i10;
            this.overSpace = f10;
            this.overScriptSize = z10;
            return;
        }
        this.under = atom2;
        this.underUnit = i10;
        this.underSpace = f10;
        this.underScriptSize = z10;
        this.overSpace = 0.0f;
        this.over = null;
        this.overUnit = 0;
        this.overScriptSize = false;
    }

    private static Box changeWidth(Box box, float f10) {
        return (box == null || Math.abs(f10 - box.getWidth()) <= 1.0E-7f) ? box : new HorizontalBox(box, f10, 2);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreateBox;
        Atom atom = this.base;
        Box strutBox = atom == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom.createBox(teXEnvironment);
        float width = strutBox.getWidth();
        Atom atom2 = this.over;
        Box boxCreateBox2 = null;
        if (atom2 != null) {
            boxCreateBox = atom2.createBox(this.overScriptSize ? teXEnvironment.subStyle() : teXEnvironment);
            width = Math.max(width, boxCreateBox.getWidth());
        } else {
            boxCreateBox = null;
        }
        Atom atom3 = this.under;
        if (atom3 != null) {
            boxCreateBox2 = atom3.createBox(this.underScriptSize ? teXEnvironment.subStyle() : teXEnvironment);
            width = Math.max(width, boxCreateBox2.getWidth());
        }
        VerticalBox verticalBox = new VerticalBox();
        teXEnvironment.setLastFontId(strutBox.getLastFontId());
        if (this.over != null) {
            verticalBox.add(changeWidth(boxCreateBox, width));
            verticalBox.add(new SpaceAtom(this.overUnit, 0.0f, this.overSpace, 0.0f).createBox(teXEnvironment));
        }
        Box boxChangeWidth = changeWidth(strutBox, width);
        verticalBox.add(boxChangeWidth);
        float depth = (verticalBox.getDepth() + verticalBox.getHeight()) - boxChangeWidth.getDepth();
        if (this.under != null) {
            verticalBox.add(new SpaceAtom(this.overUnit, 0.0f, this.underSpace, 0.0f).createBox(teXEnvironment));
            verticalBox.add(changeWidth(boxCreateBox2, width));
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

    public UnderOverAtom(Atom atom, Atom atom2, int i10, float f10, boolean z10, Atom atom3, int i11, float f11, boolean z11) {
        SpaceAtom.checkUnit(i10);
        SpaceAtom.checkUnit(i11);
        this.base = atom;
        this.under = atom2;
        this.underUnit = i10;
        this.underSpace = f10;
        this.underScriptSize = z10;
        this.over = atom3;
        this.overUnit = i11;
        this.overSpace = f11;
        this.overScriptSize = z11;
    }
}
