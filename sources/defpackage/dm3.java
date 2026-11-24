package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d;
public final class dm3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final jm3 b;

    public dm3(jm3 jm3Var, byte b) {
        this.a = b;
        this.b = jm3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        jm3 jm3Var = this.b;
        switch (b) {
            case 0:
                d dVar = jm3Var.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = dVar.a;
                chatActivityEnterView.A1 = floatValue;
                chatActivityEnterView.l2();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jm3Var.b0 = floatValue2;
                jm3Var.f.d(floatValue2);
                return;
            default:
                jm3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                et1 et1Var = jm3Var.E0;
                if (et1Var != null && !et1Var.d0()) {
                    jm3Var.E0.b0();
                    return;
                }
                return;
        }
    }
}
