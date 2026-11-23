package hi;

import android.animation.ValueAnimator;
public final class u9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15505a;
    public final ta f15506b;

    public u9(ta taVar, int i7) {
        this.f15505a = i7;
        this.f15506b = taVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15505a) {
            case 0:
                this.f15506b.f15400d1.m();
                return;
            default:
                this.f15506b.m0();
                return;
        }
    }
}
