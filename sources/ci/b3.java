package ci;

import android.animation.ValueAnimator;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4747a;
    public final c3 f4748b;

    public b3(c3 c3Var, int i10) {
        this.f4747a = i10;
        this.f4748b = c3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4747a) {
            case 0:
                this.f4748b.h.invalidate();
                return;
            default:
                this.f4748b.h.invalidate();
                return;
        }
    }
}
