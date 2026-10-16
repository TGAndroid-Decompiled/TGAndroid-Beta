package ji;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
public final class z1 extends ImageView implements org.telegram.ui.ActionBar.x5 {
    public final int f13705a;
    public int f13706b;
    public boolean f13707c;
    public boolean d;
    public int e;
    public int f13708f;
    public final org.telegram.ui.ActionBar.c6 h;
    public boolean f13709n;
    public boolean f13710r;
    public boolean f13711s;

    public z1(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = 20;
        this.f13708f = org.telegram.ui.ActionBar.g6.f19601d6;
        this.f13709n = true;
        this.f13711s = true;
        this.f13706b = i10;
        this.f13705a = i10;
        this.h = c6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.b6.a(this);
        d();
    }

    public final void a() {
        f(this.f13705a);
    }

    public final void b() {
        if (!this.f13711s) {
            return;
        }
        this.f13711s = false;
        d();
    }

    public final void c(int i10) {
        if (this.f13708f == i10) {
            return;
        }
        this.f13708f = i10;
        d();
    }

    @Override
    public final void d() {
        int i10;
        boolean z10 = this.f13710r;
        org.telegram.ui.ActionBar.c6 c6Var = this.h;
        if (z10) {
            if (this.f13711s) {
                i10 = org.telegram.ui.ActionBar.g6.Oh;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.G6;
            }
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
            setBackground(org.telegram.ui.ActionBar.g6.a0(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(this.f13708f, c6Var), org.telegram.ui.ActionBar.g6.m1(0.1f, x02)), org.telegram.ui.ActionBar.g6.m1(0.1f, x02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(org.telegram.ui.ActionBar.g6.a0(org.telegram.ui.ActionBar.g6.w0(this.f13708f, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, c6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
        setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void e() {
        this.f13707c = true;
        b2 b2Var = new b2(getContext(), this.f13706b);
        b2Var.d = this.f13708f;
        b2Var.a(this.d);
        setImageDrawable(b2Var);
    }

    public final void f(int i10) {
        if (this.f13706b == i10) {
            return;
        }
        this.f13706b = i10;
        if (this.f13707c) {
            b2 b2Var = new b2(getContext(), i10);
            b2Var.d = this.f13708f;
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
        if (this.f13709n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f13709n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(320L).setInterpolator(es.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof b2) {
            ((b2) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f13710r == z10) {
            return;
        }
        this.f13710r = z10;
        d();
    }
}
