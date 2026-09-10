package bi;

import android.animation.ValueAnimator;
public final class fc implements ValueAnimator.AnimatorUpdateListener {
    public final int f2719a;
    public final ce f2720b;

    public fc(ce ceVar, int i10) {
        this.f2719a = i10;
        this.f2720b = ceVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2719a) {
            case 0:
                this.f2720b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f2720b.f2485r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f2720b.f2485r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f2720b.f2489s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f2720b.f2489s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ce ceVar = this.f2720b;
                ceVar.getClass();
                ceVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ceVar.o();
                ceVar.f2483r.invalidate();
                ceVar.f2470n.invalidate();
                return;
        }
    }
}
