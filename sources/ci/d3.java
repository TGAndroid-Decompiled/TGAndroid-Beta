package ci;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4493a;
    public final e3 f4494b;

    public d3(e3 e3Var, int i10) {
        this.f4493a = i10;
        this.f4494b = e3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4493a) {
            case 0:
                this.f4494b.h.invalidate();
                return;
            default:
                this.f4494b.h.invalidate();
                return;
        }
    }
}
