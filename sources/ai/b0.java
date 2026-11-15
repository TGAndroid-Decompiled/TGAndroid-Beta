package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.sl;
public final class b0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1127a;
    public final m0 f1128b;

    public b0(m0 m0Var, int i7) {
        this.f1127a = i7;
        this.f1128b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1127a) {
            case 0:
                ae aeVar = this.f1128b.f1365f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = aeVar.f32967b;
                chatActivityEnterView.f32288t1 = floatValue;
                chatActivityEnterView.Z1();
                return;
            case 1:
                m0 m0Var = this.f1128b;
                m0Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f1359b0 = floatValue2;
                m0Var.f1365f.e(floatValue2);
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0 m0Var2 = this.f1128b;
                m0Var2.E0 = floatValue3;
                sl slVar = m0Var2.D0;
                if (slVar != null && !slVar.c0()) {
                    m0Var2.D0.a0();
                    return;
                }
                return;
        }
    }
}
