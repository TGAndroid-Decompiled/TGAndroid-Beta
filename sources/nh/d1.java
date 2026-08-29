package nh;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class d1 implements Utilities.Callback {
    public final int f17518a;
    public final k2 f17519b;

    public d1(k2 k2Var, int i10) {
        this.f17518a = i10;
        this.f17519b = k2Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f17518a;
        k2 k2Var = this.f17519b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                k2.m(k2Var);
                return;
            case 1:
                g1 g1Var = k2Var.f17993f;
                ValueAnimator valueAnimator = g1Var.M;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && g1Var.getCurrentPosition() != num.intValue()) {
                    g1Var.D(num.intValue());
                    j2 j2Var = k2Var.h;
                    j2Var.B = num.intValue();
                    j2Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i11 = k2.C;
                k2Var.p0(intValue);
                return;
        }
    }
}
