package hi;

import org.telegram.messenger.ls;
import org.telegram.ui.Components.rt0;
public final class z1 implements rt0 {
    public final int f15069a;
    public final ls f15070b;

    public z1(ls lsVar, int i7) {
        this.f15069a = i7;
        this.f15070b = lsVar;
    }

    @Override
    public final void K(int i7, boolean z9) {
        switch (this.f15069a) {
            case 0:
                r2 r2Var = ((a3) this.f15070b).f14543x;
                if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                    r2Var.e(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((li.b2) this.f15070b).getClass();
                return;
        }
    }
}
