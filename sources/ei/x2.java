package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class x2 extends AnimatorListenerAdapter {
    public final boolean f8729a;
    public final float f8730b;
    public final float f8731c;
    public final k3 d;

    public x2(k3 k3Var, boolean z10, float f7, float f10) {
        this.d = k3Var;
        this.f8729a = z10;
        this.f8730b = f7;
        this.f8731c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        k3 k3Var = this.d;
        b3 b3Var = k3Var.f8456x;
        h3 h3Var = k3Var.W;
        a3 a3Var = k3Var.v;
        k3Var.f8437h0 = false;
        boolean z10 = this.f8729a;
        if (!z10) {
            k3Var.D();
            k3Var.G();
            float f10 = this.f8730b;
            a3Var.setForceOffsetY(f10 - AndroidUtilities.dp(24.0f));
            a3Var.setTopActionBarOffsetY(f10 - AndroidUtilities.dp(24.0f));
            a3Var.setSwipeOffsetY(0.0f);
        } else {
            a3Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            a3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            a3Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f7 = k3Var.f8436g0;
        } else {
            f7 = 1.0f - k3Var.f8436g0;
        }
        k3Var.f8435f0 = f7;
        h3Var.setAlpha(1.0f - f7);
        h3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * k3Var.f8435f0);
        k3Var.m0.setAlpha(k3Var.f8435f0);
        if (z10) {
            h3Var.setVisibility(8);
        }
        a3Var.setSwipeOffsetAnimationDisallowed(false);
        a3Var.setTranslationX(AndroidUtilities.lerp(this.f8731c, 0.0f, k3Var.f8436g0));
        k3Var.f8441l0.setTranslationX(0.0f);
        k3Var.e.invalidate();
        b3Var.setViewPortHeightOffset(0.0f);
        b3Var.o(true, true);
        k3Var.C();
    }
}
