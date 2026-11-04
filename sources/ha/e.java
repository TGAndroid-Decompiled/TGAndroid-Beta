package ha;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.k6;
import vg.w0;
import vg.x0;
import z9.v;
public final class e {
    public static e f14379j;
    public int f14380a;
    public final Object f14381b;
    public final Object f14382c;
    public Object d;
    public final Object f14383e;
    public final Object f14384f;
    public Object f14385g;
    public Object h;
    public final Object f14386i;

    public e(String str, String str2, String str3, String str4, v vVar, String str5, String str6, String str7, int i3) {
        this.f14381b = str;
        this.f14382c = str2;
        this.d = str3;
        this.f14383e = str4;
        this.f14386i = vVar;
        this.f14384f = str5;
        this.f14385g = str6;
        this.h = str7;
        this.f14380a = i3;
    }

    public static w0 c(Drawable drawable, x0 x0Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        x0Var.f56911f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        x0Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, x0Var.f56911f);
        x0Var.f56911f.setXfermode(null);
        int[] iArr = x0Var.f56916l;
        ?? bitmapDrawable = new BitmapDrawable(t0.f25457b.getResources(), createBitmap);
        bitmapDrawable.f56892b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f56891a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static e d() {
        if (f14379j == null) {
            f14379j = new e();
        }
        return f14379j;
    }

    public w0 a(w0 w0Var) {
        x0 x0Var = (x0) this.f14381b;
        int[] iArr = x0Var.f56916l;
        int i3 = iArr[0];
        int[] iArr2 = w0Var.f56891a;
        if (i3 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return w0Var;
        }
        return c(w0Var.f56892b, x0Var);
    }

    public void b() {
        int i3 = k6.f28293z9;
        if (k6.x0(null, i3, false) != this.f14380a) {
            this.f14380a = k6.x0(null, i3, false);
            ((Drawable) this.f14384f).setColorFilter(new PorterDuffColorFilter(this.f14380a, PorterDuff.Mode.MULTIPLY));
        }
        this.f14385g = a((w0) this.f14385g);
        this.h = a((w0) this.h);
    }

    public Paint e() {
        if (hp.s1(h10.f22829t0).D3()) {
            if (((Paint) this.d) == null) {
                this.d = new Paint(1);
            }
            ((Paint) this.d).setColor(k6.x0(null, k6.Ci, false));
            return (Paint) this.d;
        }
        return (Paint) this.f14382c;
    }

    public void f(float f10, float f11, int i3, int i10) {
        ((x0) this.f14381b).d(0, f10, 0, i3, f11, i10);
    }

    public e() {
        x0 x0Var = new x0(k6.zk, k6.Ak, k6.Bk, k6.Ck, null);
        this.f14381b = x0Var;
        x0 x0Var2 = new x0(k6.Tk, k6.Uk, -1, -1, null);
        this.f14382c = x0Var.f56911f;
        this.f14384f = t0.f25457b.getDrawable(2131232307).mutate();
        this.f14385g = c(t0.f25457b.getDrawable(2131232362), x0Var);
        this.f14386i = c(t0.f25457b.getDrawable(2131232362), x0Var2);
        this.h = c(t0.f25457b.getDrawable(2131232309), x0Var);
        this.f14383e = t0.f25457b.getDrawable(2131232307).mutate();
        x0Var.a();
        b();
    }
}
