package ki;

import org.telegram.messenger.fs;
import org.telegram.ui.Components.bu0;
public final class u1 implements bu0 {
    public final int f19070a;
    public final fs f19071b;

    public u1(fs fsVar, int i7) {
        this.f19070a = i7;
        this.f19071b = fsVar;
    }

    @Override
    public final void L(int i7, boolean z10) {
        switch (this.f19070a) {
            case 0:
                j2 j2Var = ((t2) this.f19071b).f19047x;
                if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                    j2Var.e(j2Var.getTopActionBarOffsetY() + (-j2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((oi.b2) this.f19071b).getClass();
                return;
        }
    }
}
