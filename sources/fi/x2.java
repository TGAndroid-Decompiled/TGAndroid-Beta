package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class x2 extends AnimatorListenerAdapter {
    public final boolean f10088a;
    public final float f10089b;
    public final float f10090c;
    public final k3 d;

    public x2(k3 k3Var, boolean z10, float f7, float f10) {
        this.d = k3Var;
        this.f10088a = z10;
        this.f10089b = f7;
        this.f10090c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        k3 k3Var = this.d;
        b3 b3Var = k3Var.f9789x;
        h3 h3Var = k3Var.W;
        a3 a3Var = k3Var.v;
        k3Var.f9770h0 = false;
        boolean z10 = this.f10088a;
        if (!z10) {
            k3Var.D();
            k3Var.G();
            float f10 = this.f10089b;
            a3Var.setForceOffsetY(f10 - AndroidUtilities.dp(24.0f));
            a3Var.setTopActionBarOffsetY(f10 - AndroidUtilities.dp(24.0f));
            a3Var.setSwipeOffsetY(0.0f);
        } else {
            a3Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            a3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            a3Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f7 = k3Var.f9769g0;
        } else {
            f7 = 1.0f - k3Var.f9769g0;
        }
        k3Var.f9768f0 = f7;
        h3Var.setAlpha(1.0f - f7);
        h3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * k3Var.f9768f0);
        k3Var.m0.setAlpha(k3Var.f9768f0);
        if (z10) {
            h3Var.setVisibility(8);
        }
        a3Var.setSwipeOffsetAnimationDisallowed(false);
        a3Var.setTranslationX(AndroidUtilities.lerp(this.f10090c, 0.0f, k3Var.f9769g0));
        k3Var.f9774l0.setTranslationX(0.0f);
        k3Var.f9765e.invalidate();
        b3Var.setViewPortHeightOffset(0.0f);
        b3Var.o(true, true);
        k3Var.C();
    }
}
