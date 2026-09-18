package ii;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class l1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11489a;
    public final d2 f11490b;

    public l1(d2 d2Var, int i10) {
        this.f11489a = i10;
        this.f11490b = d2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11489a) {
            case 0:
                d2 d2Var = this.f11490b;
                d2Var.getClass();
                d2Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d2Var.f0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d2 d2Var2 = this.f11490b;
                d2Var2.I = floatValue;
                d2Var2.v0();
                d2Var2.P.setTranslationX(AndroidUtilities.lerp(d2Var2.G[0] - d2Var2.H[0], 0, d2Var2.I));
                d2Var2.P.setTranslationY(AndroidUtilities.lerp(d2Var2.G[1] - d2Var2.H[1], 0, d2Var2.I));
                d2Var2.O.invalidate();
                return;
        }
    }
}
