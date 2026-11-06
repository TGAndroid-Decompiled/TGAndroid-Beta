package bg;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import org.telegram.messenger.ImageReceiver;
public abstract class s {
    public static final Rect f3370a = new Rect();

    static {
        new Rect();
        new RectF();
    }

    public static void a(Canvas canvas, Drawable drawable, float f10, float f11, float f12) {
        float N = f12 / org.telegram.messenger.g0.N(72.0f);
        d(drawable, org.telegram.messenger.g0.N(9.66f) + (f10 - org.telegram.messenger.g0.N(36.0f)), org.telegram.messenger.g0.N(4.66f) + (f11 - org.telegram.messenger.g0.N(36.0f)), 53);
        canvas.save();
        canvas.scale(N, N, f10, f11);
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void b(Canvas canvas, Drawable drawable, float f10) {
        if (drawable != null && f10 != 0.0f) {
            if (f10 == 1.0f) {
                drawable.draw(canvas);
                return;
            }
            canvas.save();
            canvas.scale(f10, f10, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public static void c(Rect rect, float f10, float f11, int i7, int i10, int i11) {
        int round;
        int round2;
        int i12 = i11 & 7;
        if (i12 != 3) {
            if (i12 != 5) {
                round = Math.round(f10 - (i7 / 2.0f));
            } else {
                round = Math.round(f10 - i7);
            }
        } else {
            round = Math.round(f10);
        }
        int i13 = i11 & 112;
        if (i13 != 48) {
            if (i13 != 80) {
                round2 = Math.round(f11 - (i10 / 2.0f));
            } else {
                round2 = Math.round(f11 - i10);
            }
        } else {
            round2 = Math.round(f11);
        }
        rect.set(round, round2, i7 + round, i10 + round2);
    }

    public static void d(Drawable drawable, float f10, float f11, int i7) {
        if (drawable == null) {
            return;
        }
        e(drawable, f10, f11, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), i7);
    }

    public static void e(Drawable drawable, float f10, float f11, int i7, int i10, int i11) {
        if (drawable != null) {
            Rect rect = f3370a;
            c(rect, f10, f11, i7, i10, i11);
            drawable.setBounds(rect);
        }
    }

    public static void f(ImageReceiver imageReceiver, float f10, float f11, int i7, int i10) {
        if (imageReceiver != null) {
            Rect rect = f3370a;
            c(rect, f10, f11, i7, i10, 17);
            imageReceiver.z0(rect);
        }
    }

    public static void g(Drawable drawable, int i7, int i10, int i11, int i12) {
        Rect rect = f3370a;
        if (drawable.getPadding(rect)) {
            drawable.setBounds(i7 - rect.left, i10 - rect.top, i11 + rect.right, i12 + rect.bottom);
        } else {
            drawable.setBounds(i7, i10, i11, i12);
        }
    }

    public static void h(NinePatchDrawable ninePatchDrawable, Rect rect) {
        Rect rect2 = f3370a;
        if (ninePatchDrawable.getPadding(rect2)) {
            ninePatchDrawable.setBounds(rect.left - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        } else {
            ninePatchDrawable.setBounds(rect);
        }
    }
}
