package defpackage;

import android.animation.ValueAnimator;
public final class aj9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final dj9 b;

    public aj9(dj9 dj9Var, byte b) {
        this.a = b;
        this.b = dj9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dj9 dj9Var = this.b;
        switch (b) {
            case 0:
                dj9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj9Var.g();
                return;
            default:
                dj9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj9Var.g();
                return;
        }
    }
}
