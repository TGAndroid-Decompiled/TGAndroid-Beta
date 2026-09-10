package bi;

import android.animation.ValueAnimator;
public final class zc implements ValueAnimator.AnimatorUpdateListener {
    public final int f4024a;
    public final ce f4025b;

    public zc(ce ceVar, int i10) {
        this.f4024a = i10;
        this.f4025b = ceVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4024a) {
            case 0:
                this.f4025b.f2439c1.m();
                return;
            default:
                this.f4025b.n0();
                return;
        }
    }
}
