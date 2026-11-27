package defpackage;

import android.animation.ValueAnimator;
public final class w39 implements ValueAnimator.AnimatorUpdateListener {
    public final float a;
    public final i49 b;

    public w39(i49 i49Var, float f) {
        this.b = i49Var;
        this.a = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        i49 i49Var = this.b;
        i49Var.p0 = floatValue;
        i49Var.o0 = (1.0f - floatValue) * this.a;
        i49Var.invalidate();
    }
}
