package defpackage;

import android.animation.ValueAnimator;
public final class f18 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final y28 b;

    public f18(y28 y28Var, byte b) {
        this.a = b;
        this.b = y28Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        y28 y28Var = this.b;
        switch (b) {
            case 0:
                y28Var.x2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y28Var.invalidate();
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y28Var.j3 = floatValue;
                y28Var.h3.setTransitionProgress(floatValue);
                return;
            default:
                y28Var.D0(valueAnimator);
                return;
        }
    }
}
