package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8597a;
    public final y9 f8598b;

    public g9(y9 y9Var, int i10) {
        this.f8597a = i10;
        this.f8598b = y9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        q4 currentPeerView;
        switch (this.f8597a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var = this.f8598b;
                y9Var.U = floatValue;
                y9Var.o();
                m9 m9Var = y9Var.f9456s;
                if (m9Var != null) {
                    m9Var.invalidate();
                }
                h1 h1Var = y9Var.A0;
                if (h1Var != null) {
                    h1Var.v((1.0f - y9Var.V) * y9Var.U);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var2 = this.f8598b;
                y9Var2.U = floatValue2;
                n9 n9Var = y9Var2.v;
                if (n9Var != null && floatValue2 > 0.6f && w.f9282c && n9Var.f9283a) {
                    n9Var.a(false);
                }
                h1 h1Var2 = y9Var2.A0;
                if (h1Var2 != null) {
                    h1Var2.v((1.0f - y9Var2.V) * y9Var2.U);
                }
                y9Var2.o();
                m9 m9Var2 = y9Var2.f9456s;
                if (m9Var2 != null) {
                    m9Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var3 = this.f8598b;
                y9Var3.Z = floatValue3;
                y9Var3.f9425d0 = Utilities.clamp(y9Var3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                o9 o9Var = y9Var3.f9445n0;
                if (o9Var == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = o9Var.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var4 = this.f8598b;
                y9Var4.f9427e0 = floatValue4;
                y9Var4.v.invalidate();
                return;
        }
    }
}
