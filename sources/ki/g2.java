package ki;

import android.animation.ValueAnimator;
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f18697a;
    public final float f18698b;
    public final float f18699c;
    public final float d;
    public final float f18700e;
    public final t2 f18701f;

    public g2(t2 t2Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f18701f = t2Var;
        this.f18697a = z10;
        this.f18698b = f10;
        this.f18699c = f11;
        this.d = f12;
        this.f18700e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        t2 t2Var = this.f18701f;
        l2 l2Var = t2Var.E;
        q2 q2Var = t2Var.Y;
        k2 k2Var = t2Var.f18952x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        t2Var.f18934i0 = floatValue;
        if (!this.f18697a) {
            floatValue = 1.0f - floatValue;
        }
        t2Var.f18933h0 = floatValue;
        q2Var.setAlpha(1.0f - floatValue);
        q2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * t2Var.f18933h0);
        float f10 = this.f18698b;
        float f11 = t2Var.f18934i0;
        float f12 = this.f18699c;
        k2Var.setTranslationY(org.telegram.messenger.g0.T1(f10, f12, f11));
        k2Var.setTranslationX(org.telegram.messenger.g0.T1(this.d, 0.0f, t2Var.f18934i0));
        t2Var.f18939n0.setTranslationX(org.telegram.messenger.g0.T1(this.f18700e, 0.0f, t2Var.f18934i0));
        t2Var.f18940o0.setAlpha(t2Var.f18933h0);
        t2Var.f18930f.invalidate();
        l2Var.setViewPortHeightOffset(k2Var.getTranslationY() - f12);
        l2Var.n(false, false);
        t2Var.H();
    }
}
