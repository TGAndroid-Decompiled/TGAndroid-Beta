package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class x2 extends AnimatorListenerAdapter {
    public final boolean f8711a;
    public final float f8712b;
    public final float f8713c;
    public final k3 d;

    public x2(k3 k3Var, boolean z10, float f7, float f10) {
        this.d = k3Var;
        this.f8711a = z10;
        this.f8712b = f7;
        this.f8713c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        k3 k3Var = this.d;
        b3 b3Var = k3Var.f8438x;
        h3 h3Var = k3Var.W;
        a3 a3Var = k3Var.v;
        k3Var.f8419h0 = false;
        boolean z10 = this.f8711a;
        if (!z10) {
            k3Var.D();
            k3Var.G();
            float f10 = this.f8712b;
            a3Var.setForceOffsetY(f10 - AndroidUtilities.dp(24.0f));
            a3Var.setTopActionBarOffsetY(f10 - AndroidUtilities.dp(24.0f));
            a3Var.setSwipeOffsetY(0.0f);
        } else {
            a3Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            a3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            a3Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f7 = k3Var.f8418g0;
        } else {
            f7 = 1.0f - k3Var.f8418g0;
        }
        k3Var.f8417f0 = f7;
        h3Var.setAlpha(1.0f - f7);
        h3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * k3Var.f8417f0);
        k3Var.m0.setAlpha(k3Var.f8417f0);
        if (z10) {
            h3Var.setVisibility(8);
        }
        a3Var.setSwipeOffsetAnimationDisallowed(false);
        a3Var.setTranslationX(AndroidUtilities.lerp(this.f8713c, 0.0f, k3Var.f8418g0));
        k3Var.f8423l0.setTranslationX(0.0f);
        k3Var.e.invalidate();
        b3Var.setViewPortHeightOffset(0.0f);
        b3Var.o(true, true);
        k3Var.C();
    }
}
