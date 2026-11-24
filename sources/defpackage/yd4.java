package defpackage;

import android.animation.ValueAnimator;
public final class yd4 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final fe4 b;

    public yd4(fe4 fe4Var, byte b) {
        this.a = b;
        this.b = fe4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fe4 fe4Var = this.b;
        switch (b) {
            case 0:
                fe4Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fe4Var.invalidate();
                return;
            default:
                fe4Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fe4Var.invalidate();
                return;
        }
    }
}
