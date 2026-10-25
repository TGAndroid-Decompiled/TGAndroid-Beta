package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f13396a;
    public final float f13397b;
    public final float f13398c;
    public final float d;
    public final float e;
    public final m3 f13399f;

    public z2(m3 m3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f13399f = m3Var;
        this.f13396a = z10;
        this.f13397b = f7;
        this.f13398c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        m3 m3Var = this.f13399f;
        e3 e3Var = m3Var.f13133y;
        j3 j3Var = m3Var.X;
        d3 d3Var = m3Var.f13129w;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m3Var.f13112h0 = floatValue;
        if (!this.f13396a) {
            floatValue = 1.0f - floatValue;
        }
        m3Var.f13111g0 = floatValue;
        j3Var.setAlpha(1.0f - floatValue);
        j3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * m3Var.f13111g0);
        float f7 = this.f13397b;
        float f10 = m3Var.f13112h0;
        float f11 = this.f13398c;
        d3Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        d3Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, m3Var.f13112h0));
        m3Var.m0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, m3Var.f13112h0));
        m3Var.f13118n0.setAlpha(m3Var.f13111g0);
        m3Var.f13109f.invalidate();
        e3Var.setViewPortHeightOffset(d3Var.getTranslationY() - f11);
        e3Var.n(false, false);
        m3Var.D();
    }
}
