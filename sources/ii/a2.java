package ii;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public final class a2 extends ImageView implements org.telegram.ui.ActionBar.y5 {
    public final int f12215a;
    public int f12216b;
    public boolean f12217c;
    public boolean d;
    public int f12218e;
    public int f12219f;
    public final org.telegram.ui.ActionBar.d6 h;
    public boolean f12220n;
    public boolean f12221r;
    public boolean f12222s;

    public a2(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f12218e = 20;
        this.f12219f = org.telegram.ui.ActionBar.i6.f20822d6;
        this.f12220n = true;
        this.f12222s = true;
        this.f12216b = i10;
        this.f12215a = i10;
        this.h = d6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.b6.a(this);
        e();
    }

    public final void a() {
        f(this.f12215a);
    }

    public final void b() {
        if (!this.f12222s) {
            return;
        }
        this.f12222s = false;
        e();
    }

    public final void c(int i10) {
        if (this.f12219f == i10) {
            return;
        }
        this.f12219f = i10;
        e();
    }

    public final void d() {
        this.f12217c = true;
        c2 c2Var = new c2(getContext(), this.f12216b);
        c2Var.d = this.f12219f;
        c2Var.a(this.d);
        setImageDrawable(c2Var);
    }

    @Override
    public final void e() {
        int i10;
        boolean z10 = this.f12221r;
        org.telegram.ui.ActionBar.d6 d6Var = this.h;
        if (z10) {
            if (this.f12222s) {
                i10 = org.telegram.ui.ActionBar.i6.Oh;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.G6;
            }
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
            setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.v0(this.f12219f, d6Var), org.telegram.ui.ActionBar.i6.l1(0.1f, w02)), org.telegram.ui.ActionBar.i6.l1(0.1f, w02), AndroidUtilities.dp(this.f12218e), AndroidUtilities.dp(this.f12218e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.v0(this.f12219f, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20913i6, d6Var), AndroidUtilities.dp(this.f12218e), AndroidUtilities.dp(this.f12218e)));
        setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void f(int i10) {
        if (this.f12216b == i10) {
            return;
        }
        this.f12216b = i10;
        if (this.f12217c) {
            c2 c2Var = new c2(getContext(), i10);
            c2Var.d = this.f12219f;
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
        if (this.f12220n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f12220n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(320L).setInterpolator(tr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof c2) {
            ((c2) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f12221r == z10) {
            return;
        }
        this.f12221r = z10;
        e();
    }
}
