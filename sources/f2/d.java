package f2;

import android.animation.ValueAnimator;

public final class d implements ValueAnimator.AnimatorUpdateListener {

    public final int f5638a;

    public final l f5639b;

    public d(l lVar, o1 o1Var, int i10) {
        this.f5638a = i10;
        this.f5639b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5638a) {
            case 0:
                this.f5639b.Q();
                break;
            default:
                this.f5639b.M();
                break;
        }
    }
}
