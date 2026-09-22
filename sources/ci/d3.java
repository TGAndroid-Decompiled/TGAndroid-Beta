package ci;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4495a;
    public final e3 f4496b;

    public d3(e3 e3Var, int i10) {
        this.f4495a = i10;
        this.f4496b = e3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4495a) {
            case 0:
                this.f4496b.h.invalidate();
                return;
            default:
                this.f4496b.h.invalidate();
                return;
        }
    }
}
