package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;
public class GlueBox extends Box {
    protected float shrink;
    protected float stretch;

    public GlueBox(float f7, float f10, float f11) {
        this.width = f7;
        this.stretch = f10;
        this.shrink = f11;
    }

    @Override
    public int getLastFontId() {
        return -1;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f7, float f10) {
    }
}
