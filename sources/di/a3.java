package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class a3 extends AnimatorListenerAdapter {
    public final boolean f6518a;
    public final float f6519b;
    public final float f6520c;
    public final n3 d;

    public a3(n3 n3Var, boolean z10, float f7, float f10) {
        this.d = n3Var;
        this.f6518a = z10;
        this.f6519b = f7;
        this.f6520c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        n3 n3Var = this.d;
        e3 e3Var = n3Var.f6812x;
        k3 k3Var = n3Var.W;
        d3 d3Var = n3Var.v;
        n3Var.f6793h0 = false;
        boolean z10 = this.f6518a;
        if (!z10) {
            n3Var.D();
            n3Var.G();
            float f10 = this.f6519b;
            d3Var.setForceOffsetY(f10 - AndroidUtilities.dp(24.0f));
            d3Var.setTopActionBarOffsetY(f10 - AndroidUtilities.dp(24.0f));
            d3Var.setSwipeOffsetY(0.0f);
        } else {
            d3Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            d3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            d3Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f7 = n3Var.f6792g0;
        } else {
            f7 = 1.0f - n3Var.f6792g0;
        }
        n3Var.f6791f0 = f7;
        k3Var.setAlpha(1.0f - f7);
        k3Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * n3Var.f6791f0);
        n3Var.m0.setAlpha(n3Var.f6791f0);
        if (z10) {
            k3Var.setVisibility(8);
        }
        d3Var.setSwipeOffsetAnimationDisallowed(false);
        d3Var.setTranslationX(AndroidUtilities.lerp(this.f6520c, 0.0f, n3Var.f6792g0));
        n3Var.f6797l0.setTranslationX(0.0f);
        n3Var.e.invalidate();
        e3Var.setViewPortHeightOffset(0.0f);
        e3Var.o(true, true);
        n3Var.C();
    }
}
