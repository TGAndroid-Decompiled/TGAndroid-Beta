package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
public abstract class dpd {
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
        path.cubicTo(gl.L(7.62f), gl.L(-0.5f), gl.L(5.807f), gl.L(-1.502f), gl.L(6.02f), gl.L(-1.386f));
        path.cubicTo(gl.L(4.814f), gl.L(-0.81f), gl.L(2.706f), gl.L(-0.133f), gl.L(3.6f), gl.L(-0.44f));
        path.cubicTo(gl.L(1.004f), gl.L(-0.206f), gl.L(-0.047f), gl.L(-0.32f), gl.L(0.247f), gl.L(-0.29f));
        path.cubicTo(gl.L(-0.334f), gl.L(-1.571f), 0.0f, gl.L(-1.155f), gl.L(-0.06f), gl.L(-1.154f));
        path.cubicTo(gl.L(1.083f), gl.L(-2.123f), gl.L(1.667f), gl.L(-3.667f), gl.L(1.453f), gl.L(-3.12f));
        path.cubicTo(gl.L(2.1f), gl.L(-4.793f), gl.L(1.24f), gl.L(-6.267f), gl.L(1.67f), gl.L(-5.53f));
        float f3 = -f;
        path.quadTo(0.0f, gl.L(2.187f) + f3, 0.0f, f3);
        path.close();
        path.offset(rectF.left, rectF.bottom);
    }
}
