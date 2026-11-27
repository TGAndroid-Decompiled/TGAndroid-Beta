package defpackage;

import android.animation.ValueAnimator;
public final class g62 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final a72 b;

    public g62(a72 a72Var, byte b) {
        this.a = b;
        this.b = a72Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        a72 a72Var = this.b;
        switch (b) {
            case 0:
                a72Var.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                a72Var.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
