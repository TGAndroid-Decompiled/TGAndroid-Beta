package ci;

import android.animation.ValueAnimator;
public final class sa implements ValueAnimator.AnimatorUpdateListener {
    public final int f5923a;
    public final kc f5924b;

    public sa(kc kcVar, int i10) {
        this.f5923a = i10;
        this.f5924b = kcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5923a) {
            case 0:
                this.f5924b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f5924b.f5429r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f5924b.f5429r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f5924b.f5433s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f5924b.f5433s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                kc kcVar = this.f5924b;
                kcVar.getClass();
                kcVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kcVar.o();
                kcVar.f5427r.invalidate();
                kcVar.f5414n.invalidate();
                return;
        }
    }
}
