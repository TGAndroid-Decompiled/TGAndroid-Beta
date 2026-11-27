package defpackage;

import android.animation.ValueAnimator;
public final class aha implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final zha b;
    public final eja c;

    public aha(eja ejaVar, zha zhaVar, byte b) {
        this.a = b;
        this.c = ejaVar;
        this.b = zhaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        zha zhaVar = this.b;
        eja ejaVar = this.c;
        switch (b) {
            case 0:
                ejaVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zhaVar.h.invalidate();
                return;
            default:
                ejaVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zhaVar.h.invalidate();
                return;
        }
    }
}
