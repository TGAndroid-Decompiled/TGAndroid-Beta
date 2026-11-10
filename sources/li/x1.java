package li;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.ka;
import java.util.HashSet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.wq;
public final class x1 extends ImageView implements org.telegram.ui.ActionBar.c6 {
    public final int f18981a;
    public int f18982b;
    public boolean f18983c;
    public boolean d;
    public int f18984e;
    public int f18985f;
    public final h6 h;
    public boolean f18986n;
    public boolean f18987r;
    public boolean f18988s;

    public x1(int i7, Context context, h6 h6Var) {
        super(context);
        this.f18984e = 20;
        this.f18985f = m6.f27890d6;
        this.f18986n = true;
        this.f18988s = true;
        this.f18982b = i7;
        this.f18981a = i7;
        this.h = h6Var;
        if (i7 != 0) {
            setImageResource(i7);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        ka.a(this);
        updateColors();
    }

    public final void a() {
        e(this.f18981a);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Ci));
        hashSet.add(Integer.valueOf(m6.G6));
        hashSet.add(Integer.valueOf(m6.f27982i6));
        hashSet.add(Integer.valueOf(this.f18985f));
    }

    public final void b() {
        if (!this.f18988s) {
            return;
        }
        this.f18988s = false;
        updateColors();
    }

    public final void c(int i7) {
        if (this.f18985f == i7) {
            return;
        }
        this.f18985f = i7;
        updateColors();
    }

    public final void d() {
        this.f18983c = true;
        z1 z1Var = new z1(getContext(), this.f18982b);
        z1Var.d = this.f18985f;
        z1Var.a(this.d);
        setImageDrawable(z1Var);
    }

    public final void e(int i7) {
        if (this.f18982b == i7) {
            return;
        }
        this.f18982b = i7;
        if (this.f18983c) {
            z1 z1Var = new z1(getContext(), i7);
            z1Var.d = this.f18985f;
            z1Var.a(this.d);
            org.telegram.messenger.g0.S3(this, z1Var);
            return;
        }
        org.telegram.messenger.g0.R3(this, i7);
    }

    @Override
    public void setEnabled(boolean z9) {
        float f10;
        if (this.f18986n == z9) {
            return;
        }
        setClickable(z9);
        ViewPropertyAnimator animate = animate();
        this.f18986n = z9;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(320L).setInterpolator(wq.h).start();
    }

    public void setPremiumLocked(boolean z9) {
        this.d = z9;
        if (getDrawable() instanceof z1) {
            ((z1) getDrawable()).a(z9);
        }
    }

    @Override
    public void setSelected(boolean z9) {
        if (this.f18987r == z9) {
            return;
        }
        this.f18987r = z9;
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i7;
        boolean z9 = this.f18987r;
        h6 h6Var = this.h;
        if (z9) {
            if (this.f18988s) {
                i7 = m6.Ci;
            } else {
                i7 = m6.G6;
            }
            int x02 = m6.x0(null, i7, false);
            setBackground(m6.b0(m6.w(m6.w0(this.f18985f, h6Var), m6.r1(0.1f, x02)), m6.r1(0.1f, x02), org.telegram.messenger.g0.L(this.f18984e), org.telegram.messenger.g0.L(this.f18984e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(m6.b0(m6.w0(this.f18985f, h6Var), m6.w0(m6.f27982i6, h6Var), org.telegram.messenger.g0.L(this.f18984e), org.telegram.messenger.g0.L(this.f18984e)));
        setColorFilter(new PorterDuffColorFilter(m6.w0(m6.G6, h6Var), PorterDuff.Mode.SRC_IN));
    }
}
