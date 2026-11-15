package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class q8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12235a;
    public final i9 f12236b;

    public q8(i9 i9Var, int i7) {
        this.f12235a = i7;
        this.f12236b = i9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        b4 currentPeerView;
        switch (this.f12235a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var = this.f12236b;
                i9Var.V = floatValue;
                i9Var.q();
                w8 w8Var = i9Var.f11870s;
                if (w8Var != null) {
                    w8Var.invalidate();
                }
                e1 e1Var = i9Var.B0;
                if (e1Var != null) {
                    e1Var.v((1.0f - i9Var.W) * i9Var.V);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var2 = this.f12236b;
                i9Var2.V = floatValue2;
                x8 x8Var = i9Var2.f11879w;
                if (x8Var != null && floatValue2 > 0.6f && v.f12407c && x8Var.f12408a) {
                    x8Var.a(false);
                }
                e1 e1Var2 = i9Var2.B0;
                if (e1Var2 != null) {
                    e1Var2.v((1.0f - i9Var2.W) * i9Var2.V);
                }
                i9Var2.q();
                w8 w8Var2 = i9Var2.f11870s;
                if (w8Var2 != null) {
                    w8Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var3 = this.f12236b;
                i9Var3.f11831a0 = floatValue3;
                i9Var3.f11842e0 = Utilities.i(i9Var3.f11831a0 / org.telegram.messenger.g0.L(200.0f), 1.0f, 0.0f);
                y8 y8Var = i9Var3.f11861o0;
                if (y8Var == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = y8Var.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var4 = this.f12236b;
                i9Var4.f11845f0 = floatValue4;
                i9Var4.f11879w.invalidate();
                return;
        }
    }
}
