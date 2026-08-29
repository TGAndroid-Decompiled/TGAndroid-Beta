package cg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class y1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3465a;
    public final f2 f3466b;

    public y1(f2 f2Var, int i10) {
        this.f3465a = i10;
        this.f3466b = f2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3465a) {
            case 0:
                f2 f2Var = this.f3466b;
                f2Var.getClass();
                f2Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f2Var.container.invalidate();
                return;
            default:
                f2 f2Var2 = this.f3466b;
                f2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f2Var2.J0.getLayoutParams().height = AndroidUtilities.lerp(f2Var2.K0[0].getHeight(), f2Var2.K0[1].getHeight(), floatValue);
                f2Var2.J0.requestLayout();
                return;
        }
    }
}
