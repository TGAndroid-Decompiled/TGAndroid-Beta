package ei;

import android.animation.ValueAnimator;
public final class wa implements ValueAnimator.AnimatorUpdateListener {
    public final int f10054a;
    public final vb f10055b;

    public wa(vb vbVar, int i10) {
        this.f10054a = i10;
        this.f10055b = vbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10054a) {
            case 0:
                this.f10055b.f9956c1.m();
                return;
            default:
                this.f10055b.m0();
                return;
        }
    }
}
