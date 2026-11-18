package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h2 extends AnimatorListenerAdapter {
    public final boolean f18715a;
    public final float f18716b;
    public final float f18717c;
    public final t2 d;

    public h2(t2 t2Var, boolean z10, float f10, float f11) {
        this.d = t2Var;
        this.f18715a = z10;
        this.f18716b = f10;
        this.f18717c = f11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        t2 t2Var = this.d;
        l2 l2Var = t2Var.E;
        q2 q2Var = t2Var.Y;
        k2 k2Var = t2Var.f18952x;
        t2Var.f18935j0 = false;
        boolean z10 = this.f18715a;
        if (!z10) {
            t2Var.I();
            t2Var.L();
            float f11 = this.f18716b;
            k2Var.setForceOffsetY(f11 - org.telegram.messenger.g0.L(24.0f));
            k2Var.setTopActionBarOffsetY(f11 - org.telegram.messenger.g0.L(24.0f));
            k2Var.setSwipeOffsetY(0.0f);
        } else {
            k2Var.setForceOffsetY(-org.telegram.messenger.g0.L(24.0f));
            k2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            k2Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f10 = t2Var.f18934i0;
        } else {
            f10 = 1.0f - t2Var.f18934i0;
        }
        t2Var.f18933h0 = f10;
        q2Var.setAlpha(1.0f - f10);
        q2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * t2Var.f18933h0);
        t2Var.f18940o0.setAlpha(t2Var.f18933h0);
        if (z10) {
            q2Var.setVisibility(8);
        }
        k2Var.setSwipeOffsetAnimationDisallowed(false);
        k2Var.setTranslationX(org.telegram.messenger.g0.T1(this.f18717c, 0.0f, t2Var.f18934i0));
        t2Var.f18939n0.setTranslationX(0.0f);
        t2Var.f18930f.invalidate();
        l2Var.setViewPortHeightOffset(0.0f);
        l2Var.n(true, true);
        t2Var.H();
    }
}
