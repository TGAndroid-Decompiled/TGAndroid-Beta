package org.scilab.forge.jlatexmath;

public class GraphicsAtom extends Atom {
    private Atom base;
    private int h;

    private int f19589w;
    private boolean first = true;
    private int interp = -1;

    public GraphicsAtom(String str, String str2) {
        draw();
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return null;
    }

    public void draw() {
    }
}
