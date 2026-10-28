package li;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class j1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f17308a;
    public final b2 f17309b;

    public j1(b2 b2Var, int i10) {
        this.f17308a = i10;
        this.f17309b = b2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17308a) {
            case 0:
                b2 b2Var = this.f17309b;
                b2Var.getClass();
                b2Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2Var.g0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2 b2Var2 = this.f17309b;
                b2Var2.I = floatValue;
                b2Var2.w0();
                b2Var2.P.setTranslationX(AndroidUtilities.lerp(b2Var2.G[0] - b2Var2.H[0], 0, b2Var2.I));
                b2Var2.P.setTranslationY(AndroidUtilities.lerp(b2Var2.G[1] - b2Var2.H[1], 0, b2Var2.I));
                b2Var2.O.invalidate();
                return;
        }
    }
}
