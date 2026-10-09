package ii;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hs;
public final class a2 extends ImageView implements org.telegram.ui.ActionBar.z5 {
    public final int f12262a;
    public int f12263b;
    public boolean f12264c;
    public boolean d;
    public int f12265e;
    public int f12266f;
    public final org.telegram.ui.ActionBar.e6 h;
    public boolean f12267n;
    public boolean f12268r;
    public boolean f12269s;

    public a2(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f12265e = 20;
        this.f12266f = org.telegram.ui.ActionBar.i6.f20797d6;
        this.f12267n = true;
        this.f12269s = true;
        this.f12263b = i10;
        this.f12262a = i10;
        this.h = e6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.z5.a(this);
        e();
    }

    public final void a() {
        f(this.f12262a);
    }

    public final void b() {
        if (!this.f12269s) {
            return;
        }
        this.f12269s = false;
        e();
    }

    public final void c(int i10) {
        if (this.f12266f == i10) {
            return;
        }
        this.f12266f = i10;
        e();
    }

    public final void d() {
        this.f12264c = true;
        c2 c2Var = new c2(getContext(), this.f12263b);
        c2Var.d = this.f12266f;
        c2Var.a(this.d);
        setImageDrawable(c2Var);
    }

    @Override
    public final void e() {
        int i10;
        boolean z10 = this.f12268r;
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        if (z10) {
            if (this.f12269s) {
                i10 = org.telegram.ui.ActionBar.i6.Oh;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.G6;
            }
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
            setBackground(org.telegram.ui.ActionBar.i6.a0(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(this.f12266f, e6Var), org.telegram.ui.ActionBar.i6.m1(0.1f, x02)), org.telegram.ui.ActionBar.i6.m1(0.1f, x02), AndroidUtilities.dp(this.f12265e), AndroidUtilities.dp(this.f12265e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(org.telegram.ui.ActionBar.i6.a0(org.telegram.ui.ActionBar.i6.w0(this.f12266f, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, e6Var), AndroidUtilities.dp(this.f12265e), AndroidUtilities.dp(this.f12265e)));
        setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void f(int i10) {
        if (this.f12263b == i10) {
            return;
        }
        this.f12263b = i10;
        if (this.f12264c) {
            c2 c2Var = new c2(getContext(), i10);
            c2Var.d = this.f12266f;
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
        if (this.f12267n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f12267n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(320L).setInterpolator(hs.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof c2) {
            ((c2) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f12268r == z10) {
            return;
        }
        this.f12268r = z10;
        e();
    }
}
