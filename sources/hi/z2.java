package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f13395a;
    public final float f13396b;
    public final float f13397c;
    public final float d;
    public final float e;
    public final m3 f13398f;

    public z2(m3 m3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f13398f = m3Var;
        this.f13395a = z10;
        this.f13396b = f7;
        this.f13397c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        m3 m3Var = this.f13398f;
        e3 e3Var = m3Var.f13132y;
        j3 j3Var = m3Var.X;
        d3 d3Var = m3Var.f13128w;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m3Var.f13111h0 = floatValue;
        if (!this.f13395a) {
            floatValue = 1.0f - floatValue;
        }
        m3Var.f13110g0 = floatValue;
        j3Var.setAlpha(1.0f - floatValue);
        j3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * m3Var.f13110g0);
        float f7 = this.f13396b;
        float f10 = m3Var.f13111h0;
        float f11 = this.f13397c;
        d3Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        d3Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, m3Var.f13111h0));
        m3Var.m0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, m3Var.f13111h0));
        m3Var.f13117n0.setAlpha(m3Var.f13110g0);
        m3Var.f13108f.invalidate();
        e3Var.setViewPortHeightOffset(d3Var.getTranslationY() - f11);
        e3Var.n(false, false);
        m3Var.D();
    }
}
