package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class d1 implements Utilities.Callback {
    public final int f4893a;
    public final r2 f4894b;

    public d1(r2 r2Var, int i10) {
        this.f4893a = i10;
        this.f4894b = r2Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f4893a;
        r2 r2Var = this.f4894b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                r2.o(r2Var);
                return;
            case 1:
                h1 h1Var = r2Var.f5885f;
                ValueAnimator valueAnimator = h1Var.Q;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && h1Var.getCurrentPosition() != num.intValue()) {
                    h1Var.D(num.intValue());
                    q2 q2Var = r2Var.h;
                    q2Var.F = num.intValue();
                    q2Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i11 = r2.G;
                r2Var.q0(intValue);
                return;
        }
    }
}
