package defpackage;

import android.animation.ValueAnimator;
public final class bl9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final el9 b;

    public bl9(el9 el9Var, byte b) {
        this.a = b;
        this.b = el9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        el9 el9Var = this.b;
        switch (b) {
            case 0:
                el9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                el9Var.g();
                return;
            default:
                el9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                el9Var.g();
                return;
        }
    }
}
