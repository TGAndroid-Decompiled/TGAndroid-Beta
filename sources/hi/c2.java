package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;
public final class c2 extends ImageView implements org.telegram.ui.ActionBar.a6 {
    public final int f9491a;
    public int f9492b;
    public boolean f9493c;
    public boolean d;
    public int e;
    public int f9494f;
    public final org.telegram.ui.ActionBar.f6 h;
    public boolean f9495n;
    public boolean f9496r;
    public boolean f9497s;

    public c2(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 20;
        this.f9494f = org.telegram.ui.ActionBar.j6.f17928d6;
        this.f9495n = true;
        this.f9497s = true;
        this.f9492b = i10;
        this.f9491a = i10;
        this.h = f6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.c6.a(this);
        e();
    }

    public final void a() {
        f(this.f9491a);
    }

    public final void b() {
        if (!this.f9497s) {
            return;
        }
        this.f9497s = false;
        e();
    }

    public final void c(int i10) {
        if (this.f9494f == i10) {
            return;
        }
        this.f9494f = i10;
        e();
    }

    public final void d() {
        this.f9493c = true;
        e2 e2Var = new e2(getContext(), this.f9492b);
        e2Var.d = this.f9494f;
        e2Var.a(this.d);
        setImageDrawable(e2Var);
    }

    @Override
    public final void e() {
        int i10;
        boolean z10 = this.f9496r;
        org.telegram.ui.ActionBar.f6 f6Var = this.h;
        if (z10) {
            if (this.f9497s) {
                i10 = org.telegram.ui.ActionBar.j6.Oh;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.G6;
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            setBackground(org.telegram.ui.ActionBar.j6.Z(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(this.f9494f, f6Var), org.telegram.ui.ActionBar.j6.l1(0.1f, w02)), org.telegram.ui.ActionBar.j6.l1(0.1f, w02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(org.telegram.ui.ActionBar.j6.Z(org.telegram.ui.ActionBar.j6.v0(this.f9494f, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
        setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void f(int i10) {
        if (this.f9492b == i10) {
            return;
        }
        this.f9492b = i10;
        if (this.f9493c) {
            e2 e2Var = new e2(getContext(), i10);
            e2Var.d = this.f9494f;
            e2Var.a(this.d);
            AndroidUtilities.updateImageViewImageAnimated(this, e2Var);
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
        if (this.f9495n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f9495n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(320L).setInterpolator(wr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof e2) {
            ((e2) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f9496r == z10) {
            return;
        }
        this.f9496r = z10;
        e();
    }
}
