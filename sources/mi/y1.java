package mi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import b8.pf;
import java.util.HashSet;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
public final class y1 extends ImageView implements org.telegram.ui.ActionBar.z5 {
    public final int f20042a;
    public int f20043b;
    public boolean f20044c;
    public boolean d;
    public int f20045e;
    public int f20046f;
    public final org.telegram.ui.ActionBar.e6 h;
    public boolean f20047n;
    public boolean f20048r;
    public boolean f20049s;

    public y1(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f20045e = 20;
        this.f20046f = k6.f27878d6;
        this.f20047n = true;
        this.f20049s = true;
        this.f20043b = i3;
        this.f20042a = i3;
        this.h = e6Var;
        if (i3 != 0) {
            setImageResource(i3);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        pf.a(this);
        updateColors();
    }

    public final void a() {
        e(this.f20042a);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Ci));
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.f27972i6));
        hashSet.add(Integer.valueOf(this.f20046f));
    }

    public final void b() {
        if (!this.f20049s) {
            return;
        }
        this.f20049s = false;
        updateColors();
    }

    public final void c(int i3) {
        if (this.f20046f == i3) {
            return;
        }
        this.f20046f = i3;
        updateColors();
    }

    public final void d() {
        this.f20044c = true;
        a2 a2Var = new a2(getContext(), this.f20043b);
        a2Var.d = this.f20046f;
        a2Var.a(this.d);
        setImageDrawable(a2Var);
    }

    public final void e(int i3) {
        if (this.f20043b == i3) {
            return;
        }
        this.f20043b = i3;
        if (this.f20044c) {
            a2 a2Var = new a2(getContext(), i3);
            a2Var.d = this.f20046f;
            a2Var.a(this.d);
            org.telegram.messenger.g0.S3(this, a2Var);
            return;
        }
        org.telegram.messenger.g0.R3(this, i3);
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        if (this.f20047n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f20047n = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(320L).setInterpolator(xq.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof a2) {
            ((a2) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f20048r == z10) {
            return;
        }
        this.f20048r = z10;
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i3;
        boolean z10 = this.f20048r;
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        if (z10) {
            if (this.f20049s) {
                i3 = k6.Ci;
            } else {
                i3 = k6.G6;
            }
            int x02 = k6.x0(null, i3, false);
            setBackground(k6.b0(k6.w(k6.w0(this.f20046f, e6Var), k6.r1(0.1f, x02)), k6.r1(0.1f, x02), org.telegram.messenger.g0.L(this.f20045e), org.telegram.messenger.g0.L(this.f20045e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(k6.b0(k6.w0(this.f20046f, e6Var), k6.w0(k6.f27972i6, e6Var), org.telegram.messenger.g0.L(this.f20045e), org.telegram.messenger.g0.L(this.f20045e)));
        setColorFilter(new PorterDuffColorFilter(k6.w0(k6.G6, e6Var), PorterDuff.Mode.SRC_IN));
    }
}
