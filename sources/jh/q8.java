package jh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class q8 implements ValueAnimator.AnimatorUpdateListener {

    public final int f13871a;

    public final i9 f13872b;

    public q8(i9 i9Var, int i10) {
        this.f13871a = i10;
        this.f13872b = i9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13871a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var = this.f13872b;
                i9Var.Q = fFloatValue;
                i9Var.o();
                w8 w8Var = i9Var.f13505s;
                if (w8Var != null) {
                    w8Var.invalidate();
                }
                d1 d1Var = i9Var.f13512w0;
                if (d1Var != null) {
                    d1Var.v((1.0f - i9Var.R) * i9Var.Q);
                }
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var2 = this.f13872b;
                i9Var2.Q = fFloatValue2;
                x8 x8Var = i9Var2.v;
                if (x8Var != null && fFloatValue2 > 0.6f && t.f13983c && x8Var.f13984a) {
                    x8Var.a(false);
                }
                d1 d1Var2 = i9Var2.f13512w0;
                if (d1Var2 != null) {
                    d1Var2.v((1.0f - i9Var2.R) * i9Var2.Q);
                }
                i9Var2.o();
                w8 w8Var2 = i9Var2.f13505s;
                if (w8Var2 != null) {
                    w8Var2.invalidate();
                }
                break;
            case 2:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var3 = this.f13872b;
                i9Var3.V = fFloatValue3;
                i9Var3.Z = Utilities.clamp(i9Var3.V / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                y8 y8Var = i9Var3.f13487j0;
                e4 currentPeerView = y8Var == null ? null : y8Var.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                break;
            default:
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var4 = this.f13872b;
                i9Var4.f13465a0 = fFloatValue4;
                i9Var4.v.invalidate();
                break;
        }
    }
}
