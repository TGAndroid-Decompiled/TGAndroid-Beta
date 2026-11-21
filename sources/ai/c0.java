package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.sf;
import org.telegram.ui.tl;
public final class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1133a;
    public final p0 f1134b;

    public c0(p0 p0Var, int i7) {
        this.f1133a = i7;
        this.f1134b = p0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1133a) {
            case 0:
                sf sfVar = this.f1134b.f1386f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = sfVar.f39580a;
                chatActivityEnterView.A1 = floatValue;
                chatActivityEnterView.m2();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0 p0Var = this.f1134b;
                p0Var.f1380b0 = floatValue2;
                p0Var.f1386f.d(floatValue2);
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0 p0Var2 = this.f1134b;
                p0Var2.F0 = floatValue3;
                tl tlVar = p0Var2.E0;
                if (tlVar != null && !tlVar.c0()) {
                    p0Var2.E0.a0();
                    return;
                }
                return;
        }
    }
}
