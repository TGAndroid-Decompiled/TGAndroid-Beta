package oi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.sa;
import java.util.HashSet;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.kr;
public final class x1 extends ImageView implements org.telegram.ui.ActionBar.c6 {
    public final int f22585a;
    public int f22586b;
    public boolean f22587c;
    public boolean d;
    public int f22588e;
    public int f22589f;
    public final i6 h;
    public boolean f22590n;
    public boolean f22591r;
    public boolean f22592s;

    public x1(int i7, Context context, i6 i6Var) {
        super(context);
        this.f22588e = 20;
        this.f22589f = n6.f29451d6;
        this.f22590n = true;
        this.f22592s = true;
        this.f22586b = i7;
        this.f22585a = i7;
        this.h = i6Var;
        if (i7 != 0) {
            setImageResource(i7);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        sa.a(this);
        updateColors();
    }

    public final void a() {
        e(this.f22585a);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.Fi));
        hashSet.add(Integer.valueOf(n6.G6));
        hashSet.add(Integer.valueOf(n6.f29543i6));
        hashSet.add(Integer.valueOf(this.f22589f));
    }

    public final void b() {
        if (!this.f22592s) {
            return;
        }
        this.f22592s = false;
        updateColors();
    }

    public final void c(int i7) {
        if (this.f22589f == i7) {
            return;
        }
        this.f22589f = i7;
        updateColors();
    }

    public final void d() {
        this.f22587c = true;
        z1 z1Var = new z1(getContext(), this.f22586b);
        z1Var.d = this.f22589f;
        z1Var.a(this.d);
        setImageDrawable(z1Var);
    }

    public final void e(int i7) {
        if (this.f22586b == i7) {
            return;
        }
        this.f22586b = i7;
        if (this.f22587c) {
            z1 z1Var = new z1(getContext(), i7);
            z1Var.d = this.f22589f;
            z1Var.a(this.d);
            org.telegram.messenger.g0.Q3(this, z1Var);
            return;
        }
        org.telegram.messenger.g0.P3(this, i7);
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        if (this.f22590n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f22590n = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(320L).setInterpolator(kr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof z1) {
            ((z1) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f22591r == z10) {
            return;
        }
        this.f22591r = z10;
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i7;
        boolean z10 = this.f22591r;
        i6 i6Var = this.h;
        if (z10) {
            if (this.f22592s) {
                i7 = n6.Fi;
            } else {
                i7 = n6.G6;
            }
            int x02 = n6.x0(null, i7, false);
            setBackground(n6.b0(n6.w(n6.w0(this.f22589f, i6Var), n6.r1(0.1f, x02)), n6.r1(0.1f, x02), org.telegram.messenger.g0.L(this.f22588e), org.telegram.messenger.g0.L(this.f22588e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(n6.b0(n6.w0(this.f22589f, i6Var), n6.w0(n6.f29543i6, i6Var), org.telegram.messenger.g0.L(this.f22588e), org.telegram.messenger.g0.L(this.f22588e)));
        setColorFilter(new PorterDuffColorFilter(n6.w0(n6.G6, i6Var), PorterDuff.Mode.SRC_IN));
    }
}
