package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

public class GlueBox extends Box {
    protected float shrink;
    protected float stretch;

    public GlueBox(float f10, float f11, float f12) {
        this.width = f10;
        this.stretch = f11;
        this.shrink = f12;
    }

    @Override
    public int getLastFontId() {
        return -1;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f10, float f11) {
    }
}
