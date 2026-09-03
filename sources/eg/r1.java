package eg;

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
import org.telegram.ui.ActionBar.j6;
public final class r1 {
    public static r1 f5470j;
    public final q1 f5471a;
    public final Paint f5472b;
    public Paint f5473c;
    public final Drawable d;
    public final Drawable e;
    public p1 f5474f;
    public p1 f5475g;
    public final p1 h;
    public int f5476i;

    public r1() {
        q1 q1Var = new q1(j6.Lj, j6.Mj, j6.Nj, j6.Oj, null);
        this.f5471a = q1Var;
        q1 q1Var2 = new q1(j6.fk, j6.gk, -1, -1, null);
        this.f5472b = q1Var.f5446f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f5474f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), q1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), q1Var2);
        this.f5475g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), q1Var);
        this.d = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        q1Var.a();
        b();
    }

    public static p1 c(Drawable drawable, q1 q1Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        q1Var.f5446f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        q1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, q1Var.f5446f);
        q1Var.f5446f.setXfermode(null);
        int[] iArr = q1Var.f5451l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f5415b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f5414a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static r1 d() {
        if (f5470j == null) {
            f5470j = new r1();
        }
        return f5470j;
    }

    public final p1 a(p1 p1Var) {
        q1 q1Var = this.f5471a;
        int[] iArr = q1Var.f5451l;
        int i10 = iArr[0];
        int[] iArr2 = p1Var.f5414a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return p1Var;
        }
        return c(p1Var.f5415b, q1Var);
    }

    public final void b() {
        int i10 = j6.f20276z9;
        if (j6.w0(null, i10, false) != this.f5476i) {
            this.f5476i = j6.w0(null, i10, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.f5476i, PorterDuff.Mode.MULTIPLY));
        }
        this.f5474f = a(this.f5474f);
        this.f5475g = a(this.f5475g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f5473c == null) {
                this.f5473c = new Paint(1);
            }
            this.f5473c.setColor(j6.w0(null, j6.Oh, false));
            return this.f5473c;
        }
        return this.f5472b;
    }

    public final void f(float f10, float f11, int i10, int i11) {
        this.f5471a.d(0, f10, 0, i10, f11, i11);
    }
}
