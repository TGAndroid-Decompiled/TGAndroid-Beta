package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5519a;
    public final aa f5520b;

    public i9(aa aaVar, int i10) {
        this.f5519a = i10;
        this.f5520b = aaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        q4 currentPeerView;
        switch (this.f5519a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar = this.f5520b;
                aaVar.U = floatValue;
                aaVar.o();
                o9 o9Var = aaVar.f5216s;
                if (o9Var != null) {
                    o9Var.invalidate();
                }
                h1 h1Var = aaVar.A0;
                if (h1Var != null) {
                    h1Var.v((1.0f - aaVar.V) * aaVar.U);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar2 = this.f5520b;
                aaVar2.U = floatValue2;
                p9 p9Var = aaVar2.v;
                if (p9Var != null && floatValue2 > 0.6f && w.f6097c && p9Var.f6098a) {
                    p9Var.a(false);
                }
                h1 h1Var2 = aaVar2.A0;
                if (h1Var2 != null) {
                    h1Var2.v((1.0f - aaVar2.V) * aaVar2.U);
                }
                aaVar2.o();
                o9 o9Var2 = aaVar2.f5216s;
                if (o9Var2 != null) {
                    o9Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar3 = this.f5520b;
                aaVar3.Z = floatValue3;
                aaVar3.f5185d0 = Utilities.clamp(aaVar3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                q9 q9Var = aaVar3.f5205n0;
                if (q9Var == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = q9Var.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar4 = this.f5520b;
                aaVar4.f5187e0 = floatValue4;
                aaVar4.v.invalidate();
                return;
        }
    }
}
