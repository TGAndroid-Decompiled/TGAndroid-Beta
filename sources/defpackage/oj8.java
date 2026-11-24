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
public final class oj8 {
    public static oj8 j;
    public final nj8 a;
    public final Paint b;
    public Paint c;
    public final Drawable d;
    public final Drawable e;
    public mj8 f;
    public mj8 g;
    public final mj8 h;
    public int i;

    public oj8() {
        nj8 nj8Var = new nj8(cmb.Bk, cmb.Ck, cmb.Dk, cmb.Ek, null);
        this.a = nj8Var;
        nj8 nj8Var2 = new nj8(cmb.Vk, cmb.Wk, -1, -1, null);
        this.b = nj8Var.f;
        this.e = a.b.getDrawable(2131232313).mutate();
        this.f = c(a.b.getDrawable(2131232368), nj8Var);
        this.h = c(a.b.getDrawable(2131232368), nj8Var2);
        this.g = c(a.b.getDrawable(2131232315), nj8Var);
        this.d = a.b.getDrawable(2131232313).mutate();
        nj8Var.a();
        b();
    }

    public static mj8 c(Drawable drawable, nj8 nj8Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        nj8Var.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        nj8Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, nj8Var.f);
        nj8Var.f.setXfermode(null);
        int[] iArr = nj8Var.l;
        ?? bitmapDrawable = new BitmapDrawable(a.b.getResources(), createBitmap);
        bitmapDrawable.b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static oj8 d() {
        oj8 oj8Var = j;
        if (oj8Var == null) {
            oj8 oj8Var2 = new oj8();
            j = oj8Var2;
            return oj8Var2;
        }
        return oj8Var;
    }

    public final mj8 a(mj8 mj8Var) {
        nj8 nj8Var = this.a;
        int[] iArr = nj8Var.l;
        int i = iArr[0];
        int[] iArr2 = mj8Var.a;
        if (i == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return mj8Var;
        }
        return c(mj8Var.b, nj8Var);
    }

    public final void b() {
        int i = cmb.y9;
        if (cmb.w0(null, i, false) != this.i) {
            this.i = cmb.w0(null, i, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.i, PorterDuff.Mode.MULTIPLY));
        }
        this.f = a(this.f);
        this.g = a(this.g);
    }

    public final Paint e() {
        if (oc7.r1(z8c.t0).H3()) {
            Paint paint = this.c;
            if (paint == null) {
                paint = new Paint(1);
                this.c = paint;
            }
            paint.setColor(cmb.w0(null, cmb.Ei, false));
            return this.c;
        }
        return this.b;
    }

    public final void f(float f, float f2, int i, int i2) {
        this.a.d(0, f, 0, i, f2, i2);
    }
}
