package ji;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14036a;
    public final c2 f14037b;

    public k1(c2 c2Var, int i10) {
        this.f14036a = i10;
        this.f14037b = c2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14036a) {
            case 0:
                c2 c2Var = this.f14037b;
                c2Var.getClass();
                c2Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.f0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2 c2Var2 = this.f14037b;
                c2Var2.I = floatValue;
                c2Var2.v0();
                c2Var2.P.setTranslationX(AndroidUtilities.lerp(c2Var2.G[0] - c2Var2.H[0], 0, c2Var2.I));
                c2Var2.P.setTranslationY(AndroidUtilities.lerp(c2Var2.G[1] - c2Var2.H[1], 0, c2Var2.I));
                c2Var2.O.invalidate();
                return;
        }
    }
}
