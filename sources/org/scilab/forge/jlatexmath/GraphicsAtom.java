package org.scilab.forge.jlatexmath;

public class GraphicsAtom extends Atom {
    private Atom base;
    private int h;
    private int w;
    private boolean first = true;
    private int interp = -1;

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return null;
    }

    public void draw() {
    }

    public GraphicsAtom(String str, String str2) {
        draw();
    }
}
