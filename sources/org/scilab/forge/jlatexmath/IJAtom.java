package org.scilab.forge.jlatexmath;
public class IJAtom extends Atom {
    private boolean upper;

    public IJAtom(boolean z10) {
        this.upper = z10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        char c3;
        char c6;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        if (this.upper) {
            c3 = 'I';
        } else {
            c3 = 'i';
        }
        CharBox charBox = new CharBox(teXFont.getChar(c3, "mathnormal", teXEnvironment.getStyle()));
        TeXFont teXFont2 = teXEnvironment.getTeXFont();
        if (this.upper) {
            c6 = 'J';
        } else {
            c6 = 'j';
        }
        CharBox charBox2 = new CharBox(teXFont2.getChar(c6, "mathnormal", teXEnvironment.getStyle()));
        HorizontalBox horizontalBox = new HorizontalBox(charBox);
        horizontalBox.add(new SpaceAtom(0, -0.065f, 0.0f, 0.0f).createBox(teXEnvironment));
        horizontalBox.add(charBox2);
        return horizontalBox;
    }
}
