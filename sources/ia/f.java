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
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.j6;
import ug.y0;
import ug.z0;
public final class f {
    public static f f15882j;
    public int f15883a;
    public final Object f15884b;
    public final Object f15885c;
    public Object d;
    public final Object f15886e;
    public final Object f15887f;
    public Object f15888g;
    public Object h;
    public final Object f15889i;

    public f(String str, String str2, String str3, String str4, a0 a0Var, String str5, String str6, String str7, int i7) {
        this.f15884b = str;
        this.f15885c = str2;
        this.d = str3;
        this.f15886e = str4;
        this.f15889i = a0Var;
        this.f15887f = str5;
        this.f15888g = str6;
        this.h = str7;
        this.f15883a = i7;
    }

    public static y0 c(Drawable drawable, z0 z0Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        z0Var.f58392f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        z0Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, z0Var.f58392f);
        z0Var.f58392f.setXfermode(null);
        int[] iArr = z0Var.f58397l;
        ?? bitmapDrawable = new BitmapDrawable(t0.f26609b.getResources(), createBitmap);
        bitmapDrawable.f58387b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f58386a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static f d() {
        if (f15882j == null) {
            f15882j = new f();
        }
        return f15882j;
    }

    public y0 a(y0 y0Var) {
        z0 z0Var = (z0) this.f15884b;
        int[] iArr = z0Var.f58397l;
        int i7 = iArr[0];
        int[] iArr2 = y0Var.f58386a;
        if (i7 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return y0Var;
        }
        return c(y0Var.f58387b, z0Var);
    }

    public void b() {
        int i7 = j6.f29263z9;
        if (j6.x0(null, i7, false) != this.f15883a) {
            this.f15883a = j6.x0(null, i7, false);
            ((Drawable) this.f15887f).setColorFilter(new PorterDuffColorFilter(this.f15883a, PorterDuff.Mode.MULTIPLY));
        }
        this.f15888g = a((y0) this.f15888g);
        this.h = a((y0) this.h);
    }

    public Paint e() {
        if (np.s1(m10.f24940t0).D3()) {
            if (((Paint) this.d) == null) {
                this.d = new Paint(1);
            }
            ((Paint) this.d).setColor(j6.x0(null, j6.Fi, false));
            return (Paint) this.d;
        }
        return (Paint) this.f15885c;
    }

    public void f(float f10, float f11, int i7, int i10) {
        ((z0) this.f15884b).d(0, f10, 0, i7, f11, i10);
    }

    public f() {
        z0 z0Var = new z0(j6.Ck, j6.Dk, j6.Ek, j6.Fk, null);
        this.f15884b = z0Var;
        z0 z0Var2 = new z0(j6.Wk, j6.Xk, -1, -1, null);
        this.f15885c = z0Var.f58392f;
        this.f15887f = t0.f26609b.getDrawable(2131232308).mutate();
        this.f15888g = c(t0.f26609b.getDrawable(2131232363), z0Var);
        this.f15889i = c(t0.f26609b.getDrawable(2131232363), z0Var2);
        this.h = c(t0.f26609b.getDrawable(2131232310), z0Var);
        this.f15886e = t0.f26609b.getDrawable(2131232308).mutate();
        z0Var.a();
        b();
    }
}
