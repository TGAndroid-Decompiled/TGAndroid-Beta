package ii;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
public final class a2 extends ImageView implements org.telegram.ui.ActionBar.x5 {
    public final int f11217a;
    public int f11218b;
    public boolean f11219c;
    public boolean d;
    public int e;
    public int f11220f;
    public final org.telegram.ui.ActionBar.d6 h;
    public boolean f11221n;
    public boolean f11222r;
    public boolean f11223s;

    public a2(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = 20;
        this.f11220f = org.telegram.ui.ActionBar.h6.f19060d6;
        this.f11221n = true;
        this.f11223s = true;
        this.f11218b = i10;
        this.f11217a = i10;
        this.h = d6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.a6.a(this);
        e();
    }

    public final void a() {
        f(this.f11217a);
    }

    public final void b() {
        if (!this.f11223s) {
            return;
        }
        this.f11223s = false;
        e();
    }

    public final void c(int i10) {
        if (this.f11220f == i10) {
            return;
        }
        this.f11220f = i10;
        e();
    }

    public final void d() {
        this.f11219c = true;
        c2 c2Var = new c2(getContext(), this.f11218b);
        c2Var.d = this.f11220f;
        c2Var.a(this.d);
        setImageDrawable(c2Var);
    }

    @Override
    public final void e() {
        int i10;
        boolean z10 = this.f11222r;
        org.telegram.ui.ActionBar.d6 d6Var = this.h;
        if (z10) {
            if (this.f11223s) {
                i10 = org.telegram.ui.ActionBar.h6.Oh;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.G6;
            }
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
            setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.v0(this.f11220f, d6Var), org.telegram.ui.ActionBar.h6.l1(0.1f, w02)), org.telegram.ui.ActionBar.h6.l1(0.1f, w02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.v0(this.f11220f, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19149i6, d6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
        setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void f(int i10) {
        if (this.f11218b == i10) {
            return;
        }
        this.f11218b = i10;
        if (this.f11219c) {
            c2 c2Var = new c2(getContext(), i10);
            c2Var.d = this.f11220f;
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
        if (this.f11221n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f11221n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(320L).setInterpolator(rr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof c2) {
            ((c2) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f11222r == z10) {
            return;
        }
        this.f11222r = z10;
        e();
    }
}
