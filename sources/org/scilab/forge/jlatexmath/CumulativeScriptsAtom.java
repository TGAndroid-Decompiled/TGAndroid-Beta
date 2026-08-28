package org.scilab.forge.jlatexmath;
public class CumulativeScriptsAtom extends Atom {
    private Atom base;
    private RowAtom sub;
    private RowAtom sup;

    public CumulativeScriptsAtom(Atom atom, Atom atom2, Atom atom3) {
        if (atom instanceof CumulativeScriptsAtom) {
            CumulativeScriptsAtom cumulativeScriptsAtom = (CumulativeScriptsAtom) atom;
            this.base = cumulativeScriptsAtom.base;
            cumulativeScriptsAtom.sup.add(atom3);
            cumulativeScriptsAtom.sub.add(atom2);
            this.sup = cumulativeScriptsAtom.sup;
            this.sub = cumulativeScriptsAtom.sub;
            return;
        }
        if (atom == null) {
            this.base = new PhantomAtom(new CharAtom('M', "mathnormal"), false, true, true);
        } else {
            this.base = atom;
        }
        this.sup = new RowAtom(atom3);
        this.sub = new RowAtom(atom2);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new ScriptsAtom(this.base, this.sub, this.sup).createBox(teXEnvironment);
    }
}
