package defpackage;

import android.animation.ValueAnimator;
public final class jmc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final kmc b;

    public jmc(kmc kmcVar, byte b) {
        this.a = b;
        this.b = kmcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        kmc kmcVar = this.b;
        switch (b) {
            case 0:
                kmcVar.getClass();
                kmcVar.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kmcVar.a(kmcVar.S, kmcVar.T);
                return;
            default:
                kmcVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kmcVar.invalidate();
                return;
        }
    }
}
