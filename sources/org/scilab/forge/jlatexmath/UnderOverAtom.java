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
        float height = (verticalBox.getHeight() + verticalBox.getDepth()) - boxChangeWidth.getDepth();
        if (this.under != null) {
            verticalBox.add(new SpaceAtom(this.overUnit, 0.0f, this.underSpace, 0.0f).createBox(teXEnvironment));
            verticalBox.add(changeWidth(boxCreateBox2, width));
        }
        verticalBox.setDepth((verticalBox.getHeight() + verticalBox.getDepth()) - height);
        verticalBox.setHeight(height);
        return verticalBox;
    }

    private static Box changeWidth(Box box, float f) {
        return (box == null || Math.abs(f - box.getWidth()) <= 1.0E-7f) ? box : new HorizontalBox(box, f, 2);
    }

    @Override
    public int getLeftType() {
        return this.base.getLeftType();
    }

    @Override
    public int getRightType() {
        return this.base.getRightType();
    }
}
