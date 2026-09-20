package ci;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4497a;
    public final e3 f4498b;

    public d3(e3 e3Var, int i10) {
        this.f4497a = i10;
        this.f4498b = e3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4497a) {
            case 0:
                this.f4498b.h.invalidate();
                return;
            default:
                this.f4498b.h.invalidate();
                return;
        }
    }
}
