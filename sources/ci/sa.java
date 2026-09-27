package ci;

import android.animation.ValueAnimator;
public final class sa implements ValueAnimator.AnimatorUpdateListener {
    public final int f5506a;
    public final kc f5507b;

    public sa(kc kcVar, int i10) {
        this.f5506a = i10;
        this.f5507b = kcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5506a) {
            case 0:
                this.f5507b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f5507b.f5037r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f5507b.f5037r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f5507b.f5041s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f5507b.f5041s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                kc kcVar = this.f5507b;
                kcVar.getClass();
                kcVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kcVar.o();
                kcVar.f5035r.invalidate();
                kcVar.f5022n.invalidate();
                return;
        }
    }
}
