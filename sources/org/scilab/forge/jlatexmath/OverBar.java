package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

public class OverBar extends VerticalBox {
    @Override
    public void add(int i, Box box) {
        super.add(i, box);
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
        super.draw(graphics2D, f, f2);
    }

    @Override
    public int getLastFontId() {
        return super.getLastFontId();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    public OverBar(Box box, float f, float f2) {
        add(new StrutBox(0.0f, f2, 0.0f, 0.0f));
        add(new HorizontalRule(f2, box.getWidth(), 0.0f));
        add(new StrutBox(0.0f, f, 0.0f, 0.0f));
        add(box);
    }
}
