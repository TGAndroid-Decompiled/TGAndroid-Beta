package ii;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sr;
public final class a2 extends ImageView implements org.telegram.ui.ActionBar.z5 {
    public final int f11220a;
    public int f11221b;
    public boolean f11222c;
    public boolean d;
    public int e;
    public int f11223f;
    public final org.telegram.ui.ActionBar.e6 h;
    public boolean f11224n;
    public boolean f11225r;
    public boolean f11226s;

    public a2(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = 20;
        this.f11223f = org.telegram.ui.ActionBar.i6.f19057d6;
        this.f11224n = true;
        this.f11226s = true;
        this.f11221b = i10;
        this.f11220a = i10;
        this.h = e6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.a6.a(this);
        e();
    }

    public final void a() {
        f(this.f11220a);
    }

    public final void b() {
        if (!this.f11226s) {
            return;
        }
        this.f11226s = false;
        e();
    }

    public final void c(int i10) {
        if (this.f11223f == i10) {
            return;
        }
        this.f11223f = i10;
        e();
    }

    public final void d() {
        this.f11222c = true;
        c2 c2Var = new c2(getContext(), this.f11221b);
        c2Var.d = this.f11223f;
        c2Var.a(this.d);
        setImageDrawable(c2Var);
    }

    @Override
    public final void e() {
        int i10;
        boolean z10 = this.f11225r;
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        if (z10) {
            if (this.f11226s) {
                i10 = org.telegram.ui.ActionBar.i6.Oh;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.G6;
            }
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
            setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.v0(this.f11223f, e6Var), org.telegram.ui.ActionBar.i6.l1(0.1f, w02)), org.telegram.ui.ActionBar.i6.l1(0.1f, w02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.v0(this.f11223f, e6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19147i6, e6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
        setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void f(int i10) {
        if (this.f11221b == i10) {
            return;
        }
        this.f11221b = i10;
        if (this.f11222c) {
            c2 c2Var = new c2(getContext(), i10);
            c2Var.d = this.f11223f;
            c2Var.a(this.d);
            AndroidUtilities.updateImageViewImageAnimated(this, c2Var);
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
        if (this.f11224n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f11224n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(320L).setInterpolator(sr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof c2) {
            ((c2) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f11225r == z10) {
            return;
        }
        this.f11225r = z10;
        e();
    }
}
