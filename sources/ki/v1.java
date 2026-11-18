package ki;

import org.telegram.messenger.fs;
import org.telegram.ui.Components.zt0;
public final class v1 implements zt0 {
    public final int f18989a;
    public final fs f18990b;

    public v1(fs fsVar, int i7) {
        this.f18989a = i7;
        this.f18990b = fsVar;
    }

    @Override
    public final void L(int i7, boolean z10) {
        switch (this.f18989a) {
            case 0:
                k2 k2Var = ((t2) this.f18990b).f18949x;
                if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                    k2Var.e(k2Var.getTopActionBarOffsetY() + (-k2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((oi.z1) this.f18990b).getClass();
                return;
        }
    }
}
