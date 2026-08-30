package f2;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f5674a;
    public final l f5675b;

    public d(l lVar, l1 l1Var, int i10) {
        this.f5674a = i10;
        this.f5675b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5674a) {
            case 0:
                this.f5675b.Q();
                return;
            default:
                this.f5675b.M();
                return;
        }
    }
}
