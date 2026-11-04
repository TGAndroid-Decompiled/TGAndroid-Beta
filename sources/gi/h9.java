package gi;

import android.animation.ValueAnimator;
public final class h9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12921a;
    public final va f12922b;

    public h9(va vaVar, int i3) {
        this.f12921a = i3;
        this.f12922b = vaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12921a) {
            case 0:
                this.f12922b.N0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f12922b.f13757s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f12922b.f13757s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f12922b.f13760t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f12922b.f13760t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                va vaVar = this.f12922b;
                vaVar.getClass();
                vaVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vaVar.n();
                vaVar.f13751r.invalidate();
                vaVar.f13738n.invalidate();
                return;
        }
    }
}
