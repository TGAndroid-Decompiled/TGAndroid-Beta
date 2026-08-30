package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Color;
public class FBoxAtom extends Atom {
    public float INTERSPACE;
    protected final Atom base;
    protected Color f16633bg;
    protected Color line;

    public FBoxAtom(Atom atom) {
        this.INTERSPACE = 0.65f;
        this.f16633bg = null;
        this.line = null;
        if (atom == null) {
            this.base = new RowAtom();
            return;
        }
        this.base = atom;
        this.type = atom.type;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.base.createBox(teXEnvironment);
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        float factor = SpaceAtom.getFactor(0, teXEnvironment) * this.INTERSPACE;
        Color color = this.f16633bg;
        if (color == null) {
            return new FramedBox(createBox, defaultRuleThickness, factor);
        }
        teXEnvironment.isColored = true;
        return new FramedBox(createBox, defaultRuleThickness, factor, this.line, color);
    }

    public FBoxAtom(Atom atom, Color color, Color color2) {
        this(atom);
        this.f16633bg = color;
        this.line = color2;
    }
}
