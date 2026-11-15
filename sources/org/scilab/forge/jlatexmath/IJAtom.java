package org.scilab.forge.jlatexmath;
public class IJAtom extends Atom {
    private boolean upper;

    public IJAtom(boolean z10) {
        this.upper = z10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        char c10;
        char c11;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        if (this.upper) {
            c10 = 'I';
        } else {
            c10 = 'i';
        }
        CharBox charBox = new CharBox(teXFont.getChar(c10, "mathnormal", teXEnvironment.getStyle()));
        TeXFont teXFont2 = teXEnvironment.getTeXFont();
        if (this.upper) {
            c11 = 'J';
        } else {
            c11 = 'j';
        }
        CharBox charBox2 = new CharBox(teXFont2.getChar(c11, "mathnormal", teXEnvironment.getStyle()));
        HorizontalBox horizontalBox = new HorizontalBox(charBox);
        horizontalBox.add(new SpaceAtom(0, -0.065f, 0.0f, 0.0f).createBox(teXEnvironment));
        horizontalBox.add(charBox2);
        return horizontalBox;
    }
}
