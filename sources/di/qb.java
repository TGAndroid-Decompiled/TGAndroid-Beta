package di;

import android.animation.ValueAnimator;
public final class qb implements ValueAnimator.AnimatorUpdateListener {
    public final int f8049a;
    public final pc f8050b;

    public qb(pc pcVar, int i10) {
        this.f8049a = i10;
        this.f8050b = pcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8049a) {
            case 0:
                this.f8050b.f7878c1.m();
                return;
            default:
                this.f8050b.n0();
                return;
        }
    }
}
