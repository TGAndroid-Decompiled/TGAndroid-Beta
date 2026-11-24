package defpackage;

import android.animation.ValueAnimator;
public final class xv5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final rw5 b;

    public xv5(rw5 rw5Var, byte b) {
        this.a = b;
        this.b = rw5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        rw5 rw5Var = this.b;
        switch (b) {
            case 0:
                rw5Var.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                rw5Var.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
