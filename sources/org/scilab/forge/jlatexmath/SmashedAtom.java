package org.scilab.forge.jlatexmath;

public class SmashedAtom extends Atom {
    private Atom at;
    private boolean d;
    private boolean h;

    public SmashedAtom(Atom atom, String str) {
        this.h = true;
        this.d = true;
        this.at = atom;
        if ("t".equals(str)) {
            this.d = false;
        } else if ("b".equals(str)) {
            this.h = false;
        }
    }

    public SmashedAtom(Atom atom) {
        this.h = true;
        this.d = true;
        this.at = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreateBox = this.at.createBox(teXEnvironment);
        if (this.h) {
            boxCreateBox.setHeight(0.0f);
        }
        if (this.d) {
            boxCreateBox.setDepth(0.0f);
        }
        return boxCreateBox;
    }
}
