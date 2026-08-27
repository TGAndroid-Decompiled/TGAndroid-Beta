package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class p2 extends AnimatorListenerAdapter {

    public final boolean f18871a;

    public final float f18872b;

    public final float f18873c;
    public final b3 d;

    public p2(b3 b3Var, boolean z10, float f10, float f11) {
        this.d = b3Var;
        this.f18871a = z10;
        this.f18872b = f10;
        this.f18873c = f11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        b3 b3Var = this.d;
        t2 t2Var = b3Var.f18599x;
        y2 y2Var = b3Var.S;
        s2 s2Var = b3Var.v;
        b3Var.f18574d0 = false;
        boolean z10 = this.f18871a;
        if (z10) {
            s2Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            s2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            s2Var.setSwipeOffsetY(0.0f);
        } else {
            b3Var.D();
            b3Var.G();
            float fDp = AndroidUtilities.dp(24.0f);
            float f10 = this.f18872b;
            s2Var.setForceOffsetY(f10 - fDp);
            s2Var.setTopActionBarOffsetY(f10 - AndroidUtilities.dp(24.0f));
            s2Var.setSwipeOffsetY(0.0f);
        }
        float f11 = z10 ? b3Var.f18573c0 : 1.0f - b3Var.f18573c0;
        b3Var.f18571b0 = f11;
        y2Var.setAlpha(1.0f - f11);
        y2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * b3Var.f18571b0);
        b3Var.f18581i0.setAlpha(b3Var.f18571b0);
        if (z10) {
            y2Var.setVisibility(8);
        }
        s2Var.setSwipeOffsetAnimationDisallowed(false);
        s2Var.setTranslationX(AndroidUtilities.lerp(this.f18873c, 0.0f, b3Var.f18573c0));
        b3Var.f18580h0.setTranslationX(0.0f);
        b3Var.f18575e.invalidate();
        t2Var.setViewPortHeightOffset(0.0f);
        t2Var.n(true, true);
        b3Var.C();
    }
}
