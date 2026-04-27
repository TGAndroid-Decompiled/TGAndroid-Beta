package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

public class StrutBox extends Box {
    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
    }

    @Override
    public int getLastFontId() {
        return -1;
    }

    public StrutBox(float f, float f2, float f3, float f4) {
        this.width = f;
        this.height = f2;
        this.depth = f3;
        this.shift = f4;
    }
}
