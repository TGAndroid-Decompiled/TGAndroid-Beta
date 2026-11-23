package hi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.px;
public final class j4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14727a;
    public final int f14728b;
    public final Object f14729c;
    public final Object d;

    public j4(ViewGroup viewGroup, Serializable serializable, int i7, int i10) {
        this.f14727a = i10;
        this.f14729c = viewGroup;
        this.d = serializable;
        this.f14728b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f14727a) {
            case 0:
                v5 v5Var = (v5) this.f14729c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v5Var.f15573k1.f57335a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f14728b);
                r5 r5Var = v5Var.D0;
                if (r5Var != null) {
                    r5Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((jr0) this.f14729c).f36502e.S1.put(this.f14728b, (Float) valueAnimator.getAnimatedValue());
                ((ek0) this.d).invalidate();
                return;
            case 2:
                px pxVar = (px) this.f14729c;
                float[] fArr = (float[]) this.d;
                pxVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < 3; i7++) {
                    float[] fArr2 = pxVar.f51159f;
                    float f11 = fArr[i7];
                    if (i7 == this.f14728b) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    fArr2[i7] = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                }
                pxVar.a();
                return;
            default:
                tg.l0 l0Var = (tg.l0) this.f14729c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f58052u1.f57335a = i0.a.f(floatValue3, ((Integer) this.d).intValue(), this.f14728b);
                tg.j0 j0Var = l0Var.M0;
                if (j0Var != null) {
                    j0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public j4(jr0 jr0Var, int i7, ek0 ek0Var) {
        this.f14727a = 1;
        this.f14729c = jr0Var;
        this.f14728b = i7;
        this.d = ek0Var;
    }
}
