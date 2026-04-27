package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.BasicStroke;
import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Stroke;
import ru.noties.jlatexmath.awt.geom.AffineTransform;

public class GeoGebraLogoBox extends Box {
    private static final Color gray = new Color(102, 102, 102);
    private static final Color blue = new Color(153, 153, 255);
    private static final BasicStroke st = new BasicStroke(3.8f, 0, 0, 4.0f);

    @Override
    public int getLastFontId() {
        return 0;
    }

    public GeoGebraLogoBox(float f, float f2) {
        this.depth = 0.0f;
        this.height = f2;
        this.width = f;
        this.shift = 0.0f;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
        AffineTransform transform = graphics2D.getTransform();
        Color color = graphics2D.getColor();
        Stroke stroke = graphics2D.getStroke();
        float f3 = this.height;
        graphics2D.translate(((0.25f * f3) / 2.15f) + f, f2 - (f3 * 0.81395346f));
        graphics2D.setColor(gray);
        graphics2D.setStroke(st);
        float f4 = this.height;
        graphics2D.scale((f4 * 0.05f) / 2.15f, (f4 * 0.05f) / 2.15f);
        graphics2D.rotate(-0.4537856055185257d, 20.5d, 17.5d);
        graphics2D.drawArc(0, 0, 43, 32, 0, 360);
        graphics2D.rotate(0.4537856055185257d, 20.5d, 17.5d);
        graphics2D.setStroke(stroke);
        drawCircle(graphics2D, 16.0f, -5.0f);
        drawCircle(graphics2D, -1.0f, 7.0f);
        drawCircle(graphics2D, 5.0f, 28.0f);
        drawCircle(graphics2D, 27.0f, 24.0f);
        drawCircle(graphics2D, 36.0f, 3.0f);
        graphics2D.setStroke(stroke);
        graphics2D.setTransform(transform);
        graphics2D.setColor(color);
    }

    private static void drawCircle(Graphics2D graphics2D, float f, float f2) {
        graphics2D.setColor(blue);
        graphics2D.translate(f, f2);
        graphics2D.fillArc(0, 0, 8, 8, 0, 360);
        graphics2D.setColor(Color.BLACK);
        graphics2D.drawArc(0, 0, 8, 8, 0, 360);
        graphics2D.translate(-f, -f2);
    }
}
