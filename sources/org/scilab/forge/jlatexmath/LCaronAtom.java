package org.scilab.forge.jlatexmath;
public class LCaronAtom extends Atom {
    private boolean upper;

    public LCaronAtom(boolean z10) {
        this.upper = z10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        char c10;
        CharBox charBox = new CharBox(teXEnvironment.getTeXFont().getChar("textapos", teXEnvironment.getStyle()));
        TeXFont teXFont = teXEnvironment.getTeXFont();
        if (this.upper) {
            c10 = 'L';
        } else {
            c10 = 'l';
        }
        HorizontalBox horizontalBox = new HorizontalBox(new CharBox(teXFont.getChar(c10, "mathnormal", teXEnvironment.getStyle())));
        if (this.upper) {
            horizontalBox.add(new SpaceAtom(0, -0.3f, 0.0f, 0.0f).createBox(teXEnvironment));
        } else {
            horizontalBox.add(new SpaceAtom(0, -0.13f, 0.0f, 0.0f).createBox(teXEnvironment));
        }
        horizontalBox.add(charBox);
        return horizontalBox;
    }
}
