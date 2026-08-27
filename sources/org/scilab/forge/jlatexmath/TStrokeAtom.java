package org.scilab.forge.jlatexmath;

public class TStrokeAtom extends Atom {
    private boolean upper;

    public TStrokeAtom(boolean z10) {
        this.upper = z10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Char r10 = teXEnvironment.getTeXFont().getChar("bar", teXEnvironment.getStyle());
        float italic = r10.getItalic();
        CharBox charBox = new CharBox(teXEnvironment.getTeXFont().getChar(this.upper ? 'T' : 't', "mathnormal", teXEnvironment.getStyle()));
        Box charBox2 = new CharBox(r10);
        if (Math.abs(italic) > 1.0E-7f) {
            HorizontalBox horizontalBox = new HorizontalBox(new StrutBox(-italic, 0.0f, 0.0f, 0.0f));
            horizontalBox.add(charBox2);
            charBox2 = horizontalBox;
        }
        HorizontalBox horizontalBox2 = new HorizontalBox(charBox2, charBox.getWidth(), 2);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(charBox);
        verticalBox.add(new StrutBox(0.0f, charBox.getHeight() * (-0.5f), 0.0f, 0.0f));
        verticalBox.add(horizontalBox2);
        return verticalBox;
    }
}
