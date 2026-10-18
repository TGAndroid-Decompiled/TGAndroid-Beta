package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
public final class z1 extends ImageView implements org.telegram.ui.ActionBar.y5 {
    public final int f15681a;
    public int f15682b;
    public boolean f15683c;
    public boolean d;
    public int e;
    public int f15684f;
    public final org.telegram.ui.ActionBar.d6 h;
    public boolean f15685n;
    public boolean f15686r;
    public boolean f15687s;

    public z1(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = 20;
        this.f15684f = h6.f20993d6;
        this.f15685n = true;
        this.f15687s = true;
        this.f15682b = i10;
        this.f15681a = i10;
        this.h = d6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.b6.a(this);
        d();
    }

    public final void a() {
        f(this.f15681a);
    }

    public final void b() {
        if (!this.f15687s) {
            return;
        }
        this.f15687s = false;
        d();
    }

    public final void c(int i10) {
        if (this.f15684f == i10) {
            return;
        }
        this.f15684f = i10;
        d();
    }

    @Override
    public final void d() {
        int i10;
        boolean z10 = this.f15686r;
        org.telegram.ui.ActionBar.d6 d6Var = this.h;
        if (z10) {
            if (this.f15687s) {
                i10 = h6.Oh;
            } else {
                i10 = h6.G6;
            }
            int x02 = h6.x0(null, i10, false);
            setBackground(h6.a0(h6.v(h6.w0(this.f15684f, d6Var), h6.m1(0.1f, x02)), h6.m1(0.1f, x02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(h6.a0(h6.w0(this.f15684f, d6Var), h6.w0(h6.f21082i6, d6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
        setColorFilter(new PorterDuffColorFilter(h6.w0(h6.G6, d6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void e() {
        this.f15683c = true;
        b2 b2Var = new b2(getContext(), this.f15682b);
        b2Var.d = this.f15684f;
        b2Var.a(this.d);
        setImageDrawable(b2Var);
    }

    public final void f(int i10) {
        if (this.f15682b == i10) {
            return;
        }
        this.f15682b = i10;
        if (this.f15683c) {
            b2 b2Var = new b2(getContext(), i10);
            b2Var.d = this.f15684f;
            b2Var.a(this.d);
            AndroidUtilities.updateImageViewImageAnimated(this, b2Var);
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(this, i10);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        if (this.f15685n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f15685n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(320L).setInterpolator(bs.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof b2) {
            ((b2) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f15686r == z10) {
            return;
        }
        this.f15686r = z10;
        d();
    }
}
