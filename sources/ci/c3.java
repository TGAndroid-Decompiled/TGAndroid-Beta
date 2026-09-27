package ci;

import android.animation.ValueAnimator;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4441a;
    public final d3 f4442b;

    public c3(d3 d3Var, int i10) {
        this.f4441a = i10;
        this.f4442b = d3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4441a) {
            case 0:
                this.f4442b.h.invalidate();
                return;
            default:
                this.f4442b.h.invalidate();
                return;
        }
    }
}
