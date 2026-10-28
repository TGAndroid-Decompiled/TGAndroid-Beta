package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class a3 extends AnimatorListenerAdapter {
    public final boolean f12857a;
    public final float f12858b;
    public final float f12859c;
    public final m3 d;

    public a3(m3 m3Var, boolean z10, float f7, float f10) {
        this.d = m3Var;
        this.f12857a = z10;
        this.f12858b = f7;
        this.f12859c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m3 m3Var = this.d;
        e3 e3Var = m3Var.f13132y;
        j3 j3Var = m3Var.X;
        d3 d3Var = m3Var.f13128w;
        m3Var.f13112i0 = false;
        boolean z10 = this.f12857a;
        if (!z10) {
            m3Var.E();
            m3Var.H();
            float f10 = this.f12858b;
            d3Var.setForceOffsetY(f10 - AndroidUtilities.dp(24.0f));
            d3Var.setTopActionBarOffsetY(f10 - AndroidUtilities.dp(24.0f));
            d3Var.setSwipeOffsetY(0.0f);
        } else {
            d3Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            d3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            d3Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f7 = m3Var.f13111h0;
        } else {
            f7 = 1.0f - m3Var.f13111h0;
        }
        m3Var.f13110g0 = f7;
        j3Var.setAlpha(1.0f - f7);
        j3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * m3Var.f13110g0);
        m3Var.f13117n0.setAlpha(m3Var.f13110g0);
        if (z10) {
            j3Var.setVisibility(8);
        }
        d3Var.setSwipeOffsetAnimationDisallowed(false);
        d3Var.setTranslationX(AndroidUtilities.lerp(this.f12859c, 0.0f, m3Var.f13111h0));
        m3Var.m0.setTranslationX(0.0f);
        m3Var.f13108f.invalidate();
        e3Var.setViewPortHeightOffset(0.0f);
        e3Var.n(true, true);
        m3Var.D();
    }
}
