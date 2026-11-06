package di;

import bi.ab;
import org.telegram.messenger.voip.Instance;
public final class f1 implements Instance.OnStateUpdatedListener {
    public final g1 f8976a;

    public f1(g1 g1Var) {
        this.f8976a = g1Var;
    }

    @Override
    public final void onStateUpdated(int i7, boolean z9) {
        g1 g1Var = this.f8976a;
        boolean m10 = g1Var.m();
        g1Var.D = i7;
        org.telegram.messenger.a8.b("[LivePlayer] connectionState = " + i7);
        if (m10 != g1Var.m()) {
            org.telegram.messenger.g0.h3(new ab(this, 16));
        }
    }
}
