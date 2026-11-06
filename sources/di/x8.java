package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class x8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9943a;
    public final p9 f9944b;

    public x8(p9 p9Var, int i7) {
        this.f9943a = i7;
        this.f9944b = p9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        i4 currentPeerView;
        switch (this.f9943a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9 p9Var = this.f9944b;
                p9Var.U = floatValue;
                p9Var.q();
                d9 d9Var = p9Var.f9569s;
                if (d9Var != null) {
                    d9Var.invalidate();
                }
                g1 g1Var = p9Var.A0;
                if (g1Var != null) {
                    g1Var.v((1.0f - p9Var.V) * p9Var.U);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9 p9Var2 = this.f9944b;
                p9Var2.U = floatValue2;
                e9 e9Var = p9Var2.f9578w;
                if (e9Var != null && floatValue2 > 0.6f && v.f9858c && e9Var.f9859a) {
                    e9Var.a(false);
                }
                g1 g1Var2 = p9Var2.A0;
                if (g1Var2 != null) {
                    g1Var2.v((1.0f - p9Var2.V) * p9Var2.U);
                }
                p9Var2.q();
                d9 d9Var2 = p9Var2.f9569s;
                if (d9Var2 != null) {
                    d9Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9 p9Var3 = this.f9944b;
                p9Var3.Z = floatValue3;
                p9Var3.f9538d0 = Utilities.i(p9Var3.Z / org.telegram.messenger.g0.L(200.0f), 1.0f, 0.0f);
                f9 f9Var = p9Var3.f9559n0;
                if (f9Var == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = f9Var.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9 p9Var4 = this.f9944b;
                p9Var4.f9541e0 = floatValue4;
                p9Var4.f9578w.invalidate();
                return;
        }
    }
}
