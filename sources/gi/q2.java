package gi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f11420a;
    public final float f11421b;
    public final float f11422c;
    public final float d;
    public final float e;
    public final d3 f11423f;

    public q2(d3 d3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f11423f = d3Var;
        this.f11420a = z10;
        this.f11421b = f7;
        this.f11422c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d3 d3Var = this.f11423f;
        v2 v2Var = d3Var.f11188y;
        a3 a3Var = d3Var.X;
        u2 u2Var = d3Var.f11184w;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d3Var.f11167h0 = floatValue;
        if (!this.f11420a) {
            floatValue = 1.0f - floatValue;
        }
        d3Var.f11166g0 = floatValue;
        a3Var.setAlpha(1.0f - floatValue);
        a3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * d3Var.f11166g0);
        float f7 = this.f11421b;
        float f10 = d3Var.f11167h0;
        float f11 = this.f11422c;
        u2Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        u2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, d3Var.f11167h0));
        d3Var.m0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, d3Var.f11167h0));
        d3Var.f11173n0.setAlpha(d3Var.f11166g0);
        d3Var.f11164f.invalidate();
        v2Var.setViewPortHeightOffset(u2Var.getTranslationY() - f11);
        v2Var.n(false, false);
        d3Var.D();
    }
}
