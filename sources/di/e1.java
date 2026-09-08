package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class e1 implements Utilities.Callback {
    public final int f7180a;
    public final t2 f7181b;

    public e1(t2 t2Var, int i10) {
        this.f7180a = i10;
        this.f7181b = t2Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f7180a;
        t2 t2Var = this.f7181b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                t2.m(t2Var);
                return;
            case 1:
                i1 i1Var = t2Var.f8198f;
                ValueAnimator valueAnimator = i1Var.Q;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && i1Var.getCurrentPosition() != num.intValue()) {
                    i1Var.D(num.intValue());
                    s2 s2Var = t2Var.h;
                    s2Var.F = num.intValue();
                    s2Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i11 = t2.G;
                t2Var.p0(intValue);
                return;
        }
    }
}
