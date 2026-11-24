package defpackage;

import android.animation.ValueAnimator;
public final class n0b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final q0b b;

    public n0b(q0b q0bVar, byte b) {
        this.a = b;
        this.b = q0bVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        q0b q0bVar = this.b;
        switch (b) {
            case 0:
                q0bVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0bVar.invalidate();
                return;
            case 1:
                q0bVar.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                q0bVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0bVar.invalidate();
                return;
        }
    }
}
