package oi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.na;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
public final class v1 extends ImageView implements org.telegram.ui.ActionBar.z5 {
    public final int f22046a;
    public int f22047b;
    public boolean f22048c;
    public boolean d;
    public int f22049e;
    public int f22050f;
    public final e6 h;
    public boolean f22051n;
    public boolean f22052r;
    public boolean f22053s;

    public v1(int i7, Context context, e6 e6Var) {
        super(context);
        this.f22049e = 20;
        this.f22050f = j6.f28849d6;
        this.f22051n = true;
        this.f22053s = true;
        this.f22047b = i7;
        this.f22046a = i7;
        this.h = e6Var;
        if (i7 != 0) {
            setImageResource(i7);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        na.a(this);
        updateColors();
    }

    public final void a() {
        e(this.f22046a);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.Fi));
        hashSet.add(Integer.valueOf(j6.G6));
        hashSet.add(Integer.valueOf(j6.f28941i6));
        hashSet.add(Integer.valueOf(this.f22050f));
    }

    public final void b() {
        if (!this.f22053s) {
            return;
        }
        this.f22053s = false;
        updateColors();
    }

    public final void c(int i7) {
        if (this.f22050f == i7) {
            return;
        }
        this.f22050f = i7;
        updateColors();
    }

    public final void d() {
        this.f22048c = true;
        x1 x1Var = new x1(getContext(), this.f22047b);
        x1Var.d = this.f22050f;
        x1Var.a(this.d);
        setImageDrawable(x1Var);
    }

    public final void e(int i7) {
        if (this.f22047b == i7) {
            return;
        }
        this.f22047b = i7;
        if (this.f22048c) {
            x1 x1Var = new x1(getContext(), i7);
            x1Var.d = this.f22050f;
            x1Var.a(this.d);
            org.telegram.messenger.g0.R3(this, x1Var);
            return;
        }
        org.telegram.messenger.g0.Q3(this, i7);
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        if (this.f22051n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f22051n = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(320L).setInterpolator(er.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof x1) {
            ((x1) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f22052r == z10) {
            return;
        }
        this.f22052r = z10;
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i7;
        boolean z10 = this.f22052r;
        e6 e6Var = this.h;
        if (z10) {
            if (this.f22053s) {
                i7 = j6.Fi;
            } else {
                i7 = j6.G6;
            }
            int x02 = j6.x0(null, i7, false);
            setBackground(j6.b0(j6.w(j6.w0(this.f22050f, e6Var), j6.r1(0.1f, x02)), j6.r1(0.1f, x02), org.telegram.messenger.g0.L(this.f22049e), org.telegram.messenger.g0.L(this.f22049e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(j6.b0(j6.w0(this.f22050f, e6Var), j6.w0(j6.f28941i6, e6Var), org.telegram.messenger.g0.L(this.f22049e), org.telegram.messenger.g0.L(this.f22049e)));
        setColorFilter(new PorterDuffColorFilter(j6.w0(j6.G6, e6Var), PorterDuff.Mode.SRC_IN));
    }
}
