package defpackage;

import android.animation.ValueAnimator;
public final class qjc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final sjc b;

    public qjc(sjc sjcVar, byte b) {
        this.a = b;
        this.b = sjcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        sjc sjcVar = this.b;
        switch (b) {
            case 0:
                sjcVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sjcVar.k.invalidate();
                if (sjcVar.n > 1.0f && sjcVar.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(gl.L(12.0f), 0);
                    sjcVar.r = ofInt;
                    ofInt.addUpdateListener(new qjc(sjcVar, (byte) 2));
                    sjcVar.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    sjcVar.r.start();
                    return;
                }
                return;
            case 1:
                sjcVar.m = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                sjcVar.k.invalidate();
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (sjcVar.i <= sjcVar.o / 2) {
                    intValue = -intValue;
                }
                sjcVar.p = intValue;
                sjcVar.k.invalidate();
                return;
        }
    }
}
