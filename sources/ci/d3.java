package ci;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4491a;
    public final e3 f4492b;

    public d3(e3 e3Var, int i10) {
        this.f4491a = i10;
        this.f4492b = e3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4491a) {
            case 0:
                this.f4492b.h.invalidate();
                return;
            default:
                this.f4492b.h.invalidate();
                return;
        }
    }
}
