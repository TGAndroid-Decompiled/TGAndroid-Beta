package org.telegram.messenger.utils;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;

public abstract class RenderNodeEffects {
    private static RenderEffect saturationUpX4Effect;

    public static RenderEffect getSaturationX4RenderEffect() {
        if (saturationUpX4Effect == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(4.0f);
            saturationUpX4Effect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        }
        return saturationUpX4Effect;
    }
}
