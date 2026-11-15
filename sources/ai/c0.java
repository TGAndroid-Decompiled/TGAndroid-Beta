package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.sl;
public final class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1134a;
    public final n0 f1135b;

    public c0(n0 n0Var, int i7) {
        this.f1134a = i7;
        this.f1135b = n0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1134a) {
            case 0:
                ae aeVar = this.f1135b.f1373f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = aeVar.f32970b;
                chatActivityEnterView.f32288t1 = floatValue;
                chatActivityEnterView.Z1();
                return;
            case 1:
                n0 n0Var = this.f1135b;
                n0Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.f1367b0 = floatValue2;
                n0Var.f1373f.e(floatValue2);
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0 n0Var2 = this.f1135b;
                n0Var2.E0 = floatValue3;
                sl slVar = n0Var2.D0;
                if (slVar != null && !slVar.c0()) {
                    n0Var2.D0.a0();
                    return;
                }
                return;
        }
    }
}
