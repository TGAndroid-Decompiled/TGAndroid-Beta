package hi;

import org.telegram.messenger.ls;
import org.telegram.ui.Components.qt0;
public final class z1 implements qt0 {
    public final int f15067a;
    public final ls f15068b;

    public z1(ls lsVar, int i7) {
        this.f15067a = i7;
        this.f15068b = lsVar;
    }

    @Override
    public final void K(int i7, boolean z9) {
        switch (this.f15067a) {
            case 0:
                r2 r2Var = ((a3) this.f15068b).f14541x;
                if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                    r2Var.e(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((li.b2) this.f15068b).getClass();
                return;
        }
    }
}
