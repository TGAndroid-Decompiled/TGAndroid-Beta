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
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.n6;
import ug.a1;
import ug.b1;
public final class e {
    public static e f16198j;
    public int f16199a;
    public final Object f16200b;
    public final Object f16201c;
    public Object d;
    public final Object f16202e;
    public final Object f16203f;
    public Object f16204g;
    public Object h;
    public final Object f16205i;

    public e(String str, String str2, String str3, String str4, a0 a0Var, String str5, String str6, String str7, int i7) {
        this.f16200b = str;
        this.f16201c = str2;
        this.d = str3;
        this.f16202e = str4;
        this.f16205i = a0Var;
        this.f16203f = str5;
        this.f16204g = str6;
        this.h = str7;
        this.f16199a = i7;
    }

    public static a1 c(Drawable drawable, b1 b1Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        b1Var.f58606f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        b1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, b1Var.f58606f);
        b1Var.f58606f.setXfermode(null);
        int[] iArr = b1Var.f58611l;
        ?? bitmapDrawable = new BitmapDrawable(t0.f26915b.getResources(), createBitmap);
        bitmapDrawable.f58601b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f58600a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static e d() {
        if (f16198j == null) {
            f16198j = new e();
        }
        return f16198j;
    }

    public a1 a(a1 a1Var) {
        b1 b1Var = (b1) this.f16200b;
        int[] iArr = b1Var.f58611l;
        int i7 = iArr[0];
        int[] iArr2 = a1Var.f58600a;
        if (i7 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return a1Var;
        }
        return c(a1Var.f58601b, b1Var);
    }

    public void b() {
        int i7 = n6.f29810z9;
        if (n6.x0(null, i7, false) != this.f16199a) {
            this.f16199a = n6.x0(null, i7, false);
            ((Drawable) this.f16203f).setColorFilter(new PorterDuffColorFilter(this.f16199a, PorterDuff.Mode.MULTIPLY));
        }
        this.f16204g = a((a1) this.f16204g);
        this.h = a((a1) this.h);
    }

    public Paint e() {
        if (mp.u1(j10.f24773t0).K3()) {
            if (((Paint) this.d) == null) {
                this.d = new Paint(1);
            }
            ((Paint) this.d).setColor(n6.x0(null, n6.Fi, false));
            return (Paint) this.d;
        }
        return (Paint) this.f16201c;
    }

    public void f(float f10, float f11, int i7, int i10) {
        ((b1) this.f16200b).d(0, f10, 0, i7, f11, i10);
    }

    public e() {
        b1 b1Var = new b1(n6.Ck, n6.Dk, n6.Ek, n6.Fk, null);
        this.f16200b = b1Var;
        b1 b1Var2 = new b1(n6.Wk, n6.Xk, -1, -1, null);
        this.f16201c = b1Var.f58606f;
        this.f16203f = t0.f26915b.getDrawable(2131232309).mutate();
        this.f16204g = c(t0.f26915b.getDrawable(2131232364), b1Var);
        this.f16205i = c(t0.f26915b.getDrawable(2131232364), b1Var2);
        this.h = c(t0.f26915b.getDrawable(2131232311), b1Var);
        this.f16202e = t0.f26915b.getDrawable(2131232309).mutate();
        b1Var.a();
        b();
    }
}
