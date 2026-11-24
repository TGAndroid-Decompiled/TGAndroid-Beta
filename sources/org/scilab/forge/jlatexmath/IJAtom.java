package org.scilab.forge.jlatexmath;
public class IJAtom extends Atom {
    private boolean upper;

    public IJAtom(boolean z) {
        this.upper = z;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        char c;
        char c2;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        if (this.upper) {
            c = 'I';
        } else {
            c = 'i';
        }
        CharBox charBox = new CharBox(teXFont.getChar(c, "mathnormal", teXEnvironment.getStyle()));
        TeXFont teXFont2 = teXEnvironment.getTeXFont();
        if (this.upper) {
            c2 = 'J';
        } else {
            c2 = 'j';
        }
        CharBox charBox2 = new CharBox(teXFont2.getChar(c2, "mathnormal", teXEnvironment.getStyle()));
        HorizontalBox horizontalBox = new HorizontalBox(charBox);
        horizontalBox.add(new SpaceAtom(0, -0.065f, 0.0f, 0.0f).createBox(teXEnvironment));
        horizontalBox.add(charBox2);
        return horizontalBox;
    }
}
