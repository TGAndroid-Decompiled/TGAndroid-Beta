package di;

import android.graphics.Bitmap;
import android.graphics.Color;
import org.telegram.messenger.Utilities;
public abstract class n0 {
    public static float[] f7670a;

    public static int a(int i10, boolean z10) {
        float f7;
        if (f7670a == null) {
            f7670a = new float[3];
        }
        Color.colorToHSV(i10, f7670a);
        float[] fArr = f7670a;
        float f10 = fArr[2];
        if (z10) {
            f7 = -0.05f;
        } else {
            f7 = 0.07f;
        }
        fArr[2] = Utilities.clamp(f10 + f7, 0.85f, 0.15f);
        float[] fArr2 = f7670a;
        float f11 = fArr2[1];
        if (f11 > 0.1f && f11 <= 0.95f) {
            if (f11 <= 0.5f) {
                fArr2[1] = Utilities.clamp(f11 + 0.2f, 1.0f, 0.0f);
            } else if (f11 > 0.8f) {
                fArr2[1] = Utilities.clamp(f11 - 0.4f, 1.0f, 0.0f);
            }
        }
        return Color.HSVToColor(f7670a);
    }

    public static int[] b(Bitmap bitmap, boolean z10) {
        return new int[]{a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.1f)), z10), a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.9f)), z10)};
    }
}
