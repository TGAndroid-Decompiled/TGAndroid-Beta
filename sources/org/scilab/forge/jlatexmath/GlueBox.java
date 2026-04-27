package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

public class GlueBox extends Box {
    protected float shrink;
    protected float stretch;

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
    }

    @Override
    public int getLastFontId() {
        return -1;
    }

    public GlueBox(float f, float f2, float f3) {
        this.width = f;
        this.stretch = f2;
        this.shrink = f3;
    }
}
