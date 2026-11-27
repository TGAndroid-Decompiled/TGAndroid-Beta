package defpackage;

import android.animation.ValueAnimator;
public final class lab implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final rbb b;

    public lab(rbb rbbVar, byte b) {
        this.a = b;
        this.b = rbbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                rbbVar.N0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                rbbVar.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                rbbVar.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                rbbVar.t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                rbbVar.t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                rbbVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rbbVar.l();
                rbbVar.r.invalidate();
                rbbVar.n.invalidate();
                return;
        }
    }
}
