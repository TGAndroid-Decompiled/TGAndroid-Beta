package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qb implements ValueAnimator.AnimatorUpdateListener {
    public final int f1439a;
    public final jc f1440b;

    public qb(jc jcVar, int i10) {
        this.f1439a = i10;
        this.f1440b = jcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        f6 currentPeerView;
        switch (this.f1439a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc jcVar = this.f1440b;
                jcVar.U = floatValue;
                jcVar.o();
                xb xbVar = jcVar.f1102s;
                if (xbVar != null) {
                    xbVar.invalidate();
                }
                d2 d2Var = jcVar.A0;
                if (d2Var != null) {
                    d2Var.v((1.0f - jcVar.V) * jcVar.U);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc jcVar2 = this.f1440b;
                jcVar2.U = floatValue2;
                yb ybVar = jcVar2.v;
                if (ybVar != null && floatValue2 > 0.6f && i0.f963c && ybVar.f964a) {
                    ybVar.a(false);
                }
                d2 d2Var2 = jcVar2.A0;
                if (d2Var2 != null) {
                    d2Var2.v((1.0f - jcVar2.V) * jcVar2.U);
                }
                jcVar2.o();
                xb xbVar2 = jcVar2.f1102s;
                if (xbVar2 != null) {
                    xbVar2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc jcVar3 = this.f1440b;
                jcVar3.Z = floatValue3;
                jcVar3.f1071d0 = Utilities.clamp(jcVar3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                zb zbVar = jcVar3.f1091n0;
                if (zbVar == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = zbVar.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc jcVar4 = this.f1440b;
                jcVar4.f1073e0 = floatValue4;
                jcVar4.v.invalidate();
                return;
        }
    }
}
