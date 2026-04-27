package org.scilab.forge.jlatexmath;

public class MiddleAtom extends Atom {
    public Atom base;
    public Box box = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);

    public MiddleAtom(Atom atom) {
        this.base = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return this.box;
    }
}
