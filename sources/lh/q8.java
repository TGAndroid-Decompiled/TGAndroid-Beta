package lh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class q8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f16136a;
    public final i9 f16137b;

    public q8(i9 i9Var, int i10) {
        this.f16136a = i10;
        this.f16137b = i9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d4 currentPeerView;
        switch (this.f16136a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var = this.f16137b;
                i9Var.Q = floatValue;
                i9Var.o();
                w8 w8Var = i9Var.f15783s;
                if (w8Var != null) {
                    w8Var.invalidate();
                }
                d1 d1Var = i9Var.f15790w0;
                if (d1Var != null) {
                    d1Var.v((1.0f - i9Var.R) * i9Var.Q);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var2 = this.f16137b;
                i9Var2.Q = floatValue2;
                x8 x8Var = i9Var2.v;
                if (x8Var != null && floatValue2 > 0.6f && t.f16248c && x8Var.f16249a) {
                    x8Var.a(false);
                }
                d1 d1Var2 = i9Var2.f15790w0;
                if (d1Var2 != null) {
                    d1Var2.v((1.0f - i9Var2.R) * i9Var2.Q);
                }
                i9Var2.o();
                w8 w8Var2 = i9Var2.f15783s;
                if (w8Var2 != null) {
                    w8Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var3 = this.f16137b;
                i9Var3.V = floatValue3;
                i9Var3.Z = Utilities.clamp(i9Var3.V / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                y8 y8Var = i9Var3.f15765j0;
                if (y8Var == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = y8Var.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var4 = this.f16137b;
                i9Var4.f15743a0 = floatValue4;
                i9Var4.v.invalidate();
                return;
        }
    }
}
