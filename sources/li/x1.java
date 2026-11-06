package li;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.ka;
import java.util.HashSet;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
public final class x1 extends ImageView implements org.telegram.ui.ActionBar.a6 {
    public final int f18973a;
    public int f18974b;
    public boolean f18975c;
    public boolean d;
    public int f18976e;
    public int f18977f;
    public final f6 h;
    public boolean f18978n;
    public boolean f18979r;
    public boolean f18980s;

    public x1(int i7, Context context, f6 f6Var) {
        super(context);
        this.f18976e = 20;
        this.f18977f = k6.f27848d6;
        this.f18978n = true;
        this.f18980s = true;
        this.f18974b = i7;
        this.f18973a = i7;
        this.h = f6Var;
        if (i7 != 0) {
            setImageResource(i7);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        ka.a(this);
        updateColors();
    }

    public final void a() {
        e(this.f18973a);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Ci));
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.f27940i6));
        hashSet.add(Integer.valueOf(this.f18977f));
    }

    public final void b() {
        if (!this.f18980s) {
            return;
        }
        this.f18980s = false;
        updateColors();
    }

    public final void c(int i7) {
        if (this.f18977f == i7) {
            return;
        }
        this.f18977f = i7;
        updateColors();
    }

    public final void d() {
        this.f18975c = true;
        z1 z1Var = new z1(getContext(), this.f18974b);
        z1Var.d = this.f18977f;
        z1Var.a(this.d);
        setImageDrawable(z1Var);
    }

    public final void e(int i7) {
        if (this.f18974b == i7) {
            return;
        }
        this.f18974b = i7;
        if (this.f18975c) {
            z1 z1Var = new z1(getContext(), i7);
            z1Var.d = this.f18977f;
            z1Var.a(this.d);
            org.telegram.messenger.g0.S3(this, z1Var);
            return;
        }
        org.telegram.messenger.g0.R3(this, i7);
    }

    @Override
    public void setEnabled(boolean z9) {
        float f10;
        if (this.f18978n == z9) {
            return;
        }
        setClickable(z9);
        ViewPropertyAnimator animate = animate();
        this.f18978n = z9;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(320L).setInterpolator(xq.h).start();
    }

    public void setPremiumLocked(boolean z9) {
        this.d = z9;
        if (getDrawable() instanceof z1) {
            ((z1) getDrawable()).a(z9);
        }
    }

    @Override
    public void setSelected(boolean z9) {
        if (this.f18979r == z9) {
            return;
        }
        this.f18979r = z9;
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i7;
        boolean z9 = this.f18979r;
        f6 f6Var = this.h;
        if (z9) {
            if (this.f18980s) {
                i7 = k6.Ci;
            } else {
                i7 = k6.G6;
            }
            int x02 = k6.x0(null, i7, false);
            setBackground(k6.b0(k6.w(k6.w0(this.f18977f, f6Var), k6.r1(0.1f, x02)), k6.r1(0.1f, x02), org.telegram.messenger.g0.L(this.f18976e), org.telegram.messenger.g0.L(this.f18976e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(k6.b0(k6.w0(this.f18977f, f6Var), k6.w0(k6.f27940i6, f6Var), org.telegram.messenger.g0.L(this.f18976e), org.telegram.messenger.g0.L(this.f18976e)));
        setColorFilter(new PorterDuffColorFilter(k6.w0(k6.G6, f6Var), PorterDuff.Mode.SRC_IN));
    }
}
