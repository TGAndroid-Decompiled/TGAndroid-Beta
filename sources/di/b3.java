package di;

import android.animation.ValueAnimator;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6651a;
    public final c3 f6652b;

    public b3(c3 c3Var, int i10) {
        this.f6651a = i10;
        this.f6652b = c3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6651a) {
            case 0:
                this.f6652b.h.invalidate();
                return;
            default:
                this.f6652b.h.invalidate();
                return;
        }
    }
}
