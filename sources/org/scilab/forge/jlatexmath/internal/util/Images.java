package org.scilab.forge.jlatexmath.internal.util;

import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.image.BufferedImage;
public final class Images {
    public static double DISTANCE_THRESHOLD = 40.0d;

    private Images() {
    }

    public static double distance(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        if (bufferedImage.getWidth() == bufferedImage2.getWidth() && bufferedImage.getHeight() == bufferedImage2.getHeight()) {
            int width = bufferedImage.getWidth();
            int height = bufferedImage.getHeight();
            double d = 0.0d;
            for (int i10 = 0; i10 < height; i10++) {
                for (int i11 = 0; i11 < width; i11++) {
                    Color color = new Color(bufferedImage.getRGB(i11, i10));
                    Color color2 = new Color(bufferedImage2.getRGB(i11, i10));
                    d += sqr(color.getRed() - color2.getRed()) + sqr(color.getBlue() - color2.getBlue()) + sqr(color.getGreen() - color2.getGreen()) + sqr(color.getAlpha() - color2.getAlpha());
                }
            }
            return Math.sqrt((d / height) / width);
        }
        return -1.0d;
    }

    private static double sqr(double d) {
        return d * d;
    }
}
