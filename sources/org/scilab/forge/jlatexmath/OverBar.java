package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;
public class OverBar extends VerticalBox {
    public OverBar(Box box, float f7, float f10) {
        add(new StrutBox(0.0f, f10, 0.0f, 0.0f));
        add(new HorizontalRule(f10, box.getWidth(), 0.0f));
        add(new StrutBox(0.0f, f7, 0.0f, 0.0f));
        add(box);
    }

    @Override
    public void add(int i10, Box box) {
        super.add(i10, box);
    }

    @Override
    public void draw(Graphics2D graphics2D, float f7, float f10) {
        super.draw(graphics2D, f7, f10);
    }

    @Override
    public int getLastFontId() {
        return super.getLastFontId();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }
}
