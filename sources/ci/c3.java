package ci;

import android.animation.ValueAnimator;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4433a;
    public final d3 f4434b;

    public c3(d3 d3Var, int i10) {
        this.f4433a = i10;
        this.f4434b = d3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4433a) {
            case 0:
                this.f4434b.h.invalidate();
                return;
            default:
                this.f4434b.h.invalidate();
                return;
        }
    }
}
