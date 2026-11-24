package defpackage;

import android.animation.ValueAnimator;
public final class o8b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final v9b b;

    public o8b(v9b v9bVar, byte b) {
        this.a = b;
        this.b = v9bVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                v9bVar.N0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                v9bVar.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                v9bVar.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                v9bVar.t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                v9bVar.t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                v9bVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9bVar.l();
                v9bVar.r.invalidate();
                v9bVar.n.invalidate();
                return;
        }
    }
}
