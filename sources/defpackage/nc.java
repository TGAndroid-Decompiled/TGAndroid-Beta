package defpackage;

import android.animation.ValueAnimator;
public final class nc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final rc b;

    public nc(rc rcVar, byte b) {
        this.a = b;
        this.b = rcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        rc rcVar = this.b;
        switch (b) {
            case 0:
                rcVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rcVar.invalidate();
                return;
            case 1:
                rcVar.f(valueAnimator);
                return;
            case 2:
                rcVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                rcVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
