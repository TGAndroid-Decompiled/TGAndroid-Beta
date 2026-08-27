package org.scilab.forge.jlatexmath;

public class BigOperatorAtom extends Atom {
    protected Atom base;
    private boolean limits;
    private boolean limitsSet;
    private Atom over;
    private Atom under;

    public BigOperatorAtom(Atom atom, Atom atom2, Atom atom3) {
        this.limitsSet = false;
        this.limits = false;
        this.base = atom;
        this.under = atom2;
        this.over = atom3;
        this.type = 1;
    }

    private static Box changeWidth(Box box, float f10) {
        return (box == null || Math.abs(f10 - box.getWidth()) <= 1.0E-7f) ? box : new HorizontalBox(box, f10, 2);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        RowAtom rowAtom;
        Atom atom;
        int i10;
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
        boolean z10 = this.limitsSet;
        if ((z10 && !this.limits) || ((!z10 && style >= 2) || (i10 = (atom = this.base).type_limits) == 1 || (i10 == 0 && style >= 2))) {
            if (rowAtom == null) {
                return new ScriptsAtom(this.base, this.under, this.over).createBox(teXEnvironment);
            }
            rowAtom.add(new ScriptsAtom(this.base, this.under, this.over));
            Box boxCreateBox = rowAtom.createBox(teXEnvironment);
            rowAtom.getLastAtom();
            rowAtom.add(this.base);
            this.base = atom2;
            return boxCreateBox;
        }
        if ((atom instanceof SymbolAtom) && atom.type == 1) {
            Char r10 = teXFont.getChar(((SymbolAtom) atom).getName(), style);
            horizontalBox = this.base.createBox(teXEnvironment);
            italic = r10.getItalic();
        } else {
            horizontalBox = new HorizontalBox(atom == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom.createBox(teXEnvironment));
            italic = 0.0f;
        }
        Atom atom3 = this.over;
        Box boxCreateBox2 = atom3 != null ? atom3.createBox(teXEnvironment.supStyle()) : null;
        Atom atom4 = this.under;
        Box boxCreateBox3 = atom4 != null ? atom4.createBox(teXEnvironment.subStyle()) : null;
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
        float depth = verticalBox.getDepth() + verticalBox.getHeight();
        if (boxChangeWidth != null) {
            height += boxChangeWidth.getDepth() + boxChangeWidth.getHeight() + bigOpSpacing5 + fMax;
        }
        verticalBox.setHeight(height);
        verticalBox.setDepth(depth - height);
        if (rowAtom == null) {
            return verticalBox;
        }
        HorizontalBox horizontalBox2 = new HorizontalBox(rowAtom.createBox(teXEnvironment));
        rowAtom.add(this.base);
        horizontalBox2.add(verticalBox);
        this.base = atom2;
        return horizontalBox2;
    }

    public BigOperatorAtom(Atom atom, Atom atom2, Atom atom3, boolean z10) {
        this(atom, atom2, atom3);
        this.limits = z10;
        this.limitsSet = true;
    }
}
