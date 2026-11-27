package defpackage;

import android.animation.ValueAnimator;
public final class wf4 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final dg4 b;

    public wf4(dg4 dg4Var, byte b) {
        this.a = b;
        this.b = dg4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dg4 dg4Var = this.b;
        switch (b) {
            case 0:
                dg4Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg4Var.invalidate();
                return;
            default:
                dg4Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg4Var.invalidate();
                return;
        }
    }
}
