package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.ui.Components.gr;
public final class g2 extends ImageView implements org.telegram.ui.ActionBar.k6 {
    public final int f3029a;
    public int f3030b;
    public boolean f3031c;
    public boolean d;
    public int e;
    public int f3032f;
    public final org.telegram.ui.ActionBar.p6 h;
    public boolean f3033n;
    public boolean f3034r;
    public boolean f3035s;

    public g2(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.e = 20;
        this.f3032f = org.telegram.ui.ActionBar.t6.f20930d6;
        this.f3033n = true;
        this.f3035s = true;
        this.f3030b = i10;
        this.f3029a = i10;
        this.h = p6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.e6.a(this);
        updateColors();
    }

    public final void a() {
        e(this.f3029a);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(this.f3032f));
    }

    public final void b() {
        if (!this.f3035s) {
            return;
        }
        this.f3035s = false;
        updateColors();
    }

    public final void c(int i10) {
        if (this.f3032f == i10) {
            return;
        }
        this.f3032f = i10;
        updateColors();
    }

    public final void d() {
        this.f3031c = true;
        i2 i2Var = new i2(getContext(), this.f3030b);
        i2Var.d = this.f3032f;
        i2Var.a(this.d);
        setImageDrawable(i2Var);
    }

    public final void e(int i10) {
        if (this.f3030b == i10) {
            return;
        }
        this.f3030b = i10;
        if (this.f3031c) {
            i2 i2Var = new i2(getContext(), i10);
            i2Var.d = this.f3032f;
            i2Var.a(this.d);
            org.telegram.messenger.i0.R3(this, i2Var);
            return;
        }
        org.telegram.messenger.i0.Q3(this, i10);
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        if (this.f3033n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f3033n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(320L).setInterpolator(gr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof i2) {
            ((i2) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f3034r == z10) {
            return;
        }
        this.f3034r = z10;
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i10;
        boolean z10 = this.f3034r;
        org.telegram.ui.ActionBar.p6 p6Var = this.h;
        if (z10) {
            if (this.f3035s) {
                i10 = org.telegram.ui.ActionBar.t6.Ci;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.G6;
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            setBackground(org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(this.f3032f, p6Var), org.telegram.ui.ActionBar.t6.r1(0.1f, x02)), org.telegram.ui.ActionBar.t6.r1(0.1f, x02), org.telegram.messenger.i0.L(this.e), org.telegram.messenger.i0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.w0(this.f3032f, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, p6Var), org.telegram.messenger.i0.L(this.e), org.telegram.messenger.i0.L(this.e)));
        setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var), PorterDuff.Mode.SRC_IN));
    }
}
