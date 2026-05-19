package org.telegram.messenger.utils;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;

public abstract class RenderNodeEffects {
    private static RenderEffect saturationUpX3Effect;

    public static RenderEffect getSaturationX3RenderEffect() {
        if (saturationUpX3Effect == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(3.0f);
            saturationUpX3Effect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        }
        return saturationUpX3Effect;
    }
}
