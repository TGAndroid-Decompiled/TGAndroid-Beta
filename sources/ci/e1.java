package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class e1 implements Utilities.Callback {
    public final int f4592a;
    public final s2 f4593b;

    public e1(s2 s2Var, int i10) {
        this.f4592a = i10;
        this.f4593b = s2Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f4592a;
        s2 s2Var = this.f4593b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                s2.m(s2Var);
                return;
            case 1:
                i1 i1Var = s2Var.f5474f;
                ValueAnimator valueAnimator = i1Var.Q;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && i1Var.getCurrentPosition() != num.intValue()) {
                    i1Var.D(num.intValue());
                    r2 r2Var = s2Var.h;
                    r2Var.F = num.intValue();
                    r2Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i11 = s2.G;
                s2Var.p0(intValue);
                return;
        }
    }
}
