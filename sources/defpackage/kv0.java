package defpackage;

import android.animation.ValueAnimator;
public final class kv0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ow0 b;

    public kv0(ow0 ow0Var, byte b) {
        this.a = b;
        this.b = ow0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ow0 ow0Var = this.b;
        switch (b) {
            case 0:
                ow0Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ow0Var.h();
                return;
            default:
                ow0Var.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
