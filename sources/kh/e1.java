package kh;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class e1 implements Utilities.Callback {
    public final int f15143a;
    public final n2 f15144b;

    public e1(n2 n2Var, int i9) {
        this.f15143a = i9;
        this.f15144b = n2Var;
    }

    @Override
    public final void run(Object obj) {
        int i9 = this.f15143a;
        n2 n2Var = this.f15144b;
        Integer num = (Integer) obj;
        switch (i9) {
            case 0:
                n2.m(n2Var);
                return;
            case 1:
                j1 j1Var = n2Var.f15736f;
                ValueAnimator valueAnimator = j1Var.M;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && j1Var.getCurrentPosition() != num.intValue()) {
                    j1Var.D(num.intValue());
                    m2 m2Var = n2Var.h;
                    m2Var.B = num.intValue();
                    m2Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i10 = n2.C;
                n2Var.o0(intValue);
                return;
        }
    }
}
