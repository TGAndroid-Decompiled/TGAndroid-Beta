package ci;

import android.animation.ValueAnimator;
public final class sa implements ValueAnimator.AnimatorUpdateListener {
    public final int f5924a;
    public final kc f5925b;

    public sa(kc kcVar, int i10) {
        this.f5924a = i10;
        this.f5925b = kcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5924a) {
            case 0:
                this.f5925b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f5925b.f5430r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f5925b.f5430r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f5925b.f5434s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f5925b.f5434s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                kc kcVar = this.f5925b;
                kcVar.getClass();
                kcVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kcVar.o();
                kcVar.f5428r.invalidate();
                kcVar.f5415n.invalidate();
                return;
        }
    }
}
