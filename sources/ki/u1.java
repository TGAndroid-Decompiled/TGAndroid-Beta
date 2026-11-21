package ki;

import org.telegram.messenger.fs;
import org.telegram.ui.Components.cu0;
public final class u1 implements cu0 {
    public final int f18999a;
    public final fs f19000b;

    public u1(fs fsVar, int i7) {
        this.f18999a = i7;
        this.f19000b = fsVar;
    }

    @Override
    public final void L(int i7, boolean z10) {
        switch (this.f18999a) {
            case 0:
                j2 j2Var = ((s2) this.f19000b).f18959x;
                if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                    j2Var.e(j2Var.getTopActionBarOffsetY() + (-j2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((oi.b2) this.f19000b).getClass();
                return;
        }
    }
}
