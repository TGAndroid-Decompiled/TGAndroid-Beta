package defpackage;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class sbb implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final lcb b;

    public sbb(lcb lcbVar, byte b) {
        this.a = b;
        this.b = lcbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        o68 currentPeerView;
        byte b = this.a;
        lcb lcbVar = this.b;
        switch (b) {
            case 0:
                lcbVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar.l();
                ybb ybbVar = lcbVar.s;
                if (ybbVar != null) {
                    ybbVar.invalidate();
                }
                w96 w96Var = lcbVar.B0;
                if (w96Var != null) {
                    w96Var.F((1.0f - lcbVar.W) * lcbVar.V);
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar.V = floatValue;
                zbb zbbVar = lcbVar.w;
                if (zbbVar != null && floatValue > 0.6f && si5.c && zbbVar.a) {
                    zbbVar.a(false);
                }
                w96 w96Var2 = lcbVar.B0;
                if (w96Var2 != null) {
                    w96Var2.F((1.0f - lcbVar.W) * lcbVar.V);
                }
                lcbVar.l();
                ybb ybbVar2 = lcbVar.s;
                if (ybbVar2 != null) {
                    ybbVar2.invalidate();
                    return;
                }
                return;
            case 2:
                lcbVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar.e0 = Utilities.i(lcbVar.a0 / hl.L(200.0f), 1.0f, 0.0f);
                acb acbVar = lcbVar.o0;
                if (acbVar == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = acbVar.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                lcbVar.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar.w.invalidate();
                return;
        }
    }
}
