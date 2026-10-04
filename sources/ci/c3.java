package ci;

import android.animation.ValueAnimator;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4801a;
    public final d3 f4802b;

    public c3(d3 d3Var, int i10) {
        this.f4801a = i10;
        this.f4802b = d3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4801a) {
            case 0:
                this.f4802b.h.invalidate();
                return;
            default:
                this.f4802b.h.invalidate();
                return;
        }
    }
}
