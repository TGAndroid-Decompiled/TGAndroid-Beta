package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5423a;
    public final z9 f5424b;

    public h9(z9 z9Var, int i10) {
        this.f5423a = i10;
        this.f5424b = z9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        p4 currentPeerView;
        switch (this.f5423a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var = this.f5424b;
                z9Var.U = floatValue;
                z9Var.o();
                n9 n9Var = z9Var.f6249s;
                if (n9Var != null) {
                    n9Var.invalidate();
                }
                h1 h1Var = z9Var.A0;
                if (h1Var != null) {
                    h1Var.v((1.0f - z9Var.V) * z9Var.U);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var2 = this.f5424b;
                z9Var2.U = floatValue2;
                o9 o9Var = z9Var2.v;
                if (o9Var != null && floatValue2 > 0.6f && w.f6028c && o9Var.f6029a) {
                    o9Var.a(false);
                }
                h1 h1Var2 = z9Var2.A0;
                if (h1Var2 != null) {
                    h1Var2.v((1.0f - z9Var2.V) * z9Var2.U);
                }
                z9Var2.o();
                n9 n9Var2 = z9Var2.f6249s;
                if (n9Var2 != null) {
                    n9Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var3 = this.f5424b;
                z9Var3.Z = floatValue3;
                z9Var3.f6218d0 = Utilities.clamp(z9Var3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                p9 p9Var = z9Var3.f6238n0;
                if (p9Var == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = p9Var.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var4 = this.f5424b;
                z9Var4.f6220e0 = floatValue4;
                z9Var4.v.invalidate();
                return;
        }
    }
}
