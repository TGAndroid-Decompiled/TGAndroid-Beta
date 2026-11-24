package defpackage;

import android.animation.ValueAnimator;
public final class skc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final hmc b;

    public skc(hmc hmcVar, byte b) {
        this.a = b;
        this.b = hmcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hmc hmcVar = this.b;
        switch (b) {
            case 0:
                hmcVar.P0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                hmcVar.L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hmcVar.X0();
                return;
        }
    }
}
