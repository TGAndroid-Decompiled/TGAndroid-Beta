package ci;

import android.animation.ValueAnimator;
public final class wa implements ValueAnimator.AnimatorUpdateListener {
    public final int f5717a;
    public final oc f5718b;

    public wa(oc ocVar, int i10) {
        this.f5717a = i10;
        this.f5718b = ocVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5717a) {
            case 0:
                this.f5718b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f5718b.f5260r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f5718b.f5260r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f5718b.f5264s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f5718b.f5264s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                oc ocVar = this.f5718b;
                ocVar.getClass();
                ocVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ocVar.o();
                ocVar.f5258r.invalidate();
                ocVar.f5245n.invalidate();
                return;
        }
    }
}
