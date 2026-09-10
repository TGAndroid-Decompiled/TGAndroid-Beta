package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9750a;
    public final g2 f9751b;

    public n1(g2 g2Var, int i10) {
        this.f9750a = i10;
        this.f9751b = g2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9750a) {
            case 0:
                g2 g2Var = this.f9751b;
                g2Var.getClass();
                g2Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2Var.f0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2 g2Var2 = this.f9751b;
                g2Var2.I = floatValue;
                g2Var2.v0();
                g2Var2.P.setTranslationX(AndroidUtilities.lerp(g2Var2.G[0] - g2Var2.H[0], 0, g2Var2.I));
                g2Var2.P.setTranslationY(AndroidUtilities.lerp(g2Var2.G[1] - g2Var2.H[1], 0, g2Var2.I));
                g2Var2.O.invalidate();
                return;
        }
    }
}
