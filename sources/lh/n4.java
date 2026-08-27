package lh;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.zk0;

public final class n4 implements ValueAnimator.AnimatorUpdateListener {

    public final int f16427a;

    public final int f16428b;

    public final Object f16429c;
    public final Object d;

    public n4(as0 as0Var, int i10, zk0 zk0Var) {
        this.f16427a = 1;
        this.f16429c = as0Var;
        this.f16428b = i10;
        this.d = zk0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16427a) {
            case 0:
                f6 f6Var = (f6) this.f16429c;
                Integer num = (Integer) this.d;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.f16000w1.f50034a = i0.b.d(fFloatValue, num.intValue(), this.f16428b);
                b6 b6Var = f6Var.P0;
                if (b6Var != null) {
                    b6Var.invalidate();
                }
                break;
            case 1:
                as0 as0Var = (as0) this.f16429c;
                zk0 zk0Var = (zk0) this.d;
                as0Var.f26817e.K1.put(this.f16428b, (Float) valueAnimator.getAnimatedValue());
                zk0Var.invalidate();
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.f16429c;
                Integer num2 = (Integer) this.d;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.G1.f50034a = i0.b.d(fFloatValue2, num2.intValue(), this.f16428b);
                zf.j0 j0Var = l0Var.Y0;
                if (j0Var != null) {
                    j0Var.invalidate();
                }
                break;
        }
    }

    public n4(av0 av0Var, Integer num, int i10, int i11) {
        this.f16427a = i11;
        this.f16429c = av0Var;
        this.d = num;
        this.f16428b = i10;
    }
}
