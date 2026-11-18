package hi;

import android.animation.ValueAnimator;
public final class u9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15549a;
    public final ta f15550b;

    public u9(ta taVar, int i7) {
        this.f15549a = i7;
        this.f15550b = taVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15549a) {
            case 0:
                this.f15550b.f15436d1.m();
                return;
            default:
                this.f15550b.m0();
                return;
        }
    }
}
