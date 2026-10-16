package di;

import android.animation.ValueAnimator;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6654a;
    public final c3 f6655b;

    public b3(c3 c3Var, int i10) {
        this.f6654a = i10;
        this.f6655b = c3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6654a) {
            case 0:
                this.f6655b.h.invalidate();
                return;
            default:
                this.f6655b.h.invalidate();
                return;
        }
    }
}
