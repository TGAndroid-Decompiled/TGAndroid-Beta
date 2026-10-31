package bi;

import org.telegram.messenger.us;
import org.telegram.ui.Components.tu0;
public final class s1 implements tu0 {
    public final int f3337a;
    public final us f3338b;

    public s1(us usVar, int i10) {
        this.f3337a = i10;
        this.f3338b = usVar;
    }

    @Override
    public final void K(int i10, boolean z10) {
        switch (this.f3337a) {
            case 0:
                ((k2) this.f3338b).getClass();
                return;
            default:
                xh.d2 d2Var = ((xh.m2) this.f3338b).f53904x;
                if (i10 > org.telegram.messenger.i0.L(20.0f)) {
                    d2Var.e(d2Var.getTopActionBarOffsetY() + (-d2Var.getOffsetY()));
                    return;
                }
                return;
        }
    }
}
