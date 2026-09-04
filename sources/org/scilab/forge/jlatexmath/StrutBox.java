package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;
public class StrutBox extends Box {
    public StrutBox(float f7, float f10, float f11, float f12) {
        this.width = f7;
        this.height = f10;
        this.depth = f11;
        this.shift = f12;
    }

    @Override
    public int getLastFontId() {
        return -1;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f7, float f10) {
    }
}
