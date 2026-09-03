package nh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class q8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15790a;
    public final i9 f15791b;

    public q8(i9 i9Var, int i10) {
        this.f15790a = i10;
        this.f15791b = i9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d4 currentPeerView;
        switch (this.f15790a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var = this.f15791b;
                i9Var.R = floatValue;
                i9Var.o();
                w8 w8Var = i9Var.f15468s;
                if (w8Var != null) {
                    w8Var.invalidate();
                }
                e1 e1Var = i9Var.f15478x0;
                if (e1Var != null) {
                    e1Var.v((1.0f - i9Var.S) * i9Var.R);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var2 = this.f15791b;
                i9Var2.R = floatValue2;
                x8 x8Var = i9Var2.v;
                if (x8Var != null && floatValue2 > 0.6f && u.f15925c && x8Var.f15926a) {
                    x8Var.a(false);
                }
                e1 e1Var2 = i9Var2.f15478x0;
                if (e1Var2 != null) {
                    e1Var2.v((1.0f - i9Var2.S) * i9Var2.R);
                }
                i9Var2.o();
                w8 w8Var2 = i9Var2.f15468s;
                if (w8Var2 != null) {
                    w8Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var3 = this.f15791b;
                i9Var3.W = floatValue3;
                i9Var3.f15429a0 = Utilities.clamp(i9Var3.W / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                y8 y8Var = i9Var3.f15452k0;
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
                i9 i9Var4 = this.f15791b;
                i9Var4.f15432b0 = floatValue4;
                i9Var4.v.invalidate();
                return;
        }
    }
}
