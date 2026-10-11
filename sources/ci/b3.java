package ci;

import android.animation.ValueAnimator;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4748a;
    public final c3 f4749b;

    public b3(c3 c3Var, int i10) {
        this.f4748a = i10;
        this.f4749b = c3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4748a) {
            case 0:
                this.f4749b.h.invalidate();
                return;
            default:
                this.f4749b.h.invalidate();
                return;
        }
    }
}
