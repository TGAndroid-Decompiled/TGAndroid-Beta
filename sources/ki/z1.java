package ki;

import org.telegram.messenger.is;
import org.telegram.ui.Components.rt0;
public final class z1 implements rt0 {
    public final int f18730a;
    public final is f18731b;

    public z1(is isVar, int i7) {
        this.f18730a = i7;
        this.f18731b = isVar;
    }

    @Override
    public final void L(int i7, boolean z10) {
        switch (this.f18730a) {
            case 0:
                o2 o2Var = ((x2) this.f18731b).f18683x;
                if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                    o2Var.e(o2Var.getTopActionBarOffsetY() + (-o2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((oi.z1) this.f18731b).getClass();
                return;
        }
    }
}
