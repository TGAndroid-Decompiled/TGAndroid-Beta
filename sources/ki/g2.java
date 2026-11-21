package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g2 extends AnimatorListenerAdapter {
    public final boolean f18722a;
    public final float f18723b;
    public final float f18724c;
    public final s2 d;

    public g2(s2 s2Var, boolean z10, float f10, float f11) {
        this.d = s2Var;
        this.f18722a = z10;
        this.f18723b = f10;
        this.f18724c = f11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        s2 s2Var = this.d;
        k2 k2Var = s2Var.E;
        p2 p2Var = s2Var.Y;
        j2 j2Var = s2Var.f18959x;
        s2Var.f18942j0 = false;
        boolean z10 = this.f18722a;
        if (!z10) {
            s2Var.I();
            s2Var.L();
            float f11 = this.f18723b;
            j2Var.setForceOffsetY(f11 - org.telegram.messenger.g0.L(24.0f));
            j2Var.setTopActionBarOffsetY(f11 - org.telegram.messenger.g0.L(24.0f));
            j2Var.setSwipeOffsetY(0.0f);
        } else {
            j2Var.setForceOffsetY(-org.telegram.messenger.g0.L(24.0f));
            j2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            j2Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f10 = s2Var.f18941i0;
        } else {
            f10 = 1.0f - s2Var.f18941i0;
        }
        s2Var.f18940h0 = f10;
        p2Var.setAlpha(1.0f - f10);
        p2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * s2Var.f18940h0);
        s2Var.f18947o0.setAlpha(s2Var.f18940h0);
        if (z10) {
            p2Var.setVisibility(8);
        }
        j2Var.setSwipeOffsetAnimationDisallowed(false);
        j2Var.setTranslationX(org.telegram.messenger.g0.T1(this.f18724c, 0.0f, s2Var.f18941i0));
        s2Var.f18946n0.setTranslationX(0.0f);
        s2Var.f18937f.invalidate();
        k2Var.setViewPortHeightOffset(0.0f);
        k2Var.n(true, true);
        s2Var.H();
    }
}
