package org.scilab.forge.jlatexmath;

import java.util.List;

public class FencedAtom extends Atom {
    private static final int DELIMITER_FACTOR = 901;
    private static final float DELIMITER_SHORTFALL = 5.0f;
    private final Atom base;
    private SymbolAtom left;
    private final List<MiddleAtom> middle;
    private SymbolAtom right;

    @Override
    public int getLeftType() {
        return 7;
    }

    @Override
    public int getRightType() {
        return 7;
    }

    public FencedAtom(Atom atom, SymbolAtom symbolAtom, SymbolAtom symbolAtom2) {
        this(atom, symbolAtom, null, symbolAtom2);
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

    private static void center(Box box, float f) {
        float height = box.getHeight();
        box.setShift((-(((box.getDepth() + height) / 2.0f) - height)) - f);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXFont teXFont = teXEnvironment.getTeXFont();
        Box boxCreateBox = this.base.createBox(teXEnvironment);
        float factor = SpaceAtom.getFactor(3, teXEnvironment) * 5.0f;
        float axisHeight = teXFont.getAxisHeight(teXEnvironment.getStyle());
        float fMax = Math.max(boxCreateBox.getHeight() - axisHeight, boxCreateBox.getDepth() + axisHeight);
        float fMax2 = Math.max((fMax / 500.0f) * 901.0f, (fMax * 2.0f) - factor);
        HorizontalBox horizontalBox = new HorizontalBox();
        if (this.middle != null) {
            for (int i = 0; i < this.middle.size(); i++) {
                MiddleAtom middleAtom = this.middle.get(i);
                Atom atom = middleAtom.base;
                if (atom instanceof SymbolAtom) {
                    Box boxCreate = DelimiterFactory.create(((SymbolAtom) atom).getName(), teXEnvironment, fMax2);
                    center(boxCreate, axisHeight);
                    middleAtom.box = boxCreate;
                }
            }
            if (this.middle.size() != 0) {
                boxCreateBox = this.base.createBox(teXEnvironment);
            }
        }
        SymbolAtom symbolAtom = this.left;
        if (symbolAtom != null) {
            Box boxCreate2 = DelimiterFactory.create(symbolAtom.getName(), teXEnvironment, fMax2);
            center(boxCreate2, axisHeight);
            horizontalBox.add(boxCreate2);
        }
        Atom atom2 = this.base;
        if (!(atom2 instanceof SpaceAtom)) {
            horizontalBox.add(Glue.get(4, atom2.getLeftType(), teXEnvironment));
        }
        horizontalBox.add(boxCreateBox);
        Atom atom3 = this.base;
        if (!(atom3 instanceof SpaceAtom)) {
            horizontalBox.add(Glue.get(atom3.getRightType(), 5, teXEnvironment));
        }
        SymbolAtom symbolAtom2 = this.right;
        if (symbolAtom2 != null) {
            Box boxCreate3 = DelimiterFactory.create(symbolAtom2.getName(), teXEnvironment, fMax2);
            center(boxCreate3, axisHeight);
            horizontalBox.add(boxCreate3);
        }
        return horizontalBox;
    }
}
