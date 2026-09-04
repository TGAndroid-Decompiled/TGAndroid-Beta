package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.font.TextLayout;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;
public class JavaFontRenderingBox extends Box {
    private static Font font = new Font("Serif", 0, 10);
    private float size;
    private TextLayout text;

    public JavaFontRenderingBox(String str, int i10, float f7, Font font2, boolean z10) {
        this.size = f7;
        TextLayout textLayout = new TextLayout(str, font2.deriveFont(i10), null);
        this.text = textLayout;
        Rectangle2D bounds = textLayout.getBounds();
        this.height = ((-bounds.getY()) * f7) / 10.0f;
        this.depth = ((bounds.getHeight() * f7) / 10.0f) - this.height;
        this.width = (((bounds.getX() + bounds.getWidth()) + 0.4f) * f7) / 10.0f;
    }

    public static void setFont(String str) {
        font = new Font(str, 0, 10);
    }

    @Override
    public void draw(Graphics2D graphics2D, float f7, float f10) {
        drawDebug(graphics2D, f7, f10);
        graphics2D.translate(f7, f10);
        float f11 = this.size;
        graphics2D.scale(f11 * 0.1d, f11 * 0.1d);
        this.text.draw(graphics2D, 0, 0);
        float f12 = this.size;
        graphics2D.scale(10.0f / f12, 10.0f / f12);
        graphics2D.translate(-f7, -f10);
    }

    @Override
    public int getLastFontId() {
        return 0;
    }

    public JavaFontRenderingBox(String str, int i10, float f7) {
        this(str, i10, f7, font, true);
    }
}
