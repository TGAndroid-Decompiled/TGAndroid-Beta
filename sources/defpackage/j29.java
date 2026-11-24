package defpackage;

import android.animation.ValueAnimator;
public final class j29 implements ValueAnimator.AnimatorUpdateListener {
    public final float a;
    public final v29 b;

    public j29(v29 v29Var, float f) {
        this.b = v29Var;
        this.a = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v29 v29Var = this.b;
        v29Var.p0 = floatValue;
        v29Var.o0 = (1.0f - floatValue) * this.a;
        v29Var.invalidate();
    }
}
