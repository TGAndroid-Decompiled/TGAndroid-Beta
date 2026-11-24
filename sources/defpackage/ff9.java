package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.HashSet;
public final class ff9 extends ImageView implements vlb {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public byte e;
    public int f;
    public final ylb h;
    public boolean n;
    public boolean r;
    public boolean s;

    public ff9(int i, ylb ylbVar, Context context) {
        super(context);
        this.e = (byte) 20;
        this.f = cmb.c6;
        this.n = true;
        this.s = true;
        this.b = i;
        this.a = i;
        this.h = ylbVar;
        if (i != 0) {
            setImageResource(i);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        rve.a(this);
        updateColors();
    }

    public final void a() {
        e(this.a);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Ei));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(this.f));
    }

    public final void b() {
        if (!this.s) {
            return;
        }
        this.s = false;
        updateColors();
    }

    public final void c(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        updateColors();
    }

    public final void d() {
        this.c = true;
        hf9 hf9Var = new hf9(getContext(), this.b);
        hf9Var.d = this.f;
        hf9Var.a(this.d);
        setImageDrawable(hf9Var);
    }

    public final void e(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        if (this.c) {
            hf9 hf9Var = new hf9(getContext(), i);
            hf9Var.d = this.f;
            hf9Var.a(this.d);
            gm.M3(this, hf9Var);
            return;
        }
        gm.L3(this, i);
    }

    @Override
    public void setEnabled(boolean z) {
        float f;
        if (this.n == z) {
            return;
        }
        setClickable(z);
        ViewPropertyAnimator animate = animate();
        this.n = z;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        animate.alpha(f).setDuration(320L).setInterpolator(d53.h).start();
    }

    public void setPremiumLocked(boolean z) {
        this.d = z;
        if (getDrawable() instanceof hf9) {
            ((hf9) getDrawable()).a(z);
        }
    }

    @Override
    public void setSelected(boolean z) {
        if (this.r == z) {
            return;
        }
        this.r = z;
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i;
        boolean z = this.r;
        ylb ylbVar = this.h;
        if (z) {
            if (this.s) {
                i = cmb.Ei;
            } else {
                i = cmb.F6;
            }
            int w0 = cmb.w0(null, i, false);
            setBackground(cmb.Z(cmb.v(cmb.v0(this.f, ylbVar), cmb.p1(0.1f, w0)), cmb.p1(0.1f, w0), gm.L(this.e), gm.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(cmb.Z(cmb.v0(this.f, ylbVar), cmb.v0(cmb.h6, ylbVar), gm.L(this.e), gm.L(this.e)));
        setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.F6, ylbVar), PorterDuff.Mode.SRC_IN));
    }
}
