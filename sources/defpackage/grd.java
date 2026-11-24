package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
public abstract class grd {
    public static RectF a;

    public static void a(Path path, RectF rectF, float f) {
        if (path == null) {
            return;
        }
        if (a == null) {
            a = new RectF();
        }
        float f2 = 2.0f * f;
        path.rewind();
        a.set(0.0f, -rectF.height(), f2, (-rectF.height()) + f2);
        path.arcTo(a, 180.0f, 90.0f);
        a.set(rectF.width() - f2, -rectF.height(), rectF.width(), (-rectF.height()) + f2);
        path.arcTo(a, 270.0f, 90.0f);
        a.set(rectF.width() - f2, -f2, rectF.width(), 0.0f);
        path.arcTo(a, 0.0f, 90.0f);
        path.quadTo(f, 0.0f, f, 0.0f);
        path.cubicTo(gm.L(7.62f), gm.L(-0.5f), gm.L(5.807f), gm.L(-1.502f), gm.L(6.02f), gm.L(-1.386f));
        path.cubicTo(gm.L(4.814f), gm.L(-0.81f), gm.L(2.706f), gm.L(-0.133f), gm.L(3.6f), gm.L(-0.44f));
        path.cubicTo(gm.L(1.004f), gm.L(-0.206f), gm.L(-0.047f), gm.L(-0.32f), gm.L(0.247f), gm.L(-0.29f));
        path.cubicTo(gm.L(-0.334f), gm.L(-1.571f), 0.0f, gm.L(-1.155f), gm.L(-0.06f), gm.L(-1.154f));
        path.cubicTo(gm.L(1.083f), gm.L(-2.123f), gm.L(1.667f), gm.L(-3.667f), gm.L(1.453f), gm.L(-3.12f));
        path.cubicTo(gm.L(2.1f), gm.L(-4.793f), gm.L(1.24f), gm.L(-6.267f), gm.L(1.67f), gm.L(-5.53f));
        float f3 = -f;
        path.quadTo(0.0f, gm.L(2.187f) + f3, 0.0f, f3);
        path.close();
        path.offset(rectF.left, rectF.bottom);
    }
}
