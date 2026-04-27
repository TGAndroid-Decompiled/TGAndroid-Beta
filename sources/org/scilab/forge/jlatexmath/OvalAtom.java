package org.scilab.forge.jlatexmath;

public class OvalAtom extends FBoxAtom {
    public OvalAtom(Atom atom) {
        super(atom);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new OvalBox((FramedBox) super.createBox(teXEnvironment));
    }
}
