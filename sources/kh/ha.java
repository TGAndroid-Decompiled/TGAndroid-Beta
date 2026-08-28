package kh;

import android.animation.ValueAnimator;
public final class ha implements ValueAnimator.AnimatorUpdateListener {
    public final int f15401a;
    public final wb f15402b;

    public ha(wb wbVar, int i9) {
        this.f15401a = i9;
        this.f15402b = wbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15401a) {
            case 0:
                this.f15402b.I0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f15402b.f16289n1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f15402b.f16289n1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f15402b.f16292o1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f15402b.f16292o1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                wb wbVar = this.f15402b;
                wbVar.getClass();
                wbVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wbVar.o();
                wbVar.f16300r.invalidate();
                wbVar.f16287n.invalidate();
                return;
        }
    }
}
