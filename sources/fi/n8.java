package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class n8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12353a;
    public final f9 f12354b;

    public n8(f9 f9Var, int i7) {
        this.f12353a = i7;
        this.f12354b = f9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z3 currentPeerView;
        switch (this.f12353a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9 f9Var = this.f12354b;
                f9Var.V = floatValue;
                f9Var.q();
                t8 t8Var = f9Var.f12036s;
                if (t8Var != null) {
                    t8Var.invalidate();
                }
                c1 c1Var = f9Var.B0;
                if (c1Var != null) {
                    c1Var.v((1.0f - f9Var.W) * f9Var.V);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9 f9Var2 = this.f12354b;
                f9Var2.V = floatValue2;
                u8 u8Var = f9Var2.f12045w;
                if (u8Var != null && floatValue2 > 0.6f && v.f12673c && u8Var.f12674a) {
                    u8Var.a(false);
                }
                c1 c1Var2 = f9Var2.B0;
                if (c1Var2 != null) {
                    c1Var2.v((1.0f - f9Var2.W) * f9Var2.V);
                }
                f9Var2.q();
                t8 t8Var2 = f9Var2.f12036s;
                if (t8Var2 != null) {
                    t8Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9 f9Var3 = this.f12354b;
                f9Var3.f11997a0 = floatValue3;
                f9Var3.f12008e0 = Utilities.i(f9Var3.f11997a0 / org.telegram.messenger.g0.L(200.0f), 1.0f, 0.0f);
                v8 v8Var = f9Var3.f12027o0;
                if (v8Var == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = v8Var.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9 f9Var4 = this.f12354b;
                f9Var4.f12011f0 = floatValue4;
                f9Var4.f12045w.invalidate();
                return;
        }
    }
}
