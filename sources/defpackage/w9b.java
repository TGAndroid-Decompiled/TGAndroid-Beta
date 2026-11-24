package defpackage;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class w9b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final oab b;

    public w9b(oab oabVar, byte b) {
        this.a = b;
        this.b = oabVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a58 currentPeerView;
        byte b = this.a;
        oab oabVar = this.b;
        switch (b) {
            case 0:
                oabVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oabVar.l();
                cab cabVar = oabVar.s;
                if (cabVar != null) {
                    cabVar.invalidate();
                }
                s96 s96Var = oabVar.B0;
                if (s96Var != null) {
                    s96Var.F((1.0f - oabVar.W) * oabVar.V);
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oabVar.V = floatValue;
                dab dabVar = oabVar.w;
                if (dabVar != null && floatValue > 0.6f && pi5.c && dabVar.a) {
                    dabVar.a(false);
                }
                s96 s96Var2 = oabVar.B0;
                if (s96Var2 != null) {
                    s96Var2.F((1.0f - oabVar.W) * oabVar.V);
                }
                oabVar.l();
                cab cabVar2 = oabVar.s;
                if (cabVar2 != null) {
                    cabVar2.invalidate();
                    return;
                }
                return;
            case 2:
                oabVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oabVar.e0 = Utilities.i(oabVar.a0 / gm.L(200.0f), 1.0f, 0.0f);
                eab eabVar = oabVar.o0;
                if (eabVar == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = eabVar.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                oabVar.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oabVar.w.invalidate();
                return;
        }
    }
}
