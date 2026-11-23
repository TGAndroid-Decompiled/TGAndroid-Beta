package hi;

import android.animation.ValueAnimator;
public final class d9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14550a;
    public final sa f14551b;

    public d9(sa saVar, int i7) {
        this.f14550a = i7;
        this.f14551b = saVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14550a) {
            case 0:
                this.f14551b.N0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f14551b.f15443s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f14551b.f15443s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f14551b.f15446t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f14551b.f15446t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                sa saVar = this.f14551b;
                saVar.getClass();
                saVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                saVar.n();
                saVar.f15437r.invalidate();
                saVar.f15425n.invalidate();
                return;
        }
    }
}
