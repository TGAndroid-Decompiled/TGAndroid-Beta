package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.HashSet;
public final class ug9 extends ImageView implements snb {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public byte e;
    public int f;
    public final vnb h;
    public boolean n;
    public boolean r;
    public boolean s;

    public ug9(int i, vnb vnbVar, Context context) {
        super(context);
        this.e = (byte) 20;
        this.f = aob.d6;
        this.n = true;
        this.s = true;
        this.b = i;
        this.a = i;
        this.h = vnbVar;
        if (i != 0) {
            setImageResource(i);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        iye.a(this);
        updateColors();
    }

    public final void a() {
        e(this.a);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Fi));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.i6));
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
        wg9 wg9Var = new wg9(getContext(), this.b);
        wg9Var.d = this.f;
        wg9Var.a(this.d);
        setImageDrawable(wg9Var);
    }

    public final void e(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        if (this.c) {
            wg9 wg9Var = new wg9(getContext(), i);
            wg9Var.d = this.f;
            wg9Var.a(this.d);
            hl.M3(this, wg9Var);
            return;
        }
        hl.L3(this, i);
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
        animate.alpha(f).setDuration(320L).setInterpolator(k43.h).start();
    }

    public void setPremiumLocked(boolean z) {
        this.d = z;
        if (getDrawable() instanceof wg9) {
            ((wg9) getDrawable()).a(z);
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
        vnb vnbVar = this.h;
        if (z) {
            if (this.s) {
                i = aob.Fi;
            } else {
                i = aob.G6;
            }
            int w0 = aob.w0(null, i, false);
            setBackground(aob.Z(aob.v(aob.v0(this.f, vnbVar), aob.p1(0.1f, w0)), aob.p1(0.1f, w0), hl.L(this.e), hl.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(aob.Z(aob.v0(this.f, vnbVar), aob.v0(aob.i6, vnbVar), hl.L(this.e), hl.L(this.e)));
        setColorFilter(new PorterDuffColorFilter(aob.v0(aob.G6, vnbVar), PorterDuff.Mode.SRC_IN));
    }
}
