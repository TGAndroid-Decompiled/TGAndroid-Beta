package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.rf;
import org.telegram.ui.tl;
public final class y implements ValueAnimator.AnimatorUpdateListener {
    public final int f1594a;
    public final l0 f1595b;

    public y(l0 l0Var, int i7) {
        this.f1594a = i7;
        this.f1595b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1594a) {
            case 0:
                rf rfVar = this.f1595b.f1337f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = rfVar.f39289a;
                chatActivityEnterView.A1 = floatValue;
                chatActivityEnterView.o2();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0 l0Var = this.f1595b;
                l0Var.f1331b0 = floatValue2;
                l0Var.f1337f.d(floatValue2);
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0 l0Var2 = this.f1595b;
                l0Var2.F0 = floatValue3;
                tl tlVar = l0Var2.E0;
                if (tlVar != null && !tlVar.c0()) {
                    l0Var2.E0.a0();
                    return;
                }
                return;
        }
    }
}
