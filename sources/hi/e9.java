package hi;

import android.animation.ValueAnimator;
public final class e9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14247a;
    public final sa f14248b;

    public e9(sa saVar, int i7) {
        this.f14247a = i7;
        this.f14248b = saVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14247a) {
            case 0:
                this.f14248b.N0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f14248b.f15094s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f14248b.f15094s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f14248b.f15097t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f14248b.f15097t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                sa saVar = this.f14248b;
                saVar.getClass();
                saVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                saVar.n();
                saVar.f15088r.invalidate();
                saVar.f15076n.invalidate();
                return;
        }
    }
}
