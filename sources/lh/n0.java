package lh;

import android.graphics.Bitmap;
import android.graphics.Color;
import org.telegram.messenger.Utilities;

public abstract class n0 {

    public static float[] f16412a;

    public static int a(int i10, boolean z10) {
        if (f16412a == null) {
            f16412a = new float[3];
        }
        Color.colorToHSV(i10, f16412a);
        float[] fArr = f16412a;
        fArr[2] = Utilities.clamp(fArr[2] + (z10 ? -0.05f : 0.07f), 0.85f, 0.15f);
        float[] fArr2 = f16412a;
        float f10 = fArr2[1];
        if (f10 > 0.1f && f10 <= 0.95f) {
            if (f10 <= 0.5f) {
                fArr2[1] = Utilities.clamp(f10 + 0.2f, 1.0f, 0.0f);
            } else if (f10 > 0.8f) {
                fArr2[1] = Utilities.clamp(f10 - 0.4f, 1.0f, 0.0f);
            }
        }
        return Color.HSVToColor(f16412a);
    }

    public static int[] b(Bitmap bitmap, boolean z10) {
        return new int[]{a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.1f)), z10), a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.9f)), z10)};
    }
}
