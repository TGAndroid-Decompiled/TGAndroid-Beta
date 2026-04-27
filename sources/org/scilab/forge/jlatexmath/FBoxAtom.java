package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Color;

public class FBoxAtom extends Atom {
    public float INTERSPACE;
    protected final Atom base;
    protected Color bg;
    protected Color line;

    public FBoxAtom(Atom atom) {
        this.INTERSPACE = 0.65f;
        this.bg = null;
        this.line = null;
        if (atom == null) {
            this.base = new RowAtom();
        } else {
            this.base = atom;
            this.type = atom.type;
        }
    }

    public FBoxAtom(Atom atom, Color color, Color color2) {
        this(atom);
        this.bg = color;
        this.line = color2;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreateBox = this.base.createBox(teXEnvironment);
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        float factor = this.INTERSPACE * SpaceAtom.getFactor(0, teXEnvironment);
        if (this.bg == null) {
            return new FramedBox(boxCreateBox, defaultRuleThickness, factor);
        }
        teXEnvironment.isColored = true;
        return new FramedBox(boxCreateBox, defaultRuleThickness, factor, this.line, this.bg);
    }
}
