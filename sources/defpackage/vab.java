package defpackage;

import android.animation.ValueAnimator;
public final class vab implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final sbb b;

    public vab(sbb sbbVar, byte b) {
        this.a = b;
        this.b = sbbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                sbbVar.d1.m();
                return;
            default:
                sbbVar.m0();
                return;
        }
    }
}
