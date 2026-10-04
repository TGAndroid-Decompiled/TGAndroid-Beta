package ii;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class l1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12499a;
    public final e2 f12500b;

    public l1(e2 e2Var, int i10) {
        this.f12499a = i10;
        this.f12500b = e2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12499a) {
            case 0:
                e2 e2Var = this.f12500b;
                e2Var.getClass();
                e2Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2Var.f0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2 e2Var2 = this.f12500b;
                e2Var2.I = floatValue;
                e2Var2.v0();
                e2Var2.P.setTranslationX(AndroidUtilities.lerp(e2Var2.G[0] - e2Var2.H[0], 0, e2Var2.I));
                e2Var2.P.setTranslationY(AndroidUtilities.lerp(e2Var2.G[1] - e2Var2.H[1], 0, e2Var2.I));
                e2Var2.O.invalidate();
                return;
        }
    }
}
