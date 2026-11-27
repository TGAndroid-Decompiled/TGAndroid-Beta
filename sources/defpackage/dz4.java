package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import java.lang.reflect.Array;
public abstract class dz4 {
    public static final Paint a;
    public static final LinearGradient b;
    public static final Matrix c;
    public static final RectF d;
    public static int e;
    public static int f;
    public static final ColorFilter[][] g;

    static {
        Paint paint = new Paint(1);
        a = paint;
        Paint paint2 = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 16777215, -1, tileMode);
        b = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-637534209, 872415231, 234881023, 654311423}, new float[]{0.0f, 0.4f, 0.75f, 1.0f}, tileMode);
        c = new Matrix();
        d = new RectF();
        paint.setShader(linearGradient);
        paint2.setShader(linearGradient2);
        paint2.setStyle(Paint.Style.STROKE);
        e = -16733772;
        f = -14774554;
        g = (ColorFilter[][]) Array.newInstance(ColorFilter.class, 2, 49);
    }

    public static void a(Canvas canvas, float f2, float f3, float f4, float f5, float f6, boolean z, float f7, float f8) {
        float f9;
        int f10;
        if (f7 <= 0.01f) {
            return;
        }
        int round = Math.round(((((float) Math.sin(((SystemClock.uptimeMillis() / 1000.0d) * 0.9d) + 1.3d)) * 0.5f) + 0.5f) * 48.0f);
        ColorFilter[][] colorFilterArr = g;
        ColorFilter colorFilter = colorFilterArr[z ? 1 : 0][round];
        if (colorFilter == null) {
            float f11 = round / 48.0f;
            if (z) {
                f10 = gn3.e(vm2.f(f11, -14717953, -7447553));
            } else {
                f10 = vm2.f(f11, e, f);
            }
            ColorFilter[] colorFilterArr2 = colorFilterArr[z ? 1 : 0];
            colorFilter = new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN);
            colorFilterArr2[round] = colorFilter;
        }
        Paint paint = a;
        paint.setColorFilter(colorFilter);
        float f12 = f5 - f3;
        Matrix matrix = c;
        matrix.setScale(1.0f, 0.65f * f12);
        matrix.postTranslate(0.0f, (f12 * 0.35f) + f3);
        b.setLocalMatrix(matrix);
        float f13 = f7 * 255.0f;
        if (z) {
            f9 = 0.26f;
        } else {
            f9 = 0.2f;
        }
        paint.setAlpha((int) (Math.min(1.0f, (f8 * 0.11f) + f9) * f13));
        RectF rectF = d;
        rectF.set(f2, f3, f4, f5);
        canvas.drawRoundRect(rectF, f6, f6, paint);
    }
}
