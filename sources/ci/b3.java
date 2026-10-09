package ci;

import android.animation.ValueAnimator;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4749a;
    public final c3 f4750b;

    public b3(c3 c3Var, int i10) {
        this.f4749a = i10;
        this.f4750b = c3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4749a) {
            case 0:
                this.f4750b.h.invalidate();
                return;
            default:
                this.f4750b.h.invalidate();
                return;
        }
    }
}
