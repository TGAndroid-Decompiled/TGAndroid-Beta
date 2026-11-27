package defpackage;

import android.animation.ValueAnimator;
public final class mab implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final sbb b;

    public mab(sbb sbbVar, byte b) {
        this.a = b;
        this.b = sbbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                sbbVar.N0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                sbbVar.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                sbbVar.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                sbbVar.t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                sbbVar.t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                sbbVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sbbVar.l();
                sbbVar.r.invalidate();
                sbbVar.n.invalidate();
                return;
        }
    }
}
