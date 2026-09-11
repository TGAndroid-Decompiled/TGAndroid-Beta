package ji;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class y1 extends ImageView implements org.telegram.ui.ActionBar.z5 {
    public final int f14337a;
    public int f14338b;
    public boolean f14339c;
    public boolean d;
    public int f14340e;
    public int f14341f;
    public final org.telegram.ui.ActionBar.f6 h;
    public boolean f14342n;
    public boolean f14343r;
    public boolean f14344s;

    public y1(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f14340e = 20;
        this.f14341f = org.telegram.ui.ActionBar.j6.f20663d6;
        this.f14342n = true;
        this.f14344s = true;
        this.f14338b = i10;
        this.f14337a = i10;
        this.h = f6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.z5.a(this);
        d();
    }

    public final void a() {
        f(this.f14337a);
    }

    public final void b() {
        if (!this.f14344s) {
            return;
        }
        this.f14344s = false;
        d();
    }

    public final void c(int i10) {
        if (this.f14341f == i10) {
            return;
        }
        this.f14341f = i10;
        d();
    }

    @Override
    public final void d() {
        int i10;
        boolean z10 = this.f14343r;
        org.telegram.ui.ActionBar.f6 f6Var = this.h;
        if (z10) {
            if (this.f14344s) {
                i10 = org.telegram.ui.ActionBar.j6.Oh;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.G6;
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            setBackground(org.telegram.ui.ActionBar.j6.Z(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(this.f14341f, f6Var), org.telegram.ui.ActionBar.j6.l1(0.1f, w02)), org.telegram.ui.ActionBar.j6.l1(0.1f, w02), AndroidUtilities.dp(this.f14340e), AndroidUtilities.dp(this.f14340e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(org.telegram.ui.ActionBar.j6.Z(org.telegram.ui.ActionBar.j6.v0(this.f14341f, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, f6Var), AndroidUtilities.dp(this.f14340e), AndroidUtilities.dp(this.f14340e)));
        setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void e() {
        this.f14339c = true;
        a2 a2Var = new a2(getContext(), this.f14338b);
        a2Var.d = this.f14341f;
        a2Var.a(this.d);
        setImageDrawable(a2Var);
    }

    public final void f(int i10) {
        if (this.f14338b == i10) {
            return;
        }
        this.f14338b = i10;
        if (this.f14339c) {
            a2 a2Var = new a2(getContext(), i10);
            a2Var.d = this.f14341f;
            a2Var.a(this.d);
            AndroidUtilities.updateImageViewImageAnimated(this, a2Var);
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
        if (this.f14342n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f14342n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(320L).setInterpolator(pr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof a2) {
            ((a2) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f14343r == z10) {
            return;
        }
        this.f14343r = z10;
        d();
    }
}
