package f2;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f6288a;
    public final l f6289b;

    public d(l lVar, n1 n1Var, int i10) {
        this.f6288a = i10;
        this.f6289b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6288a) {
            case 0:
                this.f6289b.Q();
                return;
            default:
                this.f6289b.M();
                return;
        }
    }
}
