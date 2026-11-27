package defpackage;

import android.animation.ValueAnimator;
public final class cj8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final fj8 b;

    public cj8(fj8 fj8Var, byte b) {
        this.a = b;
        this.b = fj8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fj8 fj8Var = this.b;
        switch (b) {
            case 0:
                fj8Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fj8Var.c(true);
                return;
            default:
                fj8Var.getClass();
                fj8Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fj8Var.c(true);
                return;
        }
    }
}
