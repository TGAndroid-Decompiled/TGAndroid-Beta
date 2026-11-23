package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g2 extends AnimatorListenerAdapter {
    public final boolean f18795a;
    public final float f18796b;
    public final float f18797c;
    public final t2 d;

    public g2(t2 t2Var, boolean z10, float f10, float f11) {
        this.d = t2Var;
        this.f18795a = z10;
        this.f18796b = f10;
        this.f18797c = f11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        t2 t2Var = this.d;
        k2 k2Var = t2Var.E;
        q2 q2Var = t2Var.Y;
        j2 j2Var = t2Var.f19047x;
        t2Var.f19030j0 = false;
        boolean z10 = this.f18795a;
        if (!z10) {
            t2Var.I();
            t2Var.L();
            float f11 = this.f18796b;
            j2Var.setForceOffsetY(f11 - org.telegram.messenger.g0.L(24.0f));
            j2Var.setTopActionBarOffsetY(f11 - org.telegram.messenger.g0.L(24.0f));
            j2Var.setSwipeOffsetY(0.0f);
        } else {
            j2Var.setForceOffsetY(-org.telegram.messenger.g0.L(24.0f));
            j2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            j2Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f10 = t2Var.f19029i0;
        } else {
            f10 = 1.0f - t2Var.f19029i0;
        }
        t2Var.f19028h0 = f10;
        q2Var.setAlpha(1.0f - f10);
        q2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * t2Var.f19028h0);
        t2Var.f19035o0.setAlpha(t2Var.f19028h0);
        if (z10) {
            q2Var.setVisibility(8);
        }
        j2Var.setSwipeOffsetAnimationDisallowed(false);
        j2Var.setTranslationX(org.telegram.messenger.g0.T1(this.f18797c, 0.0f, t2Var.f19029i0));
        t2Var.f19034n0.setTranslationX(0.0f);
        t2Var.f19025f.invalidate();
        k2Var.setViewPortHeightOffset(0.0f);
        k2Var.n(true, true);
        t2Var.H();
    }
}
