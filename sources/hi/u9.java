package hi;

import android.animation.ValueAnimator;
public final class u9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15546a;
    public final ta f15547b;

    public u9(ta taVar, int i7) {
        this.f15546a = i7;
        this.f15547b = taVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15546a) {
            case 0:
                this.f15547b.f15433d1.m();
                return;
            default:
                this.f15547b.m0();
                return;
        }
    }
}
