package cg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
public final class s1 {
    public static s1 f3359j;
    public final r1 f3360a;
    public final Paint f3361b;
    public Paint f3362c;
    public final Drawable d;
    public final Drawable f3363e;
    public q1 f3364f;
    public q1 f3365g;
    public final q1 h;
    public int f3366i;

    public s1() {
        r1 r1Var = new r1(g6.Lj, g6.Mj, g6.Nj, g6.Oj, null);
        this.f3360a = r1Var;
        r1 r1Var2 = new r1(g6.fk, g6.gk, -1, -1, null);
        this.f3361b = r1Var.f3319f;
        this.f3363e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f3364f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), r1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), r1Var2);
        this.f3365g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), r1Var);
        this.d = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        r1Var.a();
        b();
    }

    public static q1 c(Drawable drawable, r1 r1Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        r1Var.f3319f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        r1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, r1Var.f3319f);
        r1Var.f3319f.setXfermode(null);
        int[] iArr = r1Var.f3324l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f3288b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f3287a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static s1 d() {
        if (f3359j == null) {
            f3359j = new s1();
        }
        return f3359j;
    }

    public final q1 a(q1 q1Var) {
        r1 r1Var = this.f3360a;
        int[] iArr = r1Var.f3324l;
        int i10 = iArr[0];
        int[] iArr2 = q1Var.f3287a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return q1Var;
        }
        return c(q1Var.f3288b, r1Var);
    }

    public final void b() {
        int i10 = g6.f23453z9;
        if (g6.w0(null, i10, false) != this.f3366i) {
            this.f3366i = g6.w0(null, i10, false);
            this.f3363e.setColorFilter(new PorterDuffColorFilter(this.f3366i, PorterDuff.Mode.MULTIPLY));
        }
        this.f3364f = a(this.f3364f);
        this.f3365g = a(this.f3365g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f3362c == null) {
                this.f3362c = new Paint(1);
            }
            this.f3362c.setColor(g6.w0(null, g6.Oh, false));
            return this.f3362c;
        }
        return this.f3361b;
    }

    public final void f(float f9, float f10, int i10, int i11) {
        this.f3360a.d(0, f9, 0, i10, f10, i11);
    }
}
