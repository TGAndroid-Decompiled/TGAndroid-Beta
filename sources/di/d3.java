package di;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f7060a;
    public final e3 f7061b;

    public d3(e3 e3Var, int i10) {
        this.f7060a = i10;
        this.f7061b = e3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7060a) {
            case 0:
                this.f7061b.h.invalidate();
                return;
            default:
                this.f7061b.h.invalidate();
                return;
        }
    }
}
