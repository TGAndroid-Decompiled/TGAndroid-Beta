package oi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.ra;
import java.util.HashSet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.nr;
public final class x1 extends ImageView implements org.telegram.ui.ActionBar.b6 {
    public final int f22518a;
    public int f22519b;
    public boolean f22520c;
    public boolean d;
    public int f22521e;
    public int f22522f;
    public final h6 h;
    public boolean f22523n;
    public boolean f22524r;
    public boolean f22525s;

    public x1(int i7, Context context, h6 h6Var) {
        super(context);
        this.f22521e = 20;
        this.f22522f = m6.f29381d6;
        this.f22523n = true;
        this.f22525s = true;
        this.f22519b = i7;
        this.f22518a = i7;
        this.h = h6Var;
        if (i7 != 0) {
            setImageResource(i7);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        ra.a(this);
        updateColors();
    }

    public final void a() {
        e(this.f22518a);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Fi));
        hashSet.add(Integer.valueOf(m6.G6));
        hashSet.add(Integer.valueOf(m6.f29473i6));
        hashSet.add(Integer.valueOf(this.f22522f));
    }

    public final void b() {
        if (!this.f22525s) {
            return;
        }
        this.f22525s = false;
        updateColors();
    }

    public final void c(int i7) {
        if (this.f22522f == i7) {
            return;
        }
        this.f22522f = i7;
        updateColors();
    }

    public final void d() {
        this.f22520c = true;
        z1 z1Var = new z1(getContext(), this.f22519b);
        z1Var.d = this.f22522f;
        z1Var.a(this.d);
        setImageDrawable(z1Var);
    }

    public final void e(int i7) {
        if (this.f22519b == i7) {
            return;
        }
        this.f22519b = i7;
        if (this.f22520c) {
            z1 z1Var = new z1(getContext(), i7);
            z1Var.d = this.f22522f;
            z1Var.a(this.d);
            org.telegram.messenger.g0.Q3(this, z1Var);
            return;
        }
        org.telegram.messenger.g0.P3(this, i7);
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        if (this.f22523n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f22523n = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(320L).setInterpolator(nr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof z1) {
            ((z1) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f22524r == z10) {
            return;
        }
        this.f22524r = z10;
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i7;
        boolean z10 = this.f22524r;
        h6 h6Var = this.h;
        if (z10) {
            if (this.f22525s) {
                i7 = m6.Fi;
            } else {
                i7 = m6.G6;
            }
            int x02 = m6.x0(null, i7, false);
            setBackground(m6.b0(m6.w(m6.w0(this.f22522f, h6Var), m6.r1(0.1f, x02)), m6.r1(0.1f, x02), org.telegram.messenger.g0.L(this.f22521e), org.telegram.messenger.g0.L(this.f22521e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(m6.b0(m6.w0(this.f22522f, h6Var), m6.w0(m6.f29473i6, h6Var), org.telegram.messenger.g0.L(this.f22521e), org.telegram.messenger.g0.L(this.f22521e)));
        setColorFilter(new PorterDuffColorFilter(m6.w0(m6.G6, h6Var), PorterDuff.Mode.SRC_IN));
    }
}
