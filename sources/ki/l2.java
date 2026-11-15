package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l2 extends AnimatorListenerAdapter {
    public final boolean f18426a;
    public final float f18427b;
    public final float f18428c;
    public final x2 d;

    public l2(x2 x2Var, boolean z10, float f10, float f11) {
        this.d = x2Var;
        this.f18426a = z10;
        this.f18427b = f10;
        this.f18428c = f11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        x2 x2Var = this.d;
        p2 p2Var = x2Var.E;
        u2 u2Var = x2Var.Y;
        o2 o2Var = x2Var.f18683x;
        x2Var.f18666j0 = false;
        boolean z10 = this.f18426a;
        if (!z10) {
            x2Var.I();
            x2Var.L();
            float f11 = this.f18427b;
            o2Var.setForceOffsetY(f11 - org.telegram.messenger.g0.L(24.0f));
            o2Var.setTopActionBarOffsetY(f11 - org.telegram.messenger.g0.L(24.0f));
            o2Var.setSwipeOffsetY(0.0f);
        } else {
            o2Var.setForceOffsetY(-org.telegram.messenger.g0.L(24.0f));
            o2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            o2Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f10 = x2Var.f18665i0;
        } else {
            f10 = 1.0f - x2Var.f18665i0;
        }
        x2Var.f18664h0 = f10;
        u2Var.setAlpha(1.0f - f10);
        u2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * x2Var.f18664h0);
        x2Var.f18671o0.setAlpha(x2Var.f18664h0);
        if (z10) {
            u2Var.setVisibility(8);
        }
        o2Var.setSwipeOffsetAnimationDisallowed(false);
        o2Var.setTranslationX(org.telegram.messenger.g0.T1(this.f18428c, 0.0f, x2Var.f18665i0));
        x2Var.f18670n0.setTranslationX(0.0f);
        x2Var.f18661f.invalidate();
        p2Var.setViewPortHeightOffset(0.0f);
        p2Var.n(true, true);
        x2Var.H();
    }
}
