package org.scilab.forge.jlatexmath;

import a9.p;
import ru.noties.jlatexmath.awt.BasicStroke;
import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Stroke;
import ru.noties.jlatexmath.awt.geom.AffineTransform;

public class GeoGebraLogoBox extends Box {
    private static final Color gray = new Color(102, 102, 102);
    private static final Color blue = new Color(153, 153, 255);
    private static final BasicStroke st = new BasicStroke(3.8f, 0, 0, 4.0f);

    public GeoGebraLogoBox(float f10, float f11) {
        this.depth = 0.0f;
        this.height = f11;
        this.width = f10;
        this.shift = 0.0f;
    }

    private static void drawCircle(Graphics2D graphics2D, float f10, float f11) {
        graphics2D.setColor(blue);
        graphics2D.translate(f10, f11);
        graphics2D.fillArc(0, 0, 8, 8, 0, 360);
        graphics2D.setColor(Color.BLACK);
        graphics2D.drawArc(0, 0, 8, 8, 0, 360);
        graphics2D.translate(-f10, -f11);
    }

    @Override
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        AffineTransform transform = graphics2D.getTransform();
        Color color = graphics2D.getColor();
        Stroke stroke = graphics2D.getStroke();
        float f12 = this.height;
        graphics2D.translate(p.d(f12, 0.25f, 2.15f, f10), f11 - (f12 * 0.81395346f));
        graphics2D.setColor(gray);
        graphics2D.setStroke(st);
        float f13 = this.height;
        graphics2D.scale((f13 * 0.05f) / 2.15f, (f13 * 0.05f) / 2.15f);
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

    @Override
    public int getLastFontId() {
        return 0;
    }
}
