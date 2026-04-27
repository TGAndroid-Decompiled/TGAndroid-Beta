package org.scilab.forge.jlatexmath;

public class ReflectAtom extends Atom {
    private Atom base;

    public ReflectAtom(Atom atom) {
        this.type = atom.type;
        this.base = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new ReflectBox(this.base.createBox(teXEnvironment));
    }
}
