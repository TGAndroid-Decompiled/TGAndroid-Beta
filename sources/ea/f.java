package ea;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kg.j1;
import kg.k1;
import org.telegram.messenger.e20;
import org.telegram.messenger.w0;
import org.telegram.messenger.wp;
import org.telegram.ui.ActionBar.t6;
import x9.v;
public final class f {
    public static f f6472j;
    public int f6473a;
    public final Object f6474b;
    public final Object f6475c;
    public Object d;
    public final Object e;
    public final Object f6476f;
    public Object f6477g;
    public Object h;
    public final Object f6478i;

    public f(String str, String str2, String str3, String str4, v vVar, String str5, String str6, String str7, int i10) {
        this.f6474b = str;
        this.f6475c = str2;
        this.d = str3;
        this.e = str4;
        this.f6478i = vVar;
        this.f6476f = str5;
        this.f6477g = str6;
        this.h = str7;
        this.f6473a = i10;
    }

    public static j1 c(Drawable drawable, k1 k1Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        k1Var.f11143f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        k1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, k1Var.f11143f);
        k1Var.f11143f.setXfermode(null);
        int[] iArr = k1Var.f11148l;
        ?? bitmapDrawable = new BitmapDrawable(w0.f18945b.getResources(), createBitmap);
        bitmapDrawable.f11133b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f11132a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static f d() {
        if (f6472j == null) {
            f6472j = new f();
        }
        return f6472j;
    }

    public j1 a(j1 j1Var) {
        k1 k1Var = (k1) this.f6474b;
        int[] iArr = k1Var.f11148l;
        int i10 = iArr[0];
        int[] iArr2 = j1Var.f11132a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return j1Var;
        }
        return c(j1Var.f11133b, k1Var);
    }

    public void b() {
        int i10 = t6.f21334z9;
        if (t6.x0(null, i10, false) != this.f6473a) {
            this.f6473a = t6.x0(null, i10, false);
            ((Drawable) this.f6476f).setColorFilter(new PorterDuffColorFilter(this.f6473a, PorterDuff.Mode.MULTIPLY));
        }
        this.f6477g = a((j1) this.f6477g);
        this.h = a((j1) this.h);
    }

    public Paint e() {
        if (wp.r1(e20.f15506s0).A3()) {
            if (((Paint) this.d) == null) {
                this.d = new Paint(1);
            }
            ((Paint) this.d).setColor(t6.x0(null, t6.Ci, false));
            return (Paint) this.d;
        }
        return (Paint) this.f6475c;
    }

    public void f(float f7, float f10, int i10, int i11) {
        ((k1) this.f6474b).d(0, f7, 0, i10, f10, i11);
    }

    public f() {
        k1 k1Var = new k1(t6.zk, t6.Ak, t6.Bk, t6.Ck, null);
        this.f6474b = k1Var;
        k1 k1Var2 = new k1(t6.Tk, t6.Uk, -1, -1, null);
        this.f6475c = k1Var.f11143f;
        this.f6476f = w0.f18945b.getDrawable(2131232306).mutate();
        this.f6477g = c(w0.f18945b.getDrawable(2131232361), k1Var);
        this.f6478i = c(w0.f18945b.getDrawable(2131232361), k1Var2);
        this.h = c(w0.f18945b.getDrawable(2131232308), k1Var);
        this.e = w0.f18945b.getDrawable(2131232306).mutate();
        k1Var.a();
        b();
    }
}
