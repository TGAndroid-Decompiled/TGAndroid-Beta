package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class d1 implements Utilities.Callback {
    public final int f8878a;
    public final n2 f8879b;

    public d1(n2 n2Var, int i10) {
        this.f8878a = i10;
        this.f8879b = n2Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f8878a;
        n2 n2Var = this.f8879b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                n2.n(n2Var);
                return;
            case 1:
                h1 h1Var = n2Var.f9501f;
                ValueAnimator valueAnimator = h1Var.Q;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && h1Var.getCurrentPosition() != num.intValue()) {
                    h1Var.D(num.intValue());
                    m2 m2Var = n2Var.h;
                    m2Var.F = num.intValue();
                    m2Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i11 = n2.G;
                n2Var.q0(intValue);
                return;
        }
    }
}
