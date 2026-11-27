package defpackage;

import android.animation.ValueAnimator;
public final class om9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final rm9 b;

    public om9(rm9 rm9Var, byte b) {
        this.a = b;
        this.b = rm9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        rm9 rm9Var = this.b;
        switch (b) {
            case 0:
                rm9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rm9Var.g();
                return;
            default:
                rm9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rm9Var.g();
                return;
        }
    }
}
