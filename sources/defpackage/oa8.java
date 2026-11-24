package defpackage;

import android.animation.ValueAnimator;
public final class oa8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final qa8 b;

    public oa8(qa8 qa8Var, byte b) {
        this.a = b;
        this.b = qa8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        qa8 qa8Var = this.b;
        switch (b) {
            case 0:
                qa8Var.getClass();
                qa8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qa8Var.invalidate();
                return;
            default:
                qa8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qa8Var.invalidate();
                return;
        }
    }
}
