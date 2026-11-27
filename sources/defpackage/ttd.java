package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
public abstract class ttd {
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
        path.cubicTo(hl.L(7.62f), hl.L(-0.5f), hl.L(5.807f), hl.L(-1.502f), hl.L(6.02f), hl.L(-1.386f));
        path.cubicTo(hl.L(4.814f), hl.L(-0.81f), hl.L(2.706f), hl.L(-0.133f), hl.L(3.6f), hl.L(-0.44f));
        path.cubicTo(hl.L(1.004f), hl.L(-0.206f), hl.L(-0.047f), hl.L(-0.32f), hl.L(0.247f), hl.L(-0.29f));
        path.cubicTo(hl.L(-0.334f), hl.L(-1.571f), 0.0f, hl.L(-1.155f), hl.L(-0.06f), hl.L(-1.154f));
        path.cubicTo(hl.L(1.083f), hl.L(-2.123f), hl.L(1.667f), hl.L(-3.667f), hl.L(1.453f), hl.L(-3.12f));
        path.cubicTo(hl.L(2.1f), hl.L(-4.793f), hl.L(1.24f), hl.L(-6.267f), hl.L(1.67f), hl.L(-5.53f));
        float f3 = -f;
        path.quadTo(0.0f, hl.L(2.187f) + f3, 0.0f, f3);
        path.close();
        path.offset(rectF.left, rectF.bottom);
    }
}
