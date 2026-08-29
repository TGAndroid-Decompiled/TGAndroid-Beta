package g0;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import e0.i0;
public abstract class a {
    public static Paint a(Bitmap bitmap) {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        Paint paint = new Paint(1);
        paint.setShader(bitmapShader);
        paint.setFilterBitmap(true);
        return paint;
    }

    public static void b(Canvas canvas, i0 i0Var, int i10, Paint paint) {
        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i10 * 8, (float[]) i0Var.f5678b, 0, (float[]) i0Var.f5679c, 0, (int[]) i0Var.f5680e, 0, (short[]) i0Var.d, 0, i10 * 6, paint);
    }

    public static Object c(Bundle bundle) {
        return bundle.getParcelable("RESULT_DATA", Intent.class);
    }

    public static String d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void f(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }
}
