package gi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.jx;
public final class b4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12445a;
    public final int f12446b;
    public final Object f12447c;
    public final Object d;

    public b4(ViewGroup viewGroup, Serializable serializable, int i3, int i10) {
        this.f12445a = i10;
        this.f12447c = viewGroup;
        this.d = serializable;
        this.f12446b = i3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f12445a) {
            case 0:
                m5 m5Var = (m5) this.f12447c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.k1.f55186a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f12446b);
                i5 i5Var = m5Var.D0;
                if (i5Var != null) {
                    i5Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((yq0) this.f12447c).f40808e.S1.put(this.f12446b, (Float) valueAnimator.getAnimatedValue());
                ((tj0) this.d).invalidate();
                return;
            case 2:
                jx jxVar = (jx) this.f12447c;
                float[] fArr = (float[]) this.d;
                jxVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i3 = 0; i3 < 3; i3++) {
                    float[] fArr2 = jxVar.f46703f;
                    float f11 = fArr[i3];
                    if (i3 == this.f12446b) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    fArr2[i3] = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                }
                jxVar.a();
                return;
            default:
                ug.f0 f0Var = (ug.f0) this.f12447c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.f55992u1.f55186a = i0.a.f(floatValue3, ((Integer) this.d).intValue(), this.f12446b);
                ug.d0 d0Var = f0Var.M0;
                if (d0Var != null) {
                    d0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public b4(yq0 yq0Var, int i3, tj0 tj0Var) {
        this.f12445a = 1;
        this.f12447c = yq0Var;
        this.f12446b = i3;
        this.d = tj0Var;
    }
}
