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
public final class bl8 {
    public static bl8 j;
    public final al8 a;
    public final Paint b;
    public Paint c;
    public final Drawable d;
    public final Drawable e;
    public zk8 f;
    public zk8 g;
    public final zk8 h;
    public int i;

    public bl8() {
        al8 al8Var = new al8(aob.Ck, aob.Dk, aob.Ek, aob.Fk, null);
        this.a = al8Var;
        al8 al8Var2 = new al8(aob.Wk, aob.Xk, -1, -1, null);
        this.b = al8Var.f;
        this.e = a.b.getDrawable(2131232312).mutate();
        this.f = c(a.b.getDrawable(2131232367), al8Var);
        this.h = c(a.b.getDrawable(2131232367), al8Var2);
        this.g = c(a.b.getDrawable(2131232314), al8Var);
        this.d = a.b.getDrawable(2131232312).mutate();
        al8Var.a();
        b();
    }

    public static zk8 c(Drawable drawable, al8 al8Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        al8Var.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        al8Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, al8Var.f);
        al8Var.f.setXfermode(null);
        int[] iArr = al8Var.l;
        ?? bitmapDrawable = new BitmapDrawable(a.b.getResources(), createBitmap);
        bitmapDrawable.b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static bl8 d() {
        bl8 bl8Var = j;
        if (bl8Var == null) {
            bl8 bl8Var2 = new bl8();
            j = bl8Var2;
            return bl8Var2;
        }
        return bl8Var;
    }

    public final zk8 a(zk8 zk8Var) {
        al8 al8Var = this.a;
        int[] iArr = al8Var.l;
        int i = iArr[0];
        int[] iArr2 = zk8Var.a;
        if (i == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return zk8Var;
        }
        return c(zk8Var.b, al8Var);
    }

    public final void b() {
        int i = aob.z9;
        if (aob.w0(null, i, false) != this.i) {
            this.i = aob.w0(null, i, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.i, PorterDuff.Mode.MULTIPLY));
        }
        this.f = a(this.f);
        this.g = a(this.g);
    }

    public final Paint e() {
        if (uc7.s1(yac.t0).M3()) {
            Paint paint = this.c;
            if (paint == null) {
                paint = new Paint(1);
                this.c = paint;
            }
            paint.setColor(aob.w0(null, aob.Fi, false));
            return this.c;
        }
        return this.b;
    }

    public final void f(float f, float f2, int i, int i2) {
        this.a.d(0, f, 0, i, f2, i2);
    }
}
