package defpackage;

import android.animation.ValueAnimator;
public final class mya implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final pya b;

    public mya(pya pyaVar, byte b) {
        this.a = b;
        this.b = pyaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        pya pyaVar = this.b;
        switch (b) {
            case 0:
                pyaVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pyaVar.invalidate();
                return;
            case 1:
                pyaVar.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                pyaVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pyaVar.invalidate();
                return;
        }
    }
}
