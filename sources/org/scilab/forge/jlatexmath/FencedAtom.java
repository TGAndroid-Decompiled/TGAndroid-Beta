package org.scilab.forge.jlatexmath;

import java.util.List;
public class FencedAtom extends Atom {
    private static final int DELIMITER_FACTOR = 901;
    private static final float DELIMITER_SHORTFALL = 5.0f;
    private final Atom base;
    private SymbolAtom left;
    private final List<MiddleAtom> middle;
    private SymbolAtom right;

    public FencedAtom(Atom atom, SymbolAtom symbolAtom, SymbolAtom symbolAtom2) {
        this(atom, symbolAtom, null, symbolAtom2);
    }

    private static void center(Box box, float f7) {
        float height = box.getHeight();
        box.setShift((-(((box.getDepth() + height) / 2.0f) - height)) - f7);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXFont teXFont = teXEnvironment.getTeXFont();
        Box createBox = this.base.createBox(teXEnvironment);
        float axisHeight = teXFont.getAxisHeight(teXEnvironment.getStyle());
        float max = Math.max(createBox.getHeight() - axisHeight, createBox.getDepth() + axisHeight);
        float max2 = Math.max((max / 500.0f) * 901.0f, (max * 2.0f) - (SpaceAtom.getFactor(3, teXEnvironment) * 5.0f));
        HorizontalBox horizontalBox = new HorizontalBox();
        if (this.middle != null) {
            for (int i10 = 0; i10 < this.middle.size(); i10++) {
                MiddleAtom middleAtom = this.middle.get(i10);
                Atom atom = middleAtom.base;
                if (atom instanceof SymbolAtom) {
                    Box create = DelimiterFactory.create(((SymbolAtom) atom).getName(), teXEnvironment, max2);
                    center(create, axisHeight);
                    middleAtom.box = create;
                }
            }
            if (this.middle.size() != 0) {
                createBox = this.base.createBox(teXEnvironment);
            }
        }
        SymbolAtom symbolAtom = this.left;
        if (symbolAtom != null) {
            Box create2 = DelimiterFactory.create(symbolAtom.getName(), teXEnvironment, max2);
            center(create2, axisHeight);
            horizontalBox.add(create2);
        }
        Atom atom2 = this.base;
        if (!(atom2 instanceof SpaceAtom)) {
            horizontalBox.add(Glue.get(4, atom2.getLeftType(), teXEnvironment));
        }
        horizontalBox.add(createBox);
        Atom atom3 = this.base;
        if (!(atom3 instanceof SpaceAtom)) {
            horizontalBox.add(Glue.get(atom3.getRightType(), 5, teXEnvironment));
        }
        SymbolAtom symbolAtom2 = this.right;
        if (symbolAtom2 != null) {
            Box create3 = DelimiterFactory.create(symbolAtom2.getName(), teXEnvironment, max2);
            center(create3, axisHeight);
            horizontalBox.add(create3);
        }
        return horizontalBox;
    }

    @Override
    public int getLeftType() {
        return 7;
    }

    @Override
    public int getRightType() {
        return 7;
    }

    public FencedAtom(Atom atom, SymbolAtom symbolAtom, List<MiddleAtom> list, SymbolAtom symbolAtom2) {
        this.left = null;
        this.right = null;
        if (atom == null) {
            this.base = new RowAtom();
        } else {
            this.base = atom;
        }
        if (symbolAtom == null || !symbolAtom.getName().equals("normaldot")) {
            this.left = symbolAtom;
        }
        if (symbolAtom2 == null || !symbolAtom2.getName().equals("normaldot")) {
            this.right = symbolAtom2;
        }
        this.middle = list;
    }
}
