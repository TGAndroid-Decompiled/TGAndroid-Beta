package org.scilab.forge.jlatexmath;

public class BigOperatorAtom extends Atom {
    protected Atom base;
    private Atom over;
    private Atom under;
    private boolean limitsSet = false;
    private boolean limits = false;

    public BigOperatorAtom(Atom atom, Atom atom2, Atom atom3) {
        this.base = atom;
        this.under = atom2;
        this.over = atom3;
        this.type = 1;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        RowAtom rowAtom;
        Atom atom;
        int i;
        Box horizontalBox;
        float italic;
        float fMax;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Atom atom2 = this.base;
        if (atom2 instanceof TypedAtom) {
            Atom base = ((TypedAtom) atom2).getBase();
            if (base instanceof RowAtom) {
                rowAtom = (RowAtom) base;
                if (rowAtom.lookAtLastAtom && this.base.type_limits != 2) {
                    this.base = rowAtom.getLastAtom();
                }
            }
            this.base = base;
            rowAtom = null;
        } else {
            rowAtom = null;
        }
        boolean z = this.limitsSet;
        if ((z && !this.limits) || ((!z && style >= 2) || (i = (atom = this.base).type_limits) == 1 || (i == 0 && style >= 2))) {
            if (rowAtom != null) {
                rowAtom.add(new ScriptsAtom(this.base, this.under, this.over));
                Box boxCreateBox = rowAtom.createBox(teXEnvironment);
                rowAtom.getLastAtom();
                rowAtom.add(this.base);
                this.base = atom2;
                return boxCreateBox;
            }
            return new ScriptsAtom(this.base, this.under, this.over).createBox(teXEnvironment);
        }
        if ((atom instanceof SymbolAtom) && atom.type == 1) {
            Char r5 = teXFont.getChar(((SymbolAtom) atom).getName(), style);
            horizontalBox = this.base.createBox(teXEnvironment);
            italic = r5.getItalic();
        } else {
            Atom atom3 = this.base;
            horizontalBox = new HorizontalBox(atom3 == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom3.createBox(teXEnvironment));
            italic = 0.0f;
        }
        Atom atom4 = this.over;
        Box boxCreateBox2 = atom4 != null ? atom4.createBox(teXEnvironment.supStyle()) : null;
        Atom atom5 = this.under;
        Box boxCreateBox3 = atom5 != null ? atom5.createBox(teXEnvironment.subStyle()) : null;
        float fMax2 = Math.max(Math.max(boxCreateBox2 == null ? 0.0f : boxCreateBox2.getWidth(), horizontalBox.getWidth()), boxCreateBox3 == null ? 0.0f : boxCreateBox3.getWidth());
        Box boxChangeWidth = changeWidth(boxCreateBox2, fMax2);
        Box boxChangeWidth2 = changeWidth(horizontalBox, fMax2);
        Box boxChangeWidth3 = changeWidth(boxCreateBox3, fMax2);
        VerticalBox verticalBox = new VerticalBox();
        float bigOpSpacing5 = teXFont.getBigOpSpacing5(style);
        if (this.over != null) {
            verticalBox.add(new StrutBox(0.0f, bigOpSpacing5, 0.0f, 0.0f));
            boxChangeWidth.setShift(italic / 2.0f);
            verticalBox.add(boxChangeWidth);
            fMax = Math.max(teXFont.getBigOpSpacing1(style), teXFont.getBigOpSpacing3(style) - boxChangeWidth.getDepth());
            verticalBox.add(new StrutBox(0.0f, fMax, 0.0f, 0.0f));
            verticalBox.getHeight();
            verticalBox.getDepth();
        } else {
            fMax = 0.0f;
        }
        verticalBox.add(boxChangeWidth2);
        if (this.under != null) {
            verticalBox.add(new StrutBox(0.0f, Math.max(teXFont.getBigOpSpacing2(style), teXFont.getBigOpSpacing4(style) - boxChangeWidth3.getHeight()), 0.0f, 0.0f));
            boxChangeWidth3.setShift((-italic) / 2.0f);
            verticalBox.add(boxChangeWidth3);
            verticalBox.add(new StrutBox(0.0f, bigOpSpacing5, 0.0f, 0.0f));
        }
        float height = boxChangeWidth2.getHeight();
        float height2 = verticalBox.getHeight() + verticalBox.getDepth();
        if (boxChangeWidth != null) {
            height += bigOpSpacing5 + fMax + boxChangeWidth.getHeight() + boxChangeWidth.getDepth();
        }
        verticalBox.setHeight(height);
        verticalBox.setDepth(height2 - height);
        if (rowAtom == null) {
            return verticalBox;
        }
        HorizontalBox horizontalBox2 = new HorizontalBox(rowAtom.createBox(teXEnvironment));
        rowAtom.add(this.base);
        horizontalBox2.add(verticalBox);
        this.base = atom2;
        return horizontalBox2;
    }

    private static Box changeWidth(Box box, float f) {
        return (box == null || Math.abs(f - box.getWidth()) <= 1.0E-7f) ? box : new HorizontalBox(box, f, 2);
    }
}
