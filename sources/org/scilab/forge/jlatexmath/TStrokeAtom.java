package org.scilab.forge.jlatexmath;
public class TStrokeAtom extends Atom {
    private boolean upper;

    public TStrokeAtom(boolean z4) {
        this.upper = z4;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        char c3;
        Char r02 = teXEnvironment.getTeXFont().getChar("bar", teXEnvironment.getStyle());
        float italic = r02.getItalic();
        TeXFont teXFont = teXEnvironment.getTeXFont();
        if (this.upper) {
            c3 = 'T';
        } else {
            c3 = 't';
        }
        CharBox charBox = new CharBox(teXFont.getChar(c3, "mathnormal", teXEnvironment.getStyle()));
        Box charBox2 = new CharBox(r02);
        if (Math.abs(italic) > 1.0E-7f) {
            Box horizontalBox = new HorizontalBox(new StrutBox(-italic, 0.0f, 0.0f, 0.0f));
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
