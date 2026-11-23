package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.rf;
import org.telegram.ui.tl;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f1582a;
    public final k0 f1583b;

    public x(k0 k0Var, int i7) {
        this.f1582a = i7;
        this.f1583b = k0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1582a) {
            case 0:
                rf rfVar = this.f1583b.f1322f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = rfVar.f39132a;
                chatActivityEnterView.A1 = floatValue;
                chatActivityEnterView.m2();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0 k0Var = this.f1583b;
                k0Var.f1316b0 = floatValue2;
                k0Var.f1322f.d(floatValue2);
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0 k0Var2 = this.f1583b;
                k0Var2.F0 = floatValue3;
                tl tlVar = k0Var2.E0;
                if (tlVar != null && !tlVar.c0()) {
                    k0Var2.E0.a0();
                    return;
                }
                return;
        }
    }
}
