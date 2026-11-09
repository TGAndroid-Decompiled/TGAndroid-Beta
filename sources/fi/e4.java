package fi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.ox;
public final class e4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11873a;
    public final int f11874b;
    public final Object f11875c;
    public final Object d;

    public e4(ViewGroup viewGroup, Serializable serializable, int i7, int i10) {
        this.f11873a = i10;
        this.f11875c = viewGroup;
        this.d = serializable;
        this.f11874b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f11873a) {
            case 0:
                o5 o5Var = (o5) this.f11875c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.f12529j1.f55094a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f11874b);
                k5 k5Var = o5Var.C0;
                if (k5Var != null) {
                    k5Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((ar0) this.f11875c).f31960e.R1.put(this.f11874b, (Float) valueAnimator.getAnimatedValue());
                ((qj0) this.d).invalidate();
                return;
            case 2:
                ox oxVar = (ox) this.f11875c;
                float[] fArr = (float[]) this.d;
                oxVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < 3; i7++) {
                    float[] fArr2 = oxVar.f48539f;
                    float f11 = fArr[i7];
                    if (i7 == this.f11874b) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    fArr2[i7] = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                }
                oxVar.a();
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f11875c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.f55705t1.f55094a = i0.a.f(floatValue3, ((Integer) this.d).intValue(), this.f11874b);
                tg.e0 e0Var = g0Var.L0;
                if (e0Var != null) {
                    e0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public e4(ar0 ar0Var, int i7, qj0 qj0Var) {
        this.f11873a = 1;
        this.f11875c = ar0Var;
        this.f11874b = i7;
        this.d = qj0Var;
    }
}
