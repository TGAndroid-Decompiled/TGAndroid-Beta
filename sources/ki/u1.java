package ki;

import org.telegram.messenger.gs;
import org.telegram.ui.Components.cu0;
public final class u1 implements cu0 {
    public final int f18968a;
    public final gs f18969b;

    public u1(gs gsVar, int i7) {
        this.f18968a = i7;
        this.f18969b = gsVar;
    }

    @Override
    public final void L(int i7, boolean z10) {
        switch (this.f18968a) {
            case 0:
                j2 j2Var = ((s2) this.f18969b).f18928x;
                if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                    j2Var.e(j2Var.getTopActionBarOffsetY() + (-j2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((oi.a2) this.f18969b).getClass();
                return;
        }
    }
}
