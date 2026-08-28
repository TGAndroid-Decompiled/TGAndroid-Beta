package ih;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class u8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12210a;
    public final m9 f12211b;

    public u8(m9 m9Var, int i9) {
        this.f12210a = i9;
        this.f12211b = m9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        i4 currentPeerView;
        switch (this.f12210a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9 m9Var = this.f12211b;
                m9Var.Q = floatValue;
                m9Var.o();
                a9 a9Var = m9Var.f11824s;
                if (a9Var != null) {
                    a9Var.invalidate();
                }
                f1 f1Var = m9Var.f11831w0;
                if (f1Var != null) {
                    f1Var.v((1.0f - m9Var.R) * m9Var.Q);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9 m9Var2 = this.f12211b;
                m9Var2.Q = floatValue2;
                b9 b9Var = m9Var2.v;
                if (b9Var != null && floatValue2 > 0.6f && v.f12218c && b9Var.f12219a) {
                    b9Var.a(false);
                }
                f1 f1Var2 = m9Var2.f11831w0;
                if (f1Var2 != null) {
                    f1Var2.v((1.0f - m9Var2.R) * m9Var2.Q);
                }
                m9Var2.o();
                a9 a9Var2 = m9Var2.f11824s;
                if (a9Var2 != null) {
                    a9Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9 m9Var3 = this.f12211b;
                m9Var3.V = floatValue3;
                m9Var3.Z = Utilities.clamp(m9Var3.V / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                c9 c9Var = m9Var3.f11806j0;
                if (c9Var == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = c9Var.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9 m9Var4 = this.f12211b;
                m9Var4.f11784a0 = floatValue4;
                m9Var4.v.invalidate();
                return;
        }
    }
}
