package oi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.sa;
import java.util.HashSet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.nr;
public final class w1 extends ImageView implements org.telegram.ui.ActionBar.b6 {
    public final int f22455a;
    public int f22456b;
    public boolean f22457c;
    public boolean d;
    public int f22458e;
    public int f22459f;
    public final h6 h;
    public boolean f22460n;
    public boolean f22461r;
    public boolean f22462s;

    public w1(int i7, Context context, h6 h6Var) {
        super(context);
        this.f22458e = 20;
        this.f22459f = m6.f29347d6;
        this.f22460n = true;
        this.f22462s = true;
        this.f22456b = i7;
        this.f22455a = i7;
        this.h = h6Var;
        if (i7 != 0) {
            setImageResource(i7);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        sa.a(this);
        updateColors();
    }

    public final void a() {
        e(this.f22455a);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Fi));
        hashSet.add(Integer.valueOf(m6.G6));
        hashSet.add(Integer.valueOf(m6.f29439i6));
        hashSet.add(Integer.valueOf(this.f22459f));
    }

    public final void b() {
        if (!this.f22462s) {
            return;
        }
        this.f22462s = false;
        updateColors();
    }

    public final void c(int i7) {
        if (this.f22459f == i7) {
            return;
        }
        this.f22459f = i7;
        updateColors();
    }

    public final void d() {
        this.f22457c = true;
        y1 y1Var = new y1(getContext(), this.f22456b);
        y1Var.d = this.f22459f;
        y1Var.a(this.d);
        setImageDrawable(y1Var);
    }

    public final void e(int i7) {
        if (this.f22456b == i7) {
            return;
        }
        this.f22456b = i7;
        if (this.f22457c) {
            y1 y1Var = new y1(getContext(), i7);
            y1Var.d = this.f22459f;
            y1Var.a(this.d);
            org.telegram.messenger.g0.Q3(this, y1Var);
            return;
        }
        org.telegram.messenger.g0.P3(this, i7);
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        if (this.f22460n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f22460n = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(320L).setInterpolator(nr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof y1) {
            ((y1) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f22461r == z10) {
            return;
        }
        this.f22461r = z10;
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i7;
        boolean z10 = this.f22461r;
        h6 h6Var = this.h;
        if (z10) {
            if (this.f22462s) {
                i7 = m6.Fi;
            } else {
                i7 = m6.G6;
            }
            int x02 = m6.x0(null, i7, false);
            setBackground(m6.b0(m6.w(m6.w0(this.f22459f, h6Var), m6.r1(0.1f, x02)), m6.r1(0.1f, x02), org.telegram.messenger.g0.L(this.f22458e), org.telegram.messenger.g0.L(this.f22458e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(m6.b0(m6.w0(this.f22459f, h6Var), m6.w0(m6.f29439i6, h6Var), org.telegram.messenger.g0.L(this.f22458e), org.telegram.messenger.g0.L(this.f22458e)));
        setColorFilter(new PorterDuffColorFilter(m6.w0(m6.G6, h6Var), PorterDuff.Mode.SRC_IN));
    }
}
