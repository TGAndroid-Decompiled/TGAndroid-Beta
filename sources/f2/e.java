package f2;

import android.animation.ValueAnimator;
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int f5342a;
    public final n f5343b;

    public e(n nVar, q1 q1Var, int i9) {
        this.f5342a = i9;
        this.f5343b = nVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5342a) {
            case 0:
                this.f5343b.Q();
                return;
            default:
                this.f5343b.M();
                return;
        }
    }
}
