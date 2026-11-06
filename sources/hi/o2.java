package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final boolean f14839a;
    public final float f14840b;
    public final float f14841c;
    public final a3 d;

    public o2(a3 a3Var, boolean z9, float f10, float f11) {
        this.d = a3Var;
        this.f14839a = z9;
        this.f14840b = f10;
        this.f14841c = f11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        a3 a3Var = this.d;
        s2 s2Var = a3Var.D;
        x2 x2Var = a3Var.X;
        r2 r2Var = a3Var.f14541x;
        a3Var.f14523i0 = false;
        boolean z9 = this.f14839a;
        if (!z9) {
            a3Var.I();
            a3Var.L();
            float f11 = this.f14840b;
            r2Var.setForceOffsetY(f11 - org.telegram.messenger.g0.L(24.0f));
            r2Var.setTopActionBarOffsetY(f11 - org.telegram.messenger.g0.L(24.0f));
            r2Var.setSwipeOffsetY(0.0f);
        } else {
            r2Var.setForceOffsetY(-org.telegram.messenger.g0.L(24.0f));
            r2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            r2Var.setSwipeOffsetY(0.0f);
        }
        if (z9) {
            f10 = a3Var.f14522h0;
        } else {
            f10 = 1.0f - a3Var.f14522h0;
        }
        a3Var.f14521g0 = f10;
        x2Var.setAlpha(1.0f - f10);
        x2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * a3Var.f14521g0);
        a3Var.f14528n0.setAlpha(a3Var.f14521g0);
        if (z9) {
            x2Var.setVisibility(8);
        }
        r2Var.setSwipeOffsetAnimationDisallowed(false);
        r2Var.setTranslationX(org.telegram.messenger.g0.T1(this.f14841c, 0.0f, a3Var.f14522h0));
        a3Var.m0.setTranslationX(0.0f);
        a3Var.f14519f.invalidate();
        s2Var.setViewPortHeightOffset(0.0f);
        s2Var.n(true, true);
        a3Var.H();
    }
}
