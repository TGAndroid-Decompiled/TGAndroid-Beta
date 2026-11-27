package defpackage;

import android.animation.ValueAnimator;
public final class a51 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final c51 b;

    public a51(c51 c51Var, byte b) {
        this.a = b;
        this.b = c51Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        c51 c51Var = this.b;
        switch (b) {
            case 0:
                c51Var.U = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                c51Var.invalidate();
                return;
            case 1:
                c51Var.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.invalidate();
                return;
            case 2:
                c51Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.invalidate();
                return;
            case 3:
                c51Var.getClass();
                c51Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.invalidate();
                return;
            default:
                c51Var.getClass();
                c51Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.invalidate();
                return;
        }
    }
}
