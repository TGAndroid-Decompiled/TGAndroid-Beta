package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a;
public final class nh8 {
    public static nh8 j;
    public final mh8 a;
    public final Paint b;
    public Paint c;
    public final Drawable d;
    public final Drawable e;
    public lh8 f;
    public lh8 g;
    public final lh8 h;
    public int i;

    public nh8() {
        mh8 mh8Var = new mh8(bkb.Bk, bkb.Ck, bkb.Dk, bkb.Ek, null);
        this.a = mh8Var;
        mh8 mh8Var2 = new mh8(bkb.Vk, bkb.Wk, -1, -1, null);
        this.b = mh8Var.f;
        this.e = a.b.getDrawable(2131232312).mutate();
        this.f = c(a.b.getDrawable(2131232367), mh8Var);
        this.h = c(a.b.getDrawable(2131232367), mh8Var2);
        this.g = c(a.b.getDrawable(2131232314), mh8Var);
        this.d = a.b.getDrawable(2131232312).mutate();
        mh8Var.a();
        b();
    }

    public static lh8 c(Drawable drawable, mh8 mh8Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        mh8Var.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        mh8Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, mh8Var.f);
        mh8Var.f.setXfermode(null);
        int[] iArr = mh8Var.l;
        ?? bitmapDrawable = new BitmapDrawable(a.b.getResources(), createBitmap);
        bitmapDrawable.b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static nh8 d() {
        nh8 nh8Var = j;
        if (nh8Var == null) {
            nh8 nh8Var2 = new nh8();
            j = nh8Var2;
            return nh8Var2;
        }
        return nh8Var;
    }

    public final lh8 a(lh8 lh8Var) {
        mh8 mh8Var = this.a;
        int[] iArr = mh8Var.l;
        int i = iArr[0];
        int[] iArr2 = lh8Var.a;
        if (i == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return lh8Var;
        }
        return c(lh8Var.b, mh8Var);
    }

    public final void b() {
        int i = bkb.y9;
        if (bkb.w0(null, i, false) != this.i) {
            this.i = bkb.w0(null, i, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.i, PorterDuff.Mode.MULTIPLY));
        }
        this.f = a(this.f);
        this.g = a(this.g);
    }

    public final Paint e() {
        if (na7.q1(y6c.t0).E3()) {
            Paint paint = this.c;
            if (paint == null) {
                paint = new Paint(1);
                this.c = paint;
            }
            paint.setColor(bkb.w0(null, bkb.Ei, false));
            return this.c;
        }
        return this.b;
    }

    public final void f(float f, float f2, int i, int i2) {
        this.a.d(0, f, 0, i, f2, i2);
    }
}
