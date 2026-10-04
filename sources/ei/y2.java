package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class y2 extends AnimatorListenerAdapter {
    public final boolean f9484a;
    public final float f9485b;
    public final float f9486c;
    public final l3 d;

    public y2(l3 l3Var, boolean z10, float f7, float f10) {
        this.d = l3Var;
        this.f9484a = z10;
        this.f9485b = f7;
        this.f9486c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l3 l3Var = this.d;
        c3 c3Var = l3Var.f9180x;
        i3 i3Var = l3Var.W;
        b3 b3Var = l3Var.v;
        l3Var.f9161h0 = false;
        boolean z10 = this.f9484a;
        if (!z10) {
            l3Var.D();
            l3Var.G();
            float f10 = this.f9485b;
            b3Var.setForceOffsetY(f10 - AndroidUtilities.dp(24.0f));
            b3Var.setTopActionBarOffsetY(f10 - AndroidUtilities.dp(24.0f));
            b3Var.setSwipeOffsetY(0.0f);
        } else {
            b3Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            b3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            b3Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f7 = l3Var.f9160g0;
        } else {
            f7 = 1.0f - l3Var.f9160g0;
        }
        l3Var.f9159f0 = f7;
        i3Var.setAlpha(1.0f - f7);
        i3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * l3Var.f9159f0);
        l3Var.m0.setAlpha(l3Var.f9159f0);
        if (z10) {
            i3Var.setVisibility(8);
        }
        b3Var.setSwipeOffsetAnimationDisallowed(false);
        b3Var.setTranslationX(AndroidUtilities.lerp(this.f9486c, 0.0f, l3Var.f9160g0));
        l3Var.f9165l0.setTranslationX(0.0f);
        l3Var.f9156e.invalidate();
        c3Var.setViewPortHeightOffset(0.0f);
        c3Var.o(true, true);
        l3Var.C();
    }
}
