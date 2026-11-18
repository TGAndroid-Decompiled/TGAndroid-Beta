package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.qf;
import org.telegram.ui.tl;
public final class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1133a;
    public final n0 f1134b;

    public c0(n0 n0Var, int i7) {
        this.f1133a = i7;
        this.f1134b = n0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1133a) {
            case 0:
                qf qfVar = this.f1134b.f1364f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = qfVar.f38784a;
                chatActivityEnterView.f32722y1 = floatValue;
                chatActivityEnterView.i2();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0 n0Var = this.f1134b;
                n0Var.f1358b0 = floatValue2;
                n0Var.f1364f.d(floatValue2);
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0 n0Var2 = this.f1134b;
                n0Var2.F0 = floatValue3;
                tl tlVar = n0Var2.E0;
                if (tlVar != null && !tlVar.c0()) {
                    n0Var2.E0.a0();
                    return;
                }
                return;
        }
    }
}
