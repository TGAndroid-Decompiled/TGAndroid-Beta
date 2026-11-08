package fi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.mx;
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
                o5Var.f12531j1.f55109a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f11874b);
                k5 k5Var = o5Var.C0;
                if (k5Var != null) {
                    k5Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((yq0) this.f11875c).f40737e.R1.put(this.f11874b, (Float) valueAnimator.getAnimatedValue());
                ((pj0) this.d).invalidate();
                return;
            case 2:
                mx mxVar = (mx) this.f11875c;
                float[] fArr = (float[]) this.d;
                mxVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < 3; i7++) {
                    float[] fArr2 = mxVar.f47898f;
                    float f11 = fArr[i7];
                    if (i7 == this.f11874b) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    fArr2[i7] = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                }
                mxVar.a();
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f11875c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.f55693t1.f55109a = i0.a.f(floatValue3, ((Integer) this.d).intValue(), this.f11874b);
                tg.e0 e0Var = g0Var.L0;
                if (e0Var != null) {
                    e0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public e4(yq0 yq0Var, int i7, pj0 pj0Var) {
        this.f11873a = 1;
        this.f11875c = yq0Var;
        this.f11874b = i7;
        this.d = pj0Var;
    }
}
