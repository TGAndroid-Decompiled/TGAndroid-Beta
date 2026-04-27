package org.scilab.forge.jlatexmath;

public class BigDelimiterAtom extends Atom {
    public SymbolAtom delim;
    private int size;

    public BigDelimiterAtom(SymbolAtom symbolAtom, int i) {
        this.delim = symbolAtom;
        this.size = i;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreate = DelimiterFactory.create(this.delim, teXEnvironment, this.size);
        HorizontalBox horizontalBox = new HorizontalBox();
        float height = boxCreate.getHeight();
        boxCreate.setShift((((-(boxCreate.getDepth() + height)) / 2.0f) + height) - teXEnvironment.getTeXFont().getAxisHeight(teXEnvironment.getStyle()));
        horizontalBox.add(boxCreate);
        return horizontalBox;
    }
}
