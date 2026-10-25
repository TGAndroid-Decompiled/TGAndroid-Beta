package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class d1 implements Utilities.Callback {
    public final int f10715a;
    public final l2 f10716b;

    public d1(l2 l2Var, int i10) {
        this.f10715a = i10;
        this.f10716b = l2Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f10715a;
        l2 l2Var = this.f10716b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                l2.m(l2Var);
                return;
            case 1:
                h1 h1Var = l2Var.f11158f;
                ValueAnimator valueAnimator = h1Var.S;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && h1Var.getCurrentPosition() != num.intValue()) {
                    h1Var.E(num.intValue());
                    k2 k2Var = l2Var.h;
                    k2Var.F = num.intValue();
                    k2Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i11 = l2.H;
                l2Var.r0(intValue);
                return;
        }
    }
}
