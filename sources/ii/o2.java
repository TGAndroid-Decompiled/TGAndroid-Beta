package ii;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final boolean f15129a;
    public final float f15130b;
    public final float f15131c;
    public final a3 d;

    public o2(a3 a3Var, boolean z10, float f10, float f11) {
        this.d = a3Var;
        this.f15129a = z10;
        this.f15130b = f10;
        this.f15131c = f11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        a3 a3Var = this.d;
        s2 s2Var = a3Var.E;
        x2 x2Var = a3Var.Y;
        r2 r2Var = a3Var.f14824x;
        a3Var.f14807j0 = false;
        boolean z10 = this.f15129a;
        if (!z10) {
            a3Var.I();
            a3Var.L();
            float f11 = this.f15130b;
            r2Var.setForceOffsetY(f11 - org.telegram.messenger.g0.L(24.0f));
            r2Var.setTopActionBarOffsetY(f11 - org.telegram.messenger.g0.L(24.0f));
            r2Var.setSwipeOffsetY(0.0f);
        } else {
            r2Var.setForceOffsetY(-org.telegram.messenger.g0.L(24.0f));
            r2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            r2Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f10 = a3Var.f14806i0;
        } else {
            f10 = 1.0f - a3Var.f14806i0;
        }
        a3Var.f14805h0 = f10;
        x2Var.setAlpha(1.0f - f10);
        x2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * a3Var.f14805h0);
        a3Var.f14812o0.setAlpha(a3Var.f14805h0);
        if (z10) {
            x2Var.setVisibility(8);
        }
        r2Var.setSwipeOffsetAnimationDisallowed(false);
        r2Var.setTranslationX(org.telegram.messenger.g0.T1(this.f15131c, 0.0f, a3Var.f14806i0));
        a3Var.f14811n0.setTranslationX(0.0f);
        a3Var.f14802f.invalidate();
        s2Var.setViewPortHeightOffset(0.0f);
        s2Var.n(true, true);
        a3Var.H();
    }
}
