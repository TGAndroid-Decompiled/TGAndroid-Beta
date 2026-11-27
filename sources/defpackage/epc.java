package defpackage;

import android.animation.ValueAnimator;
public final class epc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final uqc b;

    public epc(uqc uqcVar, byte b) {
        this.a = b;
        this.b = uqcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        uqc uqcVar = this.b;
        switch (b) {
            case 0:
                uqcVar.P0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                uqcVar.L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uqcVar.X0();
                return;
        }
    }
}
