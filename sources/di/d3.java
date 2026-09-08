package di;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f7088a;
    public final e3 f7089b;

    public d3(e3 e3Var, int i10) {
        this.f7088a = i10;
        this.f7089b = e3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7088a) {
            case 0:
                this.f7089b.h.invalidate();
                return;
            default:
                this.f7089b.h.invalidate();
                return;
        }
    }
}
