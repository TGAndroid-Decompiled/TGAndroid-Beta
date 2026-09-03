package fg;

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
import org.telegram.ui.ActionBar.k6;
public final class q1 {
    public static q1 f6512j;
    public final p1 f6513a;
    public final Paint f6514b;
    public Paint f6515c;
    public final Drawable d;
    public final Drawable f6516e;
    public o1 f6517f;
    public o1 f6518g;
    public final o1 h;
    public int f6519i;

    public q1() {
        p1 p1Var = new p1(k6.Lj, k6.Mj, k6.Nj, k6.Oj, null);
        this.f6513a = p1Var;
        p1 p1Var2 = new p1(k6.fk, k6.gk, -1, -1, null);
        this.f6514b = p1Var.f6490f;
        this.f6516e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f6517f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), p1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), p1Var2);
        this.f6518g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), p1Var);
        this.d = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        p1Var.a();
        b();
    }

    public static o1 c(Drawable drawable, p1 p1Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        p1Var.f6490f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        p1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, p1Var.f6490f);
        p1Var.f6490f.setXfermode(null);
        int[] iArr = p1Var.f6495l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f6450b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f6449a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static q1 d() {
        if (f6512j == null) {
            f6512j = new q1();
        }
        return f6512j;
    }

    public final o1 a(o1 o1Var) {
        p1 p1Var = this.f6513a;
        int[] iArr = p1Var.f6495l;
        int i10 = iArr[0];
        int[] iArr2 = o1Var.f6449a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return o1Var;
        }
        return c(o1Var.f6450b, p1Var);
    }

    public final void b() {
        int i10 = k6.f22058z9;
        if (k6.w0(null, i10, false) != this.f6519i) {
            this.f6519i = k6.w0(null, i10, false);
            this.f6516e.setColorFilter(new PorterDuffColorFilter(this.f6519i, PorterDuff.Mode.MULTIPLY));
        }
        this.f6517f = a(this.f6517f);
        this.f6518g = a(this.f6518g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f6515c == null) {
                this.f6515c = new Paint(1);
            }
            this.f6515c.setColor(k6.w0(null, k6.Oh, false));
            return this.f6515c;
        }
        return this.f6514b;
    }

    public final void f(float f10, float f11, int i10, int i11) {
        this.f6513a.d(0, f10, 0, i10, f11, i11);
    }
}
