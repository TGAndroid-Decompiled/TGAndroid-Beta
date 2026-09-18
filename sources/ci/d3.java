package ci;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4496a;
    public final e3 f4497b;

    public d3(e3 e3Var, int i10) {
        this.f4496a = i10;
        this.f4497b = e3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4496a) {
            case 0:
                this.f4497b.h.invalidate();
                return;
            default:
                this.f4497b.h.invalidate();
                return;
        }
    }
}
