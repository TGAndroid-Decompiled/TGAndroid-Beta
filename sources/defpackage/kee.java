package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import org.telegram.messenger.Utilities;
public abstract class kee {
    public static float[] a;

    public static int a(int i, boolean z) {
        float f;
        float[] fArr = a;
        if (fArr == null) {
            fArr = new float[3];
            a = fArr;
        }
        Color.colorToHSV(i, fArr);
        float[] fArr2 = a;
        float f2 = fArr2[2];
        if (z) {
            f = -0.05f;
        } else {
            f = 0.07f;
        }
        fArr2[2] = Utilities.i(f2 + f, 0.85f, 0.15f);
        float[] fArr3 = a;
        float f3 = fArr3[1];
        if (f3 > 0.1f && f3 <= 0.95f) {
            if (f3 <= 0.5f) {
                fArr3[1] = Utilities.i(f3 + 0.2f, 1.0f, 0.0f);
            } else if (f3 > 0.8f) {
                fArr3[1] = Utilities.i(f3 - 0.4f, 1.0f, 0.0f);
            }
        }
        return Color.HSVToColor(a);
    }

    public static int[] b(Bitmap bitmap, boolean z) {
        return new int[]{a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.1f)), z), a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.9f)), z)};
    }
}
