package org.scilab.forge.jlatexmath;

public class ScriptsAtom extends Atom {
    private static final int MAX_WRAP_DEPTH = 64;
    private static final SpaceAtom SCRIPT_SPACE = new SpaceAtom(3, 0.5f, 0.0f, 0.0f);
    private static int boxWrapDepth;
    private int align;
    private final Atom base;
    private final Atom subscript;
    private final Atom superscript;
    private final int wrapDepth;

    public ScriptsAtom(Atom atom, Atom atom2, Atom atom3) {
        this.align = 0;
        this.base = atom;
        this.subscript = atom2;
        this.superscript = atom3;
        int i = atom instanceof ScriptsAtom ? 1 + ((ScriptsAtom) atom).wrapDepth : 1;
        this.wrapDepth = i;
        if (i > 64) {
            throw new DepthLimitExceededException();
        }
    }

    public ScriptsAtom(Atom atom, Atom atom2, Atom atom3, boolean z) {
        this(atom, atom2, atom3);
        if (z) {
            return;
        }
        this.align = 1;
    }

    @Override
    public org.scilab.forge.jlatexmath.Box createBox(org.scilab.forge.jlatexmath.TeXEnvironment r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.ScriptsAtom.createBox(org.scilab.forge.jlatexmath.TeXEnvironment):org.scilab.forge.jlatexmath.Box");
    }

    @Override
    public int getLeftType() {
        return this.base.getLeftType();
    }

    @Override
    public int getRightType() {
        return this.base.getRightType();
    }
}
