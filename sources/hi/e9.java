package hi;

import android.animation.ValueAnimator;
public final class e9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14599a;
    public final ta f14600b;

    public e9(ta taVar, int i7) {
        this.f14599a = i7;
        this.f14600b = taVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14599a) {
            case 0:
                this.f14600b.N0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f14600b.f15482s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f14600b.f15482s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f14600b.f15485t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f14600b.f15485t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ta taVar = this.f14600b;
                taVar.getClass();
                taVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                taVar.n();
                taVar.f15476r.invalidate();
                taVar.f15464n.invalidate();
                return;
        }
    }
}
