package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class rb implements ValueAnimator.AnimatorUpdateListener {
    public final int f1679a;
    public final kc f1680b;

    public rb(kc kcVar, int i10) {
        this.f1679a = i10;
        this.f1680b = kcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        f6 currentPeerView;
        switch (this.f1679a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc kcVar = this.f1680b;
                kcVar.U = floatValue;
                kcVar.o();
                yb ybVar = kcVar.f1294s;
                if (ybVar != null) {
                    ybVar.invalidate();
                }
                d2 d2Var = kcVar.A0;
                if (d2Var != null) {
                    d2Var.v((1.0f - kcVar.V) * kcVar.U);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc kcVar2 = this.f1680b;
                kcVar2.U = floatValue2;
                zb zbVar = kcVar2.v;
                if (zbVar != null && floatValue2 > 0.6f && i0.f1120c && zbVar.f1121a) {
                    zbVar.a(false);
                }
                d2 d2Var2 = kcVar2.A0;
                if (d2Var2 != null) {
                    d2Var2.v((1.0f - kcVar2.V) * kcVar2.U);
                }
                kcVar2.o();
                yb ybVar2 = kcVar2.f1294s;
                if (ybVar2 != null) {
                    ybVar2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc kcVar3 = this.f1680b;
                kcVar3.Z = floatValue3;
                kcVar3.f1262d0 = Utilities.clamp(kcVar3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                ac acVar = kcVar3.f1283n0;
                if (acVar == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = acVar.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc kcVar4 = this.f1680b;
                kcVar4.f1265e0 = floatValue4;
                kcVar4.v.invalidate();
                return;
        }
    }
}
