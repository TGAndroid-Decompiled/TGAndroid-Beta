package defpackage;

import android.animation.ValueAnimator;
public final class y48 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final o68 b;

    public y48(o68 o68Var, byte b) {
        this.a = b;
        this.b = o68Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        o68 o68Var = this.b;
        switch (b) {
            case 0:
                o68Var.r2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o68Var.invalidate();
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o68Var.d3 = floatValue;
                o68Var.b3.setTransitionProgress(floatValue);
                return;
            default:
                o68Var.D0(valueAnimator);
                return;
        }
    }
}
