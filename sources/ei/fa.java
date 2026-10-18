package ei;

import android.animation.ValueAnimator;
public final class fa implements ValueAnimator.AnimatorUpdateListener {
    public final int f9053a;
    public final vb f9054b;

    public fa(vb vbVar, int i10) {
        this.f9053a = i10;
        this.f9054b = vbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9053a) {
            case 0:
                this.f9054b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f9054b.f10005r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f9054b.f10005r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f9054b.f10009s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f9054b.f10009s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                vb vbVar = this.f9054b;
                vbVar.getClass();
                vbVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vbVar.n();
                vbVar.f10003r.invalidate();
                vbVar.f9990n.invalidate();
                return;
        }
    }
}
