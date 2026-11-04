package org.scilab.forge.jlatexmath;
public class IJAtom extends Atom {
    private boolean upper;

    public IJAtom(boolean z10) {
        this.upper = z10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        char c2;
        char c10;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        if (this.upper) {
            c2 = 'I';
        } else {
            c2 = 'i';
        }
        CharBox charBox = new CharBox(teXFont.getChar(c2, "mathnormal", teXEnvironment.getStyle()));
        TeXFont teXFont2 = teXEnvironment.getTeXFont();
        if (this.upper) {
            c10 = 'J';
        } else {
            c10 = 'j';
        }
        CharBox charBox2 = new CharBox(teXFont2.getChar(c10, "mathnormal", teXEnvironment.getStyle()));
        HorizontalBox horizontalBox = new HorizontalBox(charBox);
        horizontalBox.add(new SpaceAtom(0, -0.065f, 0.0f, 0.0f).createBox(teXEnvironment));
        horizontalBox.add(charBox2);
        return horizontalBox;
    }
}
