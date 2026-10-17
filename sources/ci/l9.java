package ci;

import android.animation.ValueAnimator;
public final class l9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5599a;
    public final o9 f5600b;

    public l9(o9 o9Var, int i10) {
        this.f5599a = i10;
        this.f5600b = o9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5599a) {
            case 0:
                aa aaVar = this.f5600b.I0;
                aaVar.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa.k(aaVar);
                return;
            default:
                aa aaVar2 = this.f5600b.I0;
                aaVar2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa.k(aaVar2);
                return;
        }
    }
}
