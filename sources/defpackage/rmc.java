package defpackage;

import android.animation.ValueAnimator;
public final class rmc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final goc b;

    public rmc(goc gocVar, byte b) {
        this.a = b;
        this.b = gocVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        goc gocVar = this.b;
        switch (b) {
            case 0:
                gocVar.Q0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                gocVar.L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gocVar.Y0();
                return;
        }
    }
}
