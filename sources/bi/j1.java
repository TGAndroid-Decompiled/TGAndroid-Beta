package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class j1 implements Utilities.Callback {
    public final int f2936a;
    public final f3 f2937b;

    public j1(f3 f3Var, int i10) {
        this.f2936a = i10;
        this.f2937b = f3Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f2936a;
        f3 f3Var = this.f2937b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                f3.m(f3Var);
                return;
            case 1:
                p1 p1Var = f3Var.f2693f;
                ValueAnimator valueAnimator = p1Var.Q;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && p1Var.getCurrentPosition() != num.intValue()) {
                    p1Var.D(num.intValue());
                    e3 e3Var = f3Var.h;
                    e3Var.F = num.intValue();
                    e3Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i11 = f3.G;
                f3Var.p0(intValue);
                return;
        }
    }
}
