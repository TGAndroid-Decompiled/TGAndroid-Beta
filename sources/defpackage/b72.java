package defpackage;

import android.animation.ValueAnimator;
public final class b72 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final v72 b;

    public b72(v72 v72Var, byte b) {
        this.a = b;
        this.b = v72Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        v72 v72Var = this.b;
        switch (b) {
            case 0:
                v72Var.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                v72Var.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
