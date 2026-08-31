package k7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y21;
public abstract class h6 {
    public static int a(y21 y21Var) {
        y21Var.getClass();
        return Math.max(1, (int) Math.ceil(0.5f * AndroidUtilities.density)) + (((int) Math.ceil(1.9f * AndroidUtilities.density)) * 2);
    }

    public static void b(Canvas canvas, Bitmap bitmap, int i10, float f10, float f11, int i11, int i12, Paint paint) {
        int min = Math.min(i10, bitmap.getWidth());
        int i13 = (int) f10;
        int i14 = (int) f11;
        canvas.drawBitmap(bitmap, new Rect(0, i11, min, i11 + i12), new Rect(i13, i14, min + i13, i12 + i14), paint);
    }
}
