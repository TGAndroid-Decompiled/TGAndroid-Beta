package di;

import android.animation.ValueAnimator;
public final class sa implements ValueAnimator.AnimatorUpdateListener {
    public final int f7790a;
    public final kc f7791b;

    public sa(kc kcVar, int i10) {
        this.f7790a = i10;
        this.f7791b = kcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7790a) {
            case 0:
                this.f7791b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f7791b.f7292r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f7791b.f7292r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f7791b.f7296s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f7791b.f7296s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                kc kcVar = this.f7791b;
                kcVar.getClass();
                kcVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kcVar.n();
                kcVar.f7290r.invalidate();
                kcVar.f7277n.invalidate();
                return;
        }
    }
}
