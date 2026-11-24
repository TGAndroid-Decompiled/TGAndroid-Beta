package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d;
public final class on3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final un3 b;

    public on3(un3 un3Var, byte b) {
        this.a = b;
        this.b = un3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        un3 un3Var = this.b;
        switch (b) {
            case 0:
                d dVar = un3Var.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = dVar.a;
                chatActivityEnterView.A1 = floatValue;
                chatActivityEnterView.q2();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un3Var.b0 = floatValue2;
                un3Var.f.d(floatValue2);
                return;
            default:
                un3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qu1 qu1Var = un3Var.E0;
                if (qu1Var != null && !qu1Var.d0()) {
                    un3Var.E0.b0();
                    return;
                }
                return;
        }
    }
}
