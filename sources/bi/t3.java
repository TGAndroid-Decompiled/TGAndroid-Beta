package bi;

import android.animation.ValueAnimator;
public final class t3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3672a;
    public final v3 f3673b;

    public t3(v3 v3Var, int i10) {
        this.f3672a = i10;
        this.f3673b = v3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3672a) {
            case 0:
                this.f3673b.h.invalidate();
                return;
            default:
                this.f3673b.h.invalidate();
                return;
        }
    }
}
