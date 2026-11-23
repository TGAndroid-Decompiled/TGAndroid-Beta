package ia;

import aa.a0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.n6;
import ug.a1;
import ug.z0;
public final class e {
    public static e f16286j;
    public int f16287a;
    public final Object f16288b;
    public final Object f16289c;
    public Object d;
    public final Object f16290e;
    public final Object f16291f;
    public Object f16292g;
    public Object h;
    public final Object f16293i;

    public e(String str, String str2, String str3, String str4, a0 a0Var, String str5, String str6, String str7, int i7) {
        this.f16288b = str;
        this.f16289c = str2;
        this.d = str3;
        this.f16290e = str4;
        this.f16293i = a0Var;
        this.f16291f = str5;
        this.f16292g = str6;
        this.h = str7;
        this.f16287a = i7;
    }

    public static z0 c(Drawable drawable, a1 a1Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        a1Var.f58727f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        a1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, a1Var.f58727f);
        a1Var.f58727f.setXfermode(null);
        int[] iArr = a1Var.f58732l;
        ?? bitmapDrawable = new BitmapDrawable(t0.f27013b.getResources(), createBitmap);
        bitmapDrawable.f59094b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f59093a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static e d() {
        if (f16286j == null) {
            f16286j = new e();
        }
        return f16286j;
    }

    public z0 a(z0 z0Var) {
        a1 a1Var = (a1) this.f16288b;
        int[] iArr = a1Var.f58732l;
        int i7 = iArr[0];
        int[] iArr2 = z0Var.f59093a;
        if (i7 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return z0Var;
        }
        return c(z0Var.f59094b, a1Var);
    }

    public void b() {
        int i7 = n6.f29865z9;
        if (n6.x0(null, i7, false) != this.f16287a) {
            this.f16287a = n6.x0(null, i7, false);
            ((Drawable) this.f16291f).setColorFilter(new PorterDuffColorFilter(this.f16287a, PorterDuff.Mode.MULTIPLY));
        }
        this.f16292g = a((z0) this.f16292g);
        this.h = a((z0) this.h);
    }

    public Paint e() {
        if (mp.u1(i10.f24637t0).K3()) {
            if (((Paint) this.d) == null) {
                this.d = new Paint(1);
            }
            ((Paint) this.d).setColor(n6.x0(null, n6.Fi, false));
            return (Paint) this.d;
        }
        return (Paint) this.f16289c;
    }

    public void f(float f10, float f11, int i7, int i10) {
        ((a1) this.f16288b).d(0, f10, 0, i7, f11, i10);
    }

    public e() {
        a1 a1Var = new a1(n6.Ck, n6.Dk, n6.Ek, n6.Fk, null);
        this.f16288b = a1Var;
        a1 a1Var2 = new a1(n6.Wk, n6.Xk, -1, -1, null);
        this.f16289c = a1Var.f58727f;
        this.f16291f = t0.f27013b.getDrawable(2131232312).mutate();
        this.f16292g = c(t0.f27013b.getDrawable(2131232367), a1Var);
        this.f16293i = c(t0.f27013b.getDrawable(2131232367), a1Var2);
        this.h = c(t0.f27013b.getDrawable(2131232314), a1Var);
        this.f16290e = t0.f27013b.getDrawable(2131232312).mutate();
        a1Var.a();
        b();
    }
}
