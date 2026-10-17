package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class r2 extends AnimatorListenerAdapter {
    public final boolean f11424a;
    public final float f11425b;
    public final float f11426c;
    public final d3 d;

    public r2(d3 d3Var, boolean z10, float f7, float f10) {
        this.d = d3Var;
        this.f11424a = z10;
        this.f11425b = f7;
        this.f11426c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        d3 d3Var = this.d;
        v2 v2Var = d3Var.f11165x;
        a3 a3Var = d3Var.W;
        u2 u2Var = d3Var.v;
        d3Var.f11146h0 = false;
        boolean z10 = this.f11424a;
        if (!z10) {
            d3Var.E();
            d3Var.H();
            float f10 = this.f11425b;
            u2Var.setForceOffsetY(f10 - AndroidUtilities.dp(24.0f));
            u2Var.setTopActionBarOffsetY(f10 - AndroidUtilities.dp(24.0f));
            u2Var.setSwipeOffsetY(0.0f);
        } else {
            u2Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            u2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            u2Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f7 = d3Var.f11145g0;
        } else {
            f7 = 1.0f - d3Var.f11145g0;
        }
        d3Var.f11144f0 = f7;
        a3Var.setAlpha(1.0f - f7);
        a3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * d3Var.f11144f0);
        d3Var.m0.setAlpha(d3Var.f11144f0);
        if (z10) {
            a3Var.setVisibility(8);
        }
        u2Var.setSwipeOffsetAnimationDisallowed(false);
        u2Var.setTranslationX(AndroidUtilities.lerp(this.f11426c, 0.0f, d3Var.f11145g0));
        d3Var.f11150l0.setTranslationX(0.0f);
        d3Var.e.invalidate();
        v2Var.setViewPortHeightOffset(0.0f);
        v2Var.n(true, true);
        d3Var.D();
    }
}
