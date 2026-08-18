package org.scilab.forge.jlatexmath;

public class CedillaAtom extends Atom {
    private Atom base;

    public CedillaAtom(Atom atom) {
        this.base = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreateBox = this.base.createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(boxCreateBox);
        Char r2 = teXEnvironment.getTeXFont().getChar("jlatexmathcedilla", teXEnvironment.getStyle());
        float italic = r2.getItalic();
        Box charBox = new CharBox(r2);
        if (Math.abs(italic) > 1.0E-7f) {
            HorizontalBox horizontalBox = new HorizontalBox(new StrutBox(-italic, 0.0f, 0.0f, 0.0f));
            horizontalBox.add(charBox);
            charBox = horizontalBox;
        }
        HorizontalBox horizontalBox2 = new HorizontalBox(charBox, boxCreateBox.getWidth(), 2);
        verticalBox.add(new StrutBox(0.0f, -(SpaceAtom.getFactor(5, teXEnvironment) * 0.4f), 0.0f, 0.0f));
        verticalBox.add(horizontalBox2);
        float height = verticalBox.getHeight() + verticalBox.getDepth();
        verticalBox.setHeight(boxCreateBox.getHeight());
        verticalBox.setDepth(height - boxCreateBox.getHeight());
        return verticalBox;
    }
}
