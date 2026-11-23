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
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.m6;
import ug.a1;
import ug.z0;
public final class e {
    public static e f16189j;
    public int f16190a;
    public final Object f16191b;
    public final Object f16192c;
    public Object d;
    public final Object f16193e;
    public final Object f16194f;
    public Object f16195g;
    public Object h;
    public final Object f16196i;

    public e(String str, String str2, String str3, String str4, a0 a0Var, String str5, String str6, String str7, int i7) {
        this.f16191b = str;
        this.f16192c = str2;
        this.d = str3;
        this.f16193e = str4;
        this.f16196i = a0Var;
        this.f16194f = str5;
        this.f16195g = str6;
        this.h = str7;
        this.f16190a = i7;
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
        a1Var.f58612f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        a1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, a1Var.f58612f);
        a1Var.f58612f.setXfermode(null);
        int[] iArr = a1Var.f58617l;
        ?? bitmapDrawable = new BitmapDrawable(t0.f26895b.getResources(), createBitmap);
        bitmapDrawable.f58977b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f58976a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static e d() {
        if (f16189j == null) {
            f16189j = new e();
        }
        return f16189j;
    }

    public z0 a(z0 z0Var) {
        a1 a1Var = (a1) this.f16191b;
        int[] iArr = a1Var.f58617l;
        int i7 = iArr[0];
        int[] iArr2 = z0Var.f58976a;
        if (i7 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return z0Var;
        }
        return c(z0Var.f58977b, a1Var);
    }

    public void b() {
        int i7 = m6.f29761z9;
        if (m6.x0(null, i7, false) != this.f16190a) {
            this.f16190a = m6.x0(null, i7, false);
            ((Drawable) this.f16194f).setColorFilter(new PorterDuffColorFilter(this.f16190a, PorterDuff.Mode.MULTIPLY));
        }
        this.f16195g = a((z0) this.f16195g);
        this.h = a((z0) this.h);
    }

    public Paint e() {
        if (np.u1(k10.f24932t0).K3()) {
            if (((Paint) this.d) == null) {
                this.d = new Paint(1);
            }
            ((Paint) this.d).setColor(m6.x0(null, m6.Fi, false));
            return (Paint) this.d;
        }
        return (Paint) this.f16192c;
    }

    public void f(float f10, float f11, int i7, int i10) {
        ((a1) this.f16191b).d(0, f10, 0, i7, f11, i10);
    }

    public e() {
        a1 a1Var = new a1(m6.Ck, m6.Dk, m6.Ek, m6.Fk, null);
        this.f16191b = a1Var;
        a1 a1Var2 = new a1(m6.Wk, m6.Xk, -1, -1, null);
        this.f16192c = a1Var.f58612f;
        this.f16194f = t0.f26895b.getDrawable(2131232309).mutate();
        this.f16195g = c(t0.f26895b.getDrawable(2131232364), a1Var);
        this.f16196i = c(t0.f26895b.getDrawable(2131232364), a1Var2);
        this.h = c(t0.f26895b.getDrawable(2131232311), a1Var);
        this.f16193e = t0.f26895b.getDrawable(2131232309).mutate();
        a1Var.a();
        b();
    }
}
