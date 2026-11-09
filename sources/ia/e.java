package ia;

import aa.b0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.l6;
import ug.x0;
import ug.y0;
public final class e {
    public static e f15425j;
    public int f15426a;
    public final Object f15427b;
    public final Object f15428c;
    public Object d;
    public final Object f15429e;
    public final Object f15430f;
    public Object f15431g;
    public Object h;
    public final Object f15432i;

    public e(String str, String str2, String str3, String str4, b0 b0Var, String str5, String str6, String str7, int i7) {
        this.f15427b = str;
        this.f15428c = str2;
        this.d = str3;
        this.f15429e = str4;
        this.f15432i = b0Var;
        this.f15430f = str5;
        this.f15431g = str6;
        this.h = str7;
        this.f15426a = i7;
    }

    public static x0 c(Drawable drawable, y0 y0Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        y0Var.f56881f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        y0Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, y0Var.f56881f);
        y0Var.f56881f.setXfermode(null);
        int[] iArr = y0Var.f56886l;
        ?? bitmapDrawable = new BitmapDrawable(t0.f25566b.getResources(), createBitmap);
        bitmapDrawable.f56876b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f56875a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static e d() {
        if (f15425j == null) {
            f15425j = new e();
        }
        return f15425j;
    }

    public x0 a(x0 x0Var) {
        y0 y0Var = (y0) this.f15427b;
        int[] iArr = y0Var.f56886l;
        int i7 = iArr[0];
        int[] iArr2 = x0Var.f56875a;
        if (i7 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return x0Var;
        }
        return c(x0Var.f56876b, y0Var);
    }

    public void b() {
        int i7 = l6.z9;
        if (l6.x0(null, i7, false) != this.f15426a) {
            this.f15426a = l6.x0(null, i7, false);
            ((Drawable) this.f15430f).setColorFilter(new PorterDuffColorFilter(this.f15426a, PorterDuff.Mode.MULTIPLY));
        }
        this.f15431g = a((x0) this.f15431g);
        this.h = a((x0) this.h);
    }

    public Paint e() {
        if (qp.s1(p10.f24470s0).D3()) {
            if (((Paint) this.d) == null) {
                this.d = new Paint(1);
            }
            ((Paint) this.d).setColor(l6.x0(null, l6.Ci, false));
            return (Paint) this.d;
        }
        return (Paint) this.f15428c;
    }

    public void f(float f10, float f11, int i7, int i10) {
        ((y0) this.f15427b).d(0, f10, 0, i7, f11, i10);
    }

    public e() {
        y0 y0Var = new y0(l6.zk, l6.Ak, l6.Bk, l6.Ck, null);
        this.f15427b = y0Var;
        y0 y0Var2 = new y0(l6.Tk, l6.Uk, -1, -1, null);
        this.f15428c = y0Var.f56881f;
        this.f15430f = t0.f25566b.getDrawable(2131232307).mutate();
        this.f15431g = c(t0.f25566b.getDrawable(2131232362), y0Var);
        this.f15432i = c(t0.f25566b.getDrawable(2131232362), y0Var2);
        this.h = c(t0.f25566b.getDrawable(2131232309), y0Var);
        this.f15429e = t0.f25566b.getDrawable(2131232307).mutate();
        y0Var.a();
        b();
    }
}
