package ii;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.js;
public final class a2 extends ImageView implements org.telegram.ui.ActionBar.x5 {
    public final int f12260a;
    public int f12261b;
    public boolean f12262c;
    public boolean d;
    public int f12263e;
    public int f12264f;
    public final org.telegram.ui.ActionBar.c6 h;
    public boolean f12265n;
    public boolean f12266r;
    public boolean f12267s;

    public a2(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f12263e = 20;
        this.f12264f = org.telegram.ui.ActionBar.h6.f20560d6;
        this.f12265n = true;
        this.f12267s = true;
        this.f12261b = i10;
        this.f12260a = i10;
        this.h = c6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.y5.a(this);
        e();
    }

    public final void a() {
        f(this.f12260a);
    }

    public final void b() {
        if (!this.f12267s) {
            return;
        }
        this.f12267s = false;
        e();
    }

    public final void c(int i10) {
        if (this.f12264f == i10) {
            return;
        }
        this.f12264f = i10;
        e();
    }

    public final void d() {
        this.f12262c = true;
        c2 c2Var = new c2(getContext(), this.f12261b);
        c2Var.d = this.f12264f;
        c2Var.a(this.d);
        setImageDrawable(c2Var);
    }

    @Override
    public final void e() {
        int i10;
        boolean z10 = this.f12266r;
        org.telegram.ui.ActionBar.c6 c6Var = this.h;
        if (z10) {
            if (this.f12267s) {
                i10 = org.telegram.ui.ActionBar.h6.Oh;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.G6;
            }
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
            setBackground(org.telegram.ui.ActionBar.h6.a0(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(this.f12264f, c6Var), org.telegram.ui.ActionBar.h6.m1(0.1f, x02)), org.telegram.ui.ActionBar.h6.m1(0.1f, x02), AndroidUtilities.dp(this.f12263e), AndroidUtilities.dp(this.f12263e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(org.telegram.ui.ActionBar.h6.a0(org.telegram.ui.ActionBar.h6.w0(this.f12264f, c6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20651i6, c6Var), AndroidUtilities.dp(this.f12263e), AndroidUtilities.dp(this.f12263e)));
        setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void f(int i10) {
        if (this.f12261b == i10) {
            return;
        }
        this.f12261b = i10;
        if (this.f12262c) {
            c2 c2Var = new c2(getContext(), i10);
            c2Var.d = this.f12264f;
            c2Var.a(this.d);
            AndroidUtilities.updateImageViewImageAnimated(this, c2Var);
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
        if (this.f12265n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f12265n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(320L).setInterpolator(js.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof c2) {
            ((c2) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f12266r == z10) {
            return;
        }
        this.f12266r = z10;
        e();
    }
}
