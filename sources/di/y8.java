package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class y8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9974a;
    public final q9 f9975b;

    public y8(q9 q9Var, int i7) {
        this.f9974a = i7;
        this.f9975b = q9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        j4 currentPeerView;
        switch (this.f9974a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9 q9Var = this.f9975b;
                q9Var.U = floatValue;
                q9Var.q();
                e9 e9Var = q9Var.f9634s;
                if (e9Var != null) {
                    e9Var.invalidate();
                }
                g1 g1Var = q9Var.A0;
                if (g1Var != null) {
                    g1Var.v((1.0f - q9Var.V) * q9Var.U);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9 q9Var2 = this.f9975b;
                q9Var2.U = floatValue2;
                f9 f9Var = q9Var2.f9643w;
                if (f9Var != null && floatValue2 > 0.6f && v.f9851c && f9Var.f9852a) {
                    f9Var.a(false);
                }
                g1 g1Var2 = q9Var2.A0;
                if (g1Var2 != null) {
                    g1Var2.v((1.0f - q9Var2.V) * q9Var2.U);
                }
                q9Var2.q();
                e9 e9Var2 = q9Var2.f9634s;
                if (e9Var2 != null) {
                    e9Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9 q9Var3 = this.f9975b;
                q9Var3.Z = floatValue3;
                q9Var3.f9603d0 = Utilities.i(q9Var3.Z / org.telegram.messenger.g0.L(200.0f), 1.0f, 0.0f);
                g9 g9Var = q9Var3.f9624n0;
                if (g9Var == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = g9Var.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9 q9Var4 = this.f9975b;
                q9Var4.f9606e0 = floatValue4;
                q9Var4.f9643w.invalidate();
                return;
        }
    }
}
