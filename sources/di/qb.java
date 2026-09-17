package di;

import android.animation.ValueAnimator;
public final class qb implements ValueAnimator.AnimatorUpdateListener {
    public final int f8021a;
    public final pc f8022b;

    public qb(pc pcVar, int i10) {
        this.f8021a = i10;
        this.f8022b = pcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8021a) {
            case 0:
                this.f8022b.f7850c1.m();
                return;
            default:
                this.f8022b.n0();
                return;
        }
    }
}
