package defpackage;

import android.animation.ValueAnimator;
public final class qlc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final slc b;

    public qlc(slc slcVar, byte b) {
        this.a = b;
        this.b = slcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        slc slcVar = this.b;
        switch (b) {
            case 0:
                slcVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                slcVar.k.invalidate();
                if (slcVar.n > 1.0f && slcVar.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(gm.L(12.0f), 0);
                    slcVar.r = ofInt;
                    ofInt.addUpdateListener(new qlc(slcVar, (byte) 2));
                    slcVar.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    slcVar.r.start();
                    return;
                }
                return;
            case 1:
                slcVar.m = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                slcVar.k.invalidate();
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (slcVar.i <= slcVar.o / 2) {
                    intValue = -intValue;
                }
                slcVar.p = intValue;
                slcVar.k.invalidate();
                return;
        }
    }
}
