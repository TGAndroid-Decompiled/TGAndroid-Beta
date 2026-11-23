package hi;

import android.animation.ValueAnimator;
public final class e9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14548a;
    public final ta f14549b;

    public e9(ta taVar, int i7) {
        this.f14548a = i7;
        this.f14549b = taVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14548a) {
            case 0:
                this.f14549b.N0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f14549b.f15446s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f14549b.f15446s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f14549b.f15449t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f14549b.f15449t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ta taVar = this.f14549b;
                taVar.getClass();
                taVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                taVar.n();
                taVar.f15440r.invalidate();
                taVar.f15428n.invalidate();
                return;
        }
    }
}
