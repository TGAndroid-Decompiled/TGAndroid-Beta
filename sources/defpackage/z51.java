package defpackage;

import android.animation.ValueAnimator;
public final class z51 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final b61 b;

    public z51(b61 b61Var, byte b) {
        this.a = b;
        this.b = b61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        b61 b61Var = this.b;
        switch (b) {
            case 0:
                b61Var.U = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                b61Var.invalidate();
                return;
            case 1:
                b61Var.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var.invalidate();
                return;
            case 2:
                b61Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var.invalidate();
                return;
            case 3:
                b61Var.getClass();
                b61Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var.invalidate();
                return;
            default:
                b61Var.getClass();
                b61Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var.invalidate();
                return;
        }
    }
}
