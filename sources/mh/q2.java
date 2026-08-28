package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q2 extends AnimatorListenerAdapter {
    public final boolean f18055a;
    public final float f18056b;
    public final float f18057c;
    public final c3 d;

    public q2(c3 c3Var, boolean z10, float f10, float f11) {
        this.d = c3Var;
        this.f18055a = z10;
        this.f18056b = f10;
        this.f18057c = f11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        c3 c3Var = this.d;
        u2 u2Var = c3Var.f17778x;
        z2 z2Var = c3Var.S;
        t2 t2Var = c3Var.v;
        c3Var.f17753d0 = false;
        boolean z10 = this.f18055a;
        if (!z10) {
            c3Var.D();
            c3Var.G();
            float f11 = this.f18056b;
            t2Var.setForceOffsetY(f11 - AndroidUtilities.dp(24.0f));
            t2Var.setTopActionBarOffsetY(f11 - AndroidUtilities.dp(24.0f));
            t2Var.setSwipeOffsetY(0.0f);
        } else {
            t2Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            t2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            t2Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f10 = c3Var.f17752c0;
        } else {
            f10 = 1.0f - c3Var.f17752c0;
        }
        c3Var.f17750b0 = f10;
        z2Var.setAlpha(1.0f - f10);
        z2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * c3Var.f17750b0);
        c3Var.f17760i0.setAlpha(c3Var.f17750b0);
        if (z10) {
            z2Var.setVisibility(8);
        }
        t2Var.setSwipeOffsetAnimationDisallowed(false);
        t2Var.setTranslationX(AndroidUtilities.lerp(this.f18057c, 0.0f, c3Var.f17752c0));
        c3Var.f17759h0.setTranslationX(0.0f);
        c3Var.f17754e.invalidate();
        u2Var.setViewPortHeightOffset(0.0f);
        u2Var.n(true, true);
        c3Var.C();
    }
}
