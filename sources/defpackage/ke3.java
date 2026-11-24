package defpackage;

import android.animation.ValueAnimator;
public final class ke3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ue3 b;

    public ke3(ue3 ue3Var, byte b) {
        this.a = b;
        this.b = ue3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ue3 ue3Var = this.b;
        switch (b) {
            case 0:
                ue3Var.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue3Var.invalidate();
                return;
            case 1:
                ue3Var.X3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue3Var.invalidate();
                return;
            default:
                ue3Var.z4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue3Var.invalidate();
                return;
        }
    }
}
