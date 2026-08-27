package org.scilab.forge.jlatexmath;

public class OgonekAtom extends Atom {
    private Atom base;

    public OgonekAtom(Atom atom) {
        this.base = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box horizontalBox;
        Box boxCreateBox = this.base.createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(boxCreateBox);
        Char r10 = teXEnvironment.getTeXFont().getChar("ogonek", teXEnvironment.getStyle());
        float italic = r10.getItalic();
        CharBox charBox = new CharBox(r10);
        if (Math.abs(italic) > 1.0E-7f) {
            horizontalBox = new HorizontalBox(new StrutBox(-italic, 0.0f, 0.0f, 0.0f));
            horizontalBox.add(charBox);
        } else {
            horizontalBox = charBox;
        }
        HorizontalBox horizontalBox2 = new HorizontalBox(horizontalBox, boxCreateBox.getWidth(), 1);
        verticalBox.add(new StrutBox(0.0f, -charBox.getHeight(), 0.0f, 0.0f));
        verticalBox.add(horizontalBox2);
        float depth = verticalBox.getDepth() + verticalBox.getHeight();
        verticalBox.setHeight(boxCreateBox.getHeight());
        verticalBox.setDepth(depth - boxCreateBox.getHeight());
        return verticalBox;
    }
}
