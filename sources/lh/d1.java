package lh;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

public final class d1 implements Utilities.Callback {

    public final int f15849a;

    public final l2 f15850b;

    public d1(l2 l2Var, int i10) {
        this.f15849a = i10;
        this.f15850b = l2Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f15849a;
        l2 l2Var = this.f15850b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                l2.m(l2Var);
                break;
            case 1:
                h1 h1Var = l2Var.f16288f;
                ValueAnimator valueAnimator = h1Var.M;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && h1Var.getCurrentPosition() != num.intValue()) {
                    h1Var.D(num.intValue());
                    k2 k2Var = l2Var.h;
                    k2Var.B = num.intValue();
                    k2Var.invalidate();
                }
                break;
            default:
                int iIntValue = num.intValue();
                int i11 = l2.C;
                l2Var.p0(iIntValue);
                break;
        }
    }
}
