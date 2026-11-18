package hi;

import android.animation.ValueAnimator;
public final class e9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14596a;
    public final ta f14597b;

    public e9(ta taVar, int i7) {
        this.f14596a = i7;
        this.f14597b = taVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14596a) {
            case 0:
                this.f14597b.N0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f14597b.f15479s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f14597b.f15479s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f14597b.f15482t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f14597b.f15482t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ta taVar = this.f14597b;
                taVar.getClass();
                taVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                taVar.n();
                taVar.f15473r.invalidate();
                taVar.f15461n.invalidate();
                return;
        }
    }
}
