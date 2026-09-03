package eg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5565a;
    public final e2 f5566b;

    public x1(e2 e2Var, int i10) {
        this.f5565a = i10;
        this.f5566b = e2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5565a) {
            case 0:
                e2 e2Var = this.f5566b;
                e2Var.getClass();
                e2Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2Var.container.invalidate();
                return;
            default:
                e2 e2Var2 = this.f5566b;
                e2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2Var2.K0.getLayoutParams().height = AndroidUtilities.lerp(e2Var2.L0[0].getHeight(), e2Var2.L0[1].getHeight(), floatValue);
                e2Var2.K0.requestLayout();
                return;
        }
    }
}
