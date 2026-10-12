package di;

import android.animation.ValueAnimator;
public final class sa implements ValueAnimator.AnimatorUpdateListener {
    public final int f7787a;
    public final kc f7788b;

    public sa(kc kcVar, int i10) {
        this.f7787a = i10;
        this.f7788b = kcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7787a) {
            case 0:
                this.f7788b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f7788b.f7289r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f7788b.f7289r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f7788b.f7293s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f7788b.f7293s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                kc kcVar = this.f7788b;
                kcVar.getClass();
                kcVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kcVar.n();
                kcVar.f7287r.invalidate();
                kcVar.f7274n.invalidate();
                return;
        }
    }
}
