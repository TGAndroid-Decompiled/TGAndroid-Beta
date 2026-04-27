package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Component;
import ru.noties.jlatexmath.awt.Graphics;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Insets;
import ru.noties.jlatexmath.awt.RenderingHints;
import ru.noties.jlatexmath.awt.geom.AffineTransform;

public class TeXIcon {
    private static final Color defaultColor = new Color(0, 0, 0);
    public static float defaultSize = -1.0f;
    public static float magFactor = 0.0f;
    private Box box;
    private final float size;
    private Insets insets = new Insets(0, 0, 0, 0);
    private Color fg = null;
    public boolean isColored = false;

    protected TeXIcon(Box box, float f, boolean z) {
        this.box = box;
        float f2 = defaultSize;
        f = f2 != -1.0f ? f2 : f;
        float f3 = magFactor;
        if (f3 != 0.0f) {
            this.size = Math.abs(f3) * f;
        } else {
            this.size = f;
        }
        if (z) {
            return;
        }
        Insets insets = this.insets;
        int i = (int) (f * 0.18f);
        insets.top += i;
        insets.bottom += i;
        insets.left += i;
        insets.right += i;
    }

    public void setForeground(Color color) {
        this.fg = color;
    }

    public void setInsets(Insets insets, boolean z) {
        this.insets = insets;
        if (z) {
            return;
        }
        int i = insets.top;
        float f = this.size;
        insets.top = i + ((int) (f * 0.18f));
        insets.bottom += (int) (f * 0.18f);
        insets.left += (int) (f * 0.18f);
        insets.right += (int) (f * 0.18f);
    }

    public void setInsets(Insets insets) {
        setInsets(insets, false);
    }

    public int getIconHeight() {
        return ((int) ((this.box.getHeight() * this.size) + 0.99d + this.insets.top)) + ((int) ((this.box.getDepth() * this.size) + 0.99d + this.insets.bottom));
    }

    public int getIconDepth() {
        return (int) ((this.box.getDepth() * this.size) + 0.99d + this.insets.bottom);
    }

    public int getIconWidth() {
        double width = (this.box.getWidth() * this.size) + 0.99d;
        Insets insets = this.insets;
        return (int) (width + insets.left + insets.right);
    }

    public void paintIcon(Component component, Graphics graphics, int i, int i2) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.getRenderingHints();
        AffineTransform transform = graphics2D.getTransform();
        Color color = graphics2D.getColor();
        graphics2D.setRenderingHint(null, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(null, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(null, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        float f = this.size;
        graphics2D.scale(f, f);
        Color color2 = this.fg;
        if (color2 != null) {
            graphics2D.setColor(color2);
        } else if (component != null) {
            graphics2D.setColor(component.getForeground());
        } else {
            graphics2D.setColor(defaultColor);
        }
        Box box = this.box;
        float f2 = i + this.insets.left;
        float f3 = this.size;
        box.draw(graphics2D, f2 / f3, ((i2 + r2.top) / f3) + box.getHeight());
        graphics2D.setRenderingHints(null);
        graphics2D.setTransform(transform);
        graphics2D.setColor(color);
    }
}
