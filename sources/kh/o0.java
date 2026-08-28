package kh;

import android.graphics.Bitmap;
import android.graphics.Color;
import org.telegram.messenger.Utilities;
public abstract class o0 {
    public static float[] f15784a;

    public static int a(int i9, boolean z10) {
        float f10;
        if (f15784a == null) {
            f15784a = new float[3];
        }
        Color.colorToHSV(i9, f15784a);
        float[] fArr = f15784a;
        float f11 = fArr[2];
        if (z10) {
            f10 = -0.05f;
        } else {
            f10 = 0.07f;
        }
        fArr[2] = Utilities.clamp(f11 + f10, 0.85f, 0.15f);
        float[] fArr2 = f15784a;
        float f12 = fArr2[1];
        if (f12 > 0.1f && f12 <= 0.95f) {
            if (f12 <= 0.5f) {
                fArr2[1] = Utilities.clamp(f12 + 0.2f, 1.0f, 0.0f);
            } else if (f12 > 0.8f) {
                fArr2[1] = Utilities.clamp(f12 - 0.4f, 1.0f, 0.0f);
            }
        }
        return Color.HSVToColor(f15784a);
    }

    public static int[] b(Bitmap bitmap, boolean z10) {
        return new int[]{a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.1f)), z10), a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.9f)), z10)};
    }
}
