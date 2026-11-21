package hi;

import android.animation.ValueAnimator;
public final class d9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14547a;
    public final sa f14548b;

    public d9(sa saVar, int i7) {
        this.f14547a = i7;
        this.f14548b = saVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14547a) {
            case 0:
                this.f14548b.N0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f14548b.f15440s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f14548b.f15440s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f14548b.f15443t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f14548b.f15443t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                sa saVar = this.f14548b;
                saVar.getClass();
                saVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                saVar.n();
                saVar.f15434r.invalidate();
                saVar.f15422n.invalidate();
                return;
        }
    }
}
