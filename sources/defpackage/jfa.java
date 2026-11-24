package defpackage;

import android.animation.ValueAnimator;
public final class jfa implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final iga b;
    public final nha c;

    public jfa(nha nhaVar, iga igaVar, byte b) {
        this.a = b;
        this.c = nhaVar;
        this.b = igaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        iga igaVar = this.b;
        nha nhaVar = this.c;
        switch (b) {
            case 0:
                nhaVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                igaVar.h.invalidate();
                return;
            default:
                nhaVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                igaVar.h.invalidate();
                return;
        }
    }
}
