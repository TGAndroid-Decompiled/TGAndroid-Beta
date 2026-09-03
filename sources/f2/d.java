package f2;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f5663a;
    public final l f5664b;

    public d(l lVar, l1 l1Var, int i10) {
        this.f5663a = i10;
        this.f5664b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5663a) {
            case 0:
                this.f5664b.Q();
                return;
            default:
                this.f5664b.M();
                return;
        }
    }
}
