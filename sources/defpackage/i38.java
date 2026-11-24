package defpackage;

import android.animation.ValueAnimator;
public final class i38 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final a58 b;

    public i38(a58 a58Var, byte b) {
        this.a = b;
        this.b = a58Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        a58 a58Var = this.b;
        switch (b) {
            case 0:
                a58Var.x2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a58Var.invalidate();
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a58Var.j3 = floatValue;
                a58Var.h3.setTransitionProgress(floatValue);
                return;
            default:
                a58Var.D0(valueAnimator);
                return;
        }
    }
}
