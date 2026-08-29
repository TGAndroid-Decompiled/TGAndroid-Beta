package jf;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
public abstract class m0 {
    public static RenderEffect f11656a;

    public static RenderEffect a() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.125f);
        return RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
    }

    public static RenderEffect b() {
        if (f11656a == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(3.0f);
            f11656a = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        }
        return f11656a;
    }
}
