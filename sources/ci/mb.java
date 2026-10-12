package ci;

import android.animation.ValueAnimator;
public final class mb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5612a;
    public final lc f5613b;

    public mb(lc lcVar, int i10) {
        this.f5612a = i10;
        this.f5613b = lcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5612a) {
            case 0:
                this.f5613b.f5465c1.m();
                return;
            default:
                this.f5613b.m0();
                return;
        }
    }
}
