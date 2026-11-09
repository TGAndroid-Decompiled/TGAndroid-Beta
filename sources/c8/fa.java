package c8;

import android.graphics.Path;
import android.graphics.RectF;
public abstract class fa {
    public static RectF f5531a;

    public static void a(Path path, RectF rectF, float f10) {
        if (path == null) {
            return;
        }
        if (f5531a == null) {
            f5531a = new RectF();
        }
        float f11 = 2.0f * f10;
        path.rewind();
        f5531a.set(0.0f, -rectF.height(), f11, (-rectF.height()) + f11);
        path.arcTo(f5531a, 180.0f, 90.0f);
        f5531a.set(rectF.width() - f11, -rectF.height(), rectF.width(), (-rectF.height()) + f11);
        path.arcTo(f5531a, 270.0f, 90.0f);
        f5531a.set(rectF.width() - f11, -f11, rectF.width(), 0.0f);
        path.arcTo(f5531a, 0.0f, 90.0f);
        path.quadTo(f10, 0.0f, f10, 0.0f);
        path.cubicTo(org.telegram.messenger.g0.L(7.62f), org.telegram.messenger.g0.L(-0.5f), org.telegram.messenger.g0.L(5.807f), org.telegram.messenger.g0.L(-1.502f), org.telegram.messenger.g0.L(6.02f), org.telegram.messenger.g0.L(-1.386f));
        path.cubicTo(org.telegram.messenger.g0.L(4.814f), org.telegram.messenger.g0.L(-0.81f), org.telegram.messenger.g0.L(2.706f), org.telegram.messenger.g0.L(-0.133f), org.telegram.messenger.g0.L(3.6f), org.telegram.messenger.g0.L(-0.44f));
        path.cubicTo(org.telegram.messenger.g0.L(1.004f), org.telegram.messenger.g0.L(-0.206f), org.telegram.messenger.g0.L(-0.047f), org.telegram.messenger.g0.L(-0.32f), org.telegram.messenger.g0.L(0.247f), org.telegram.messenger.g0.L(-0.29f));
        path.cubicTo(org.telegram.messenger.g0.L(-0.334f), org.telegram.messenger.g0.L(-1.571f), 0.0f, org.telegram.messenger.g0.L(-1.155f), org.telegram.messenger.g0.L(-0.06f), org.telegram.messenger.g0.L(-1.154f));
        path.cubicTo(org.telegram.messenger.g0.L(1.083f), org.telegram.messenger.g0.L(-2.123f), org.telegram.messenger.g0.L(1.667f), org.telegram.messenger.g0.L(-3.667f), org.telegram.messenger.g0.L(1.453f), org.telegram.messenger.g0.L(-3.12f));
        path.cubicTo(org.telegram.messenger.g0.L(2.1f), org.telegram.messenger.g0.L(-4.793f), org.telegram.messenger.g0.L(1.24f), org.telegram.messenger.g0.L(-6.267f), org.telegram.messenger.g0.L(1.67f), org.telegram.messenger.g0.L(-5.53f));
        float f12 = -f10;
        path.quadTo(0.0f, org.telegram.messenger.g0.L(2.187f) + f12, 0.0f, f12);
        path.close();
        path.offset(rectF.left, rectF.bottom);
    }
}
