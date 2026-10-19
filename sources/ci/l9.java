package ci;

import android.animation.ValueAnimator;
public final class l9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5597a;
    public final o9 f5598b;

    public l9(o9 o9Var, int i10) {
        this.f5597a = i10;
        this.f5598b = o9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5597a) {
            case 0:
                aa aaVar = this.f5598b.I0;
                aaVar.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa.k(aaVar);
                return;
            default:
                aa aaVar2 = this.f5598b.I0;
                aaVar2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa.k(aaVar2);
                return;
        }
    }
}
