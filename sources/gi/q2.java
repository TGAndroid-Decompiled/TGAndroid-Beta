package gi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f11395a;
    public final float f11396b;
    public final float f11397c;
    public final float d;
    public final float e;
    public final d3 f11398f;

    public q2(d3 d3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f11398f = d3Var;
        this.f11395a = z10;
        this.f11396b = f7;
        this.f11397c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d3 d3Var = this.f11398f;
        v2 v2Var = d3Var.f11165x;
        a3 a3Var = d3Var.W;
        u2 u2Var = d3Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d3Var.f11145g0 = floatValue;
        if (!this.f11395a) {
            floatValue = 1.0f - floatValue;
        }
        d3Var.f11144f0 = floatValue;
        a3Var.setAlpha(1.0f - floatValue);
        a3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * d3Var.f11144f0);
        float f7 = this.f11396b;
        float f10 = d3Var.f11145g0;
        float f11 = this.f11397c;
        u2Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        u2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, d3Var.f11145g0));
        d3Var.f11150l0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, d3Var.f11145g0));
        d3Var.m0.setAlpha(d3Var.f11144f0);
        d3Var.e.invalidate();
        v2Var.setViewPortHeightOffset(u2Var.getTranslationY() - f11);
        v2Var.n(false, false);
        d3Var.D();
    }
}
