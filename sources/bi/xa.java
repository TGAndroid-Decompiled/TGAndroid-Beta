package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class xa implements ValueAnimator.AnimatorUpdateListener {
    public final int f3999a;
    public final pb f4000b;

    public xa(pb pbVar, int i10) {
        this.f3999a = i10;
        this.f4000b = pbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        o5 currentPeerView;
        switch (this.f3999a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pb pbVar = this.f4000b;
                pbVar.U = floatValue;
                pbVar.o();
                db dbVar = pbVar.f3572s;
                if (dbVar != null) {
                    dbVar.invalidate();
                }
                t1 t1Var = pbVar.A0;
                if (t1Var != null) {
                    t1Var.v((1.0f - pbVar.V) * pbVar.U);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pb pbVar2 = this.f4000b;
                pbVar2.U = floatValue2;
                eb ebVar = pbVar2.v;
                if (ebVar != null && floatValue2 > 0.6f && b0.f2786c && ebVar.f2787a) {
                    ebVar.a(false);
                }
                t1 t1Var2 = pbVar2.A0;
                if (t1Var2 != null) {
                    t1Var2.v((1.0f - pbVar2.V) * pbVar2.U);
                }
                pbVar2.o();
                db dbVar2 = pbVar2.f3572s;
                if (dbVar2 != null) {
                    dbVar2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pb pbVar3 = this.f4000b;
                pbVar3.Z = floatValue3;
                pbVar3.f3540d0 = Utilities.clamp(pbVar3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                fb fbVar = pbVar3.f3561n0;
                if (fbVar == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = fbVar.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pb pbVar4 = this.f4000b;
                pbVar4.f3543e0 = floatValue4;
                pbVar4.v.invalidate();
                return;
        }
    }
}
