package ii;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qr;
public final class z1 extends ImageView implements org.telegram.ui.ActionBar.z5 {
    public final int f11793a;
    public int f11794b;
    public boolean f11795c;
    public boolean d;
    public int e;
    public int f11796f;
    public final org.telegram.ui.ActionBar.f6 h;
    public boolean f11797n;
    public boolean f11798r;
    public boolean f11799s;

    public z1(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 20;
        this.f11796f = j6.f19109d6;
        this.f11797n = true;
        this.f11799s = true;
        this.f11794b = i10;
        this.f11793a = i10;
        this.h = f6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.a6.a(this);
        e();
    }

    public final void a() {
        f(this.f11793a);
    }

    public final void b() {
        if (!this.f11799s) {
            return;
        }
        this.f11799s = false;
        e();
    }

    public final void c(int i10) {
        if (this.f11796f == i10) {
            return;
        }
        this.f11796f = i10;
        e();
    }

    public final void d() {
        this.f11795c = true;
        b2 b2Var = new b2(getContext(), this.f11794b);
        b2Var.d = this.f11796f;
        b2Var.a(this.d);
        setImageDrawable(b2Var);
    }

    @Override
    public final void e() {
        int i10;
        boolean z10 = this.f11798r;
        org.telegram.ui.ActionBar.f6 f6Var = this.h;
        if (z10) {
            if (this.f11799s) {
                i10 = j6.Oh;
            } else {
                i10 = j6.G6;
            }
            int w02 = j6.w0(null, i10, false);
            setBackground(j6.Z(j6.v(j6.v0(this.f11796f, f6Var), j6.l1(0.1f, w02)), j6.l1(0.1f, w02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(j6.Z(j6.v0(this.f11796f, f6Var), j6.v0(j6.f19199i6, f6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
        setColorFilter(new PorterDuffColorFilter(j6.v0(j6.G6, f6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void f(int i10) {
        if (this.f11794b == i10) {
            return;
        }
        this.f11794b = i10;
        if (this.f11795c) {
            b2 b2Var = new b2(getContext(), i10);
            b2Var.d = this.f11796f;
            b2Var.a(this.d);
            AndroidUtilities.updateImageViewImageAnimated(this, b2Var);
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(this, i10);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        if (this.f11797n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f11797n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(320L).setInterpolator(qr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof b2) {
            ((b2) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f11798r == z10) {
            return;
        }
        this.f11798r = z10;
        e();
    }
}
