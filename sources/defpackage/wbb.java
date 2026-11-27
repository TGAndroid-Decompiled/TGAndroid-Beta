package defpackage;

import android.animation.ValueAnimator;
public final class wbb implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final zbb b;

    public wbb(zbb zbbVar, byte b) {
        this.a = b;
        this.b = zbbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        zbb zbbVar = this.b;
        switch (b) {
            case 0:
                lcb lcbVar = zbbVar.s0;
                lcbVar.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar.V();
                return;
            default:
                lcb lcbVar2 = zbbVar.s0;
                lcbVar2.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar2.V();
                return;
        }
    }
}
