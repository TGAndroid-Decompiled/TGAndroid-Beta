package defpackage;

import android.animation.ValueAnimator;
public final class fu1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ye7 b;

    public fu1(ye7 ye7Var, byte b) {
        this.a = b;
        this.b = ye7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ye7 ye7Var = this.b;
        switch (b) {
            case 0:
                ye7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                ye7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ye7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
