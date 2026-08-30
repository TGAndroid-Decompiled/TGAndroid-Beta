package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;
public class StrutBox extends Box {
    public StrutBox(float f10, float f11, float f12, float f13) {
        this.width = f10;
        this.height = f11;
        this.depth = f12;
        this.shift = f13;
    }

    @Override
    public int getLastFontId() {
        return -1;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f10, float f11) {
    }
}
