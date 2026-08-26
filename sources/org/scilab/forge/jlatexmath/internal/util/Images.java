package org.scilab.forge.jlatexmath.internal.util;

import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.image.BufferedImage;

public final class Images {
    public static double DISTANCE_THRESHOLD = 40.0d;

    private Images() {
    }

    public static double distance(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        if (bufferedImage.getWidth() != bufferedImage2.getWidth() || bufferedImage.getHeight() != bufferedImage2.getHeight()) {
            return -1.0d;
        }
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        double dSqr = 0.0d;
        for (int i = 0; i < height; i++) {
            for (int i2 = 0; i2 < width; i2++) {
                Color color = new Color(bufferedImage.getRGB(i2, i));
                Color color2 = new Color(bufferedImage2.getRGB(i2, i));
                dSqr += sqr(color.getRed() - color2.getRed()) + sqr(color.getBlue() - color2.getBlue()) + sqr(color.getGreen() - color2.getGreen()) + sqr(color.getAlpha() - color2.getAlpha());
            }
        }
        return Math.sqrt((dSqr / ((double) height)) / ((double) width));
    }

    private static double sqr(double d) {
        return d * d;
    }
}
