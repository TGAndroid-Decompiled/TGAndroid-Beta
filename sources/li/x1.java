package li;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.ka;
import java.util.HashSet;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.xq;
public final class x1 extends ImageView implements org.telegram.ui.ActionBar.b6 {
    public final int f18976a;
    public int f18977b;
    public boolean f18978c;
    public boolean d;
    public int f18979e;
    public int f18980f;
    public final g6 h;
    public boolean f18981n;
    public boolean f18982r;
    public boolean f18983s;

    public x1(int i7, Context context, g6 g6Var) {
        super(context);
        this.f18979e = 20;
        this.f18980f = l6.f27865d6;
        this.f18981n = true;
        this.f18983s = true;
        this.f18977b = i7;
        this.f18976a = i7;
        this.h = g6Var;
        if (i7 != 0) {
            setImageResource(i7);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        ka.a(this);
        updateColors();
    }

    public final void a() {
        e(this.f18976a);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.Ci));
        hashSet.add(Integer.valueOf(l6.G6));
        hashSet.add(Integer.valueOf(l6.f27957i6));
        hashSet.add(Integer.valueOf(this.f18980f));
    }

    public final void b() {
        if (!this.f18983s) {
            return;
        }
        this.f18983s = false;
        updateColors();
    }

    public final void c(int i7) {
        if (this.f18980f == i7) {
            return;
        }
        this.f18980f = i7;
        updateColors();
    }

    public final void d() {
        this.f18978c = true;
        z1 z1Var = new z1(getContext(), this.f18977b);
        z1Var.d = this.f18980f;
        z1Var.a(this.d);
        setImageDrawable(z1Var);
    }

    public final void e(int i7) {
        if (this.f18977b == i7) {
            return;
        }
        this.f18977b = i7;
        if (this.f18978c) {
            z1 z1Var = new z1(getContext(), i7);
            z1Var.d = this.f18980f;
            z1Var.a(this.d);
            org.telegram.messenger.g0.S3(this, z1Var);
            return;
        }
        org.telegram.messenger.g0.R3(this, i7);
    }

    @Override
    public void setEnabled(boolean z9) {
        float f10;
        if (this.f18981n == z9) {
            return;
        }
        setClickable(z9);
        ViewPropertyAnimator animate = animate();
        this.f18981n = z9;
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
        if (this.f18982r == z9) {
            return;
        }
        this.f18982r = z9;
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i7;
        boolean z9 = this.f18982r;
        g6 g6Var = this.h;
        if (z9) {
            if (this.f18983s) {
                i7 = l6.Ci;
            } else {
                i7 = l6.G6;
            }
            int x02 = l6.x0(null, i7, false);
            setBackground(l6.b0(l6.w(l6.w0(this.f18980f, g6Var), l6.r1(0.1f, x02)), l6.r1(0.1f, x02), org.telegram.messenger.g0.L(this.f18979e), org.telegram.messenger.g0.L(this.f18979e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(l6.b0(l6.w0(this.f18980f, g6Var), l6.w0(l6.f27957i6, g6Var), org.telegram.messenger.g0.L(this.f18979e), org.telegram.messenger.g0.L(this.f18979e)));
        setColorFilter(new PorterDuffColorFilter(l6.w0(l6.G6, g6Var), PorterDuff.Mode.SRC_IN));
    }
}
