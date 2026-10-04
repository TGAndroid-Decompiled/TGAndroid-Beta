package ci;

import android.animation.ValueAnimator;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4800a;
    public final d3 f4801b;

    public c3(d3 d3Var, int i10) {
        this.f4800a = i10;
        this.f4801b = d3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4800a) {
            case 0:
                this.f4801b.h.invalidate();
                return;
            default:
                this.f4801b.h.invalidate();
                return;
        }
    }
}
