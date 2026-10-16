package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ab implements ValueAnimator.AnimatorUpdateListener {
    public final int f2842a;
    public final sb f2843b;

    public ab(sb sbVar, int i10) {
        this.f2842a = i10;
        this.f2843b = sbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        q5 currentPeerView;
        switch (this.f2842a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar = this.f2843b;
                sbVar.U = floatValue;
                sbVar.o();
                gb gbVar = sbVar.f3704s;
                if (gbVar != null) {
                    gbVar.invalidate();
                }
                t1 t1Var = sbVar.A0;
                if (t1Var != null) {
                    t1Var.v((1.0f - sbVar.V) * sbVar.U);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar2 = this.f2843b;
                sbVar2.U = floatValue2;
                hb hbVar = sbVar2.v;
                if (hbVar != null && floatValue2 > 0.6f && b0.f2853c && hbVar.f2854a) {
                    hbVar.a(false);
                }
                t1 t1Var2 = sbVar2.A0;
                if (t1Var2 != null) {
                    t1Var2.v((1.0f - sbVar2.V) * sbVar2.U);
                }
                sbVar2.o();
                gb gbVar2 = sbVar2.f3704s;
                if (gbVar2 != null) {
                    gbVar2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar3 = this.f2843b;
                sbVar3.Z = floatValue3;
                sbVar3.f3673d0 = Utilities.clamp(sbVar3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                ib ibVar = sbVar3.f3693n0;
                if (ibVar == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = ibVar.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar4 = this.f2843b;
                sbVar4.f3675e0 = floatValue4;
                sbVar4.v.invalidate();
                return;
        }
    }
}
