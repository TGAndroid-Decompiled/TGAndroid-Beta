package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class x8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11213a;
    public final r9 f11214b;

    public x8(r9 r9Var, int i3) {
        this.f11213a = i3;
        this.f11214b = r9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        j4 currentPeerView;
        switch (this.f11213a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9 r9Var = this.f11214b;
                r9Var.V = floatValue;
                r9Var.B();
                e9 e9Var = r9Var.f10948s;
                if (e9Var != null) {
                    e9Var.invalidate();
                }
                g1 g1Var = r9Var.B0;
                if (g1Var != null) {
                    g1Var.v((1.0f - r9Var.W) * r9Var.V);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9 r9Var2 = this.f11214b;
                r9Var2.V = floatValue2;
                f9 f9Var = r9Var2.f10957w;
                if (f9Var != null && floatValue2 > 0.6f && w.f11144c && f9Var.f11145a) {
                    f9Var.a(false);
                }
                g1 g1Var2 = r9Var2.B0;
                if (g1Var2 != null) {
                    g1Var2.v((1.0f - r9Var2.W) * r9Var2.V);
                }
                r9Var2.B();
                e9 e9Var2 = r9Var2.f10948s;
                if (e9Var2 != null) {
                    e9Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9 r9Var3 = this.f11214b;
                r9Var3.f10909a0 = floatValue3;
                r9Var3.f10920e0 = Utilities.i(r9Var3.f10909a0 / org.telegram.messenger.g0.L(200.0f), 1.0f, 0.0f);
                g9 g9Var = r9Var3.f10939o0;
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
                r9 r9Var4 = this.f11214b;
                r9Var4.f10923f0 = floatValue4;
                r9Var4.f10957w.invalidate();
                return;
        }
    }
}
