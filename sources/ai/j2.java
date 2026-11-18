package ai;

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
public abstract class j2 {
    public static final Paint f1252a;
    public static final LinearGradient f1253b;
    public static final Matrix f1254c;
    public static final RectF d;
    public static int f1255e;
    public static int f1256f;
    public static final ColorFilter[][] f1257g;

    static {
        Paint paint = new Paint(1);
        f1252a = paint;
        Paint paint2 = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 16777215, -1, tileMode);
        f1253b = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-637534209, 872415231, 234881023, 654311423}, new float[]{0.0f, 0.4f, 0.75f, 1.0f}, tileMode);
        f1254c = new Matrix();
        d = new RectF();
        paint.setShader(linearGradient);
        paint2.setShader(linearGradient2);
        paint2.setStyle(Paint.Style.STROKE);
        f1255e = -16733772;
        f1256f = -14774554;
        f1257g = (ColorFilter[][]) Array.newInstance(ColorFilter.class, 2, 49);
    }

    public static void a(Canvas canvas, float f10, float f11, float f12, float f13, float f14, boolean z10, float f15, float f16) {
        float f17;
        int f18;
        if (f15 <= 0.01f) {
            return;
        }
        int round = Math.round(((((float) Math.sin(((SystemClock.uptimeMillis() / 1000.0d) * 0.9d) + 1.3d)) * 0.5f) + 0.5f) * 48.0f);
        ColorFilter[][] colorFilterArr = f1257g;
        ColorFilter colorFilter = colorFilterArr[z10 ? 1 : 0][round];
        if (colorFilter == null) {
            float f19 = round / 48.0f;
            if (z10) {
                f18 = s0.e(i0.a.f(f19, -14717953, -7447553));
            } else {
                f18 = i0.a.f(f19, f1255e, f1256f);
            }
            ColorFilter[] colorFilterArr2 = colorFilterArr[z10 ? 1 : 0];
            colorFilter = new PorterDuffColorFilter(f18, PorterDuff.Mode.SRC_IN);
            colorFilterArr2[round] = colorFilter;
        }
        Paint paint = f1252a;
        paint.setColorFilter(colorFilter);
        float f20 = f13 - f11;
        Matrix matrix = f1254c;
        matrix.setScale(1.0f, 0.65f * f20);
        matrix.postTranslate(0.0f, (f20 * 0.35f) + f11);
        f1253b.setLocalMatrix(matrix);
        float f21 = f15 * 255.0f;
        if (z10) {
            f17 = 0.26f;
        } else {
            f17 = 0.2f;
        }
        paint.setAlpha((int) (Math.min(1.0f, (f16 * 0.11f) + f17) * f21));
        RectF rectF = d;
        rectF.set(f10, f11, f12, f13);
        canvas.drawRoundRect(rectF, f14, f14, paint);
    }
}
