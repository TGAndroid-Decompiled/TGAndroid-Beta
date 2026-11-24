package defpackage;

import android.animation.ValueAnimator;
public final class m6b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final t7b b;

    public m6b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7bVar.N0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                t7bVar.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                t7bVar.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                t7bVar.t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                t7bVar.t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                t7bVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7bVar.l();
                t7bVar.r.invalidate();
                t7bVar.n.invalidate();
                return;
        }
    }
}
