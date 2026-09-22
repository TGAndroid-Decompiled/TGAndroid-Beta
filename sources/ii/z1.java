package ii;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.qr;
public final class z1 extends ImageView implements org.telegram.ui.ActionBar.z5 {
    public final int f11791a;
    public int f11792b;
    public boolean f11793c;
    public boolean d;
    public int e;
    public int f11794f;
    public final org.telegram.ui.ActionBar.e6 h;
    public boolean f11795n;
    public boolean f11796r;
    public boolean f11797s;

    public z1(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = 20;
        this.f11794f = i6.f18834d6;
        this.f11795n = true;
        this.f11797s = true;
        this.f11792b = i10;
        this.f11791a = i10;
        this.h = e6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.z5.a(this);
        e();
    }

    public final void a() {
        f(this.f11791a);
    }

    public final void b() {
        if (!this.f11797s) {
            return;
        }
        this.f11797s = false;
        e();
    }

    public final void c(int i10) {
        if (this.f11794f == i10) {
            return;
        }
        this.f11794f = i10;
        e();
    }

    public final void d() {
        this.f11793c = true;
        b2 b2Var = new b2(getContext(), this.f11792b);
        b2Var.d = this.f11794f;
        b2Var.a(this.d);
        setImageDrawable(b2Var);
    }

    @Override
    public final void e() {
        int i10;
        boolean z10 = this.f11796r;
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        if (z10) {
            if (this.f11797s) {
                i10 = i6.Oh;
            } else {
                i10 = i6.G6;
            }
            int w02 = i6.w0(null, i10, false);
            setBackground(i6.Z(i6.v(i6.v0(this.f11794f, e6Var), i6.l1(0.1f, w02)), i6.l1(0.1f, w02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(i6.Z(i6.v0(this.f11794f, e6Var), i6.v0(i6.f18923i6, e6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
        setColorFilter(new PorterDuffColorFilter(i6.v0(i6.G6, e6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void f(int i10) {
        if (this.f11792b == i10) {
            return;
        }
        this.f11792b = i10;
        if (this.f11793c) {
            b2 b2Var = new b2(getContext(), i10);
            b2Var.d = this.f11794f;
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
        if (this.f11795n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f11795n = z10;
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
        if (this.f11796r == z10) {
            return;
        }
        this.f11796r = z10;
        e();
    }
}
