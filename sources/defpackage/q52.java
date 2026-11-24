package defpackage;

import android.animation.ValueAnimator;
public final class q52 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final k62 b;

    public q52(k62 k62Var, byte b) {
        this.a = b;
        this.b = k62Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        k62 k62Var = this.b;
        switch (b) {
            case 0:
                k62Var.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                k62Var.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
