package defpackage;

import android.animation.ValueAnimator;
public final class doc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final foc b;

    public doc(foc focVar, byte b) {
        this.a = b;
        this.b = focVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        foc focVar = this.b;
        switch (b) {
            case 0:
                focVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                focVar.k.invalidate();
                if (focVar.n > 1.0f && focVar.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(hl.L(12.0f), 0);
                    focVar.r = ofInt;
                    ofInt.addUpdateListener(new doc(focVar, (byte) 2));
                    focVar.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    focVar.r.start();
                    return;
                }
                return;
            case 1:
                focVar.m = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                focVar.k.invalidate();
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (focVar.i <= focVar.o / 2) {
                    intValue = -intValue;
                }
                focVar.p = intValue;
                focVar.k.invalidate();
                return;
        }
    }
}
