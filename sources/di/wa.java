package di;

import android.animation.ValueAnimator;
public final class wa implements ValueAnimator.AnimatorUpdateListener {
    public final int f8380a;
    public final pc f8381b;

    public wa(pc pcVar, int i10) {
        this.f8380a = i10;
        this.f8381b = pcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8380a) {
            case 0:
                this.f8381b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f8381b.f7925r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f8381b.f7925r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f8381b.f7929s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f8381b.f7929s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                pc pcVar = this.f8381b;
                pcVar.getClass();
                pcVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pcVar.o();
                pcVar.f7923r.invalidate();
                pcVar.f7910n.invalidate();
                return;
        }
    }
}
