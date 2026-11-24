package defpackage;

import android.animation.ValueAnimator;
public final class qh8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final th8 b;

    public qh8(th8 th8Var, byte b) {
        this.a = b;
        this.b = th8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        th8 th8Var = this.b;
        switch (b) {
            case 0:
                th8Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th8Var.c(true);
                return;
            default:
                th8Var.getClass();
                th8Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th8Var.c(true);
                return;
        }
    }
}
