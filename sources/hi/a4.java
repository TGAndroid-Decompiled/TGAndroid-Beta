package hi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.qx;
public final class a4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14227a;
    public final int f14228b;
    public final Object f14229c;
    public final Object d;

    public a4(ViewGroup viewGroup, Serializable serializable, int i7, int i10) {
        this.f14227a = i10;
        this.f14229c = viewGroup;
        this.d = serializable;
        this.f14228b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f14227a) {
            case 0:
                l5 l5Var = (l5) this.f14229c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var.f14912k1.f57218a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f14228b);
                h5 h5Var = l5Var.D0;
                if (h5Var != null) {
                    h5Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((ir0) this.f14229c).f36180e.S1.put(this.f14228b, (Float) valueAnimator.getAnimatedValue());
                ((ck0) this.d).invalidate();
                return;
            case 2:
                qx qxVar = (qx) this.f14229c;
                float[] fArr = (float[]) this.d;
                qxVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < 3; i7++) {
                    float[] fArr2 = qxVar.f51313f;
                    float f11 = fArr[i7];
                    if (i7 == this.f14228b) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    fArr2[i7] = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                }
                qxVar.a();
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f14229c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.f57878u1.f57218a = i0.a.f(floatValue3, ((Integer) this.d).intValue(), this.f14228b);
                tg.e0 e0Var = g0Var.M0;
                if (e0Var != null) {
                    e0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public a4(ir0 ir0Var, int i7, ck0 ck0Var) {
        this.f14227a = 1;
        this.f14229c = ir0Var;
        this.f14228b = i7;
        this.d = ck0Var;
    }
}
