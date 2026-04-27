package org.scilab.forge.jlatexmath;

public class EmptyAtom extends Atom {
    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
