package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class a3 extends AnimatorListenerAdapter {
    public final boolean f12858a;
    public final float f12859b;
    public final float f12860c;
    public final m3 d;

    public a3(m3 m3Var, boolean z10, float f7, float f10) {
        this.d = m3Var;
        this.f12858a = z10;
        this.f12859b = f7;
        this.f12860c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        m3 m3Var = this.d;
        e3 e3Var = m3Var.f13133y;
        j3 j3Var = m3Var.X;
        d3 d3Var = m3Var.f13129w;
        m3Var.f13113i0 = false;
        boolean z10 = this.f12858a;
        if (!z10) {
            m3Var.E();
            m3Var.H();
            float f10 = this.f12859b;
            d3Var.setForceOffsetY(f10 - AndroidUtilities.dp(24.0f));
            d3Var.setTopActionBarOffsetY(f10 - AndroidUtilities.dp(24.0f));
            d3Var.setSwipeOffsetY(0.0f);
        } else {
            d3Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            d3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            d3Var.setSwipeOffsetY(0.0f);
        }
        if (z10) {
            f7 = m3Var.f13112h0;
        } else {
            f7 = 1.0f - m3Var.f13112h0;
        }
        m3Var.f13111g0 = f7;
        j3Var.setAlpha(1.0f - f7);
        j3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * m3Var.f13111g0);
        m3Var.f13118n0.setAlpha(m3Var.f13111g0);
        if (z10) {
            j3Var.setVisibility(8);
        }
        d3Var.setSwipeOffsetAnimationDisallowed(false);
        d3Var.setTranslationX(AndroidUtilities.lerp(this.f12860c, 0.0f, m3Var.f13112h0));
        m3Var.m0.setTranslationX(0.0f);
        m3Var.f13109f.invalidate();
        e3Var.setViewPortHeightOffset(0.0f);
        e3Var.n(true, true);
        m3Var.D();
    }
}
