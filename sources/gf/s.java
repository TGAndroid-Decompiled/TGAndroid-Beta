package gf;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

public abstract class s {

    public static final Rect f7056a = new Rect();

    static {
        new RectF();
    }

    public static void a(Canvas canvas, Drawable drawable, float f10, float f11, float f12) {
        float fDpf2 = f10 - AndroidUtilities.dpf2(36.0f);
        float fDpf3 = f11 - AndroidUtilities.dpf2(36.0f);
        float fDpf4 = f12 / AndroidUtilities.dpf2(72.0f);
        d(drawable, AndroidUtilities.dpf2(9.66f) + fDpf2, AndroidUtilities.dpf2(4.66f) + fDpf3, 53);
        canvas.save();
        canvas.scale(fDpf4, fDpf4, f10, f11);
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void b(Canvas canvas, Drawable drawable, float f10) {
        if (drawable == null || f10 == 0.0f) {
            return;
        }
        if (f10 == 1.0f) {
            drawable.draw(canvas);
            return;
        }
        canvas.save();
        canvas.scale(f10, f10, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void c(Rect rect, float f10, float f11, int i10, int i11, int i12) {
        int iRound;
        int iRound2;
        int i13 = i12 & 7;
        if (i13 != 3) {
            iRound = i13 != 5 ? Math.round(f10 - (i10 / 2.0f)) : Math.round(f10 - i10);
        } else {
            iRound = Math.round(f10);
        }
        int i14 = i12 & 112;
        if (i14 != 48) {
            iRound2 = i14 != 80 ? Math.round(f11 - (i11 / 2.0f)) : Math.round(f11 - i11);
        } else {
            iRound2 = Math.round(f11);
        }
        rect.set(iRound, iRound2, i10 + iRound, i11 + iRound2);
    }

    public static void d(Drawable drawable, float f10, float f11, int i10) {
        if (drawable == null) {
            return;
        }
        e(drawable, f10, f11, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), i10);
    }

    public static void e(Drawable drawable, float f10, float f11, int i10, int i11, int i12) {
        if (drawable != null) {
            Rect rect = f7056a;
            c(rect, f10, f11, i10, i11, i12);
            drawable.setBounds(rect);
        }
    }

    public static void f(ImageReceiver imageReceiver, float f10, float f11, int i10, int i11) {
        if (imageReceiver != null) {
            Rect rect = f7056a;
            c(rect, f10, f11, i10, i11, 17);
            imageReceiver.setImageCoords(rect);
        }
    }

    public static void g(NinePatchDrawable ninePatchDrawable, int i10, int i11, int i12, int i13) {
        Rect rect = f7056a;
        if (ninePatchDrawable.getPadding(rect)) {
            ninePatchDrawable.setBounds(i10 - rect.left, i11 - rect.top, i12 + rect.right, i13 + rect.bottom);
        } else {
            ninePatchDrawable.setBounds(i10, i11, i12, i13);
        }
    }

    public static void h(NinePatchDrawable ninePatchDrawable, Rect rect) {
        Rect rect2 = f7056a;
        if (ninePatchDrawable.getPadding(rect2)) {
            ninePatchDrawable.setBounds(rect.left - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        } else {
            ninePatchDrawable.setBounds(rect);
        }
    }
}
