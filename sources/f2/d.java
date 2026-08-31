package f2;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f5745a;
    public final l f5746b;

    public d(l lVar, m1 m1Var, int i10) {
        this.f5745a = i10;
        this.f5746b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5745a) {
            case 0:
                this.f5746b.Q();
                return;
            default:
                this.f5746b.M();
                return;
        }
    }
}
