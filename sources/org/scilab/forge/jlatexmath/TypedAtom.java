package org.scilab.forge.jlatexmath;
public class TypedAtom extends Atom {
    private final Atom atom;
    private final int leftType;
    private final int rightType;

    public TypedAtom(int i9, int i10, Atom atom) {
        this.leftType = i9;
        this.rightType = i10;
        this.atom = atom;
        this.type_limits = atom.type_limits;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return this.atom.createBox(teXEnvironment);
    }

    public Atom getBase() {
        Atom atom = this.atom;
        atom.type_limits = this.type_limits;
        return atom;
    }

    @Override
    public int getLeftType() {
        return this.leftType;
    }

    @Override
    public int getRightType() {
        return this.rightType;
    }
}
