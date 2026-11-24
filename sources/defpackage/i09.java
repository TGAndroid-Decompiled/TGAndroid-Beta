package defpackage;

import android.animation.ValueAnimator;
public final class i09 implements ValueAnimator.AnimatorUpdateListener {
    public final float a;
    public final t09 b;

    public i09(t09 t09Var, float f) {
        this.b = t09Var;
        this.a = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        t09 t09Var = this.b;
        t09Var.p0 = floatValue;
        t09Var.o0 = (1.0f - floatValue) * this.a;
        t09Var.invalidate();
    }
}
