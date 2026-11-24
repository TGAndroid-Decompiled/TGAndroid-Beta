package defpackage;

import android.animation.ValueAnimator;
public final class xf3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final hg3 b;

    public xf3(hg3 hg3Var, byte b) {
        this.a = b;
        this.b = hg3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hg3 hg3Var = this.b;
        switch (b) {
            case 0:
                hg3Var.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg3Var.invalidate();
                return;
            case 1:
                hg3Var.X3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg3Var.invalidate();
                return;
            default:
                hg3Var.z4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg3Var.invalidate();
                return;
        }
    }
}
