package ei;

import org.telegram.messenger.voip.Instance;
public final class f1 implements Instance.OnStateUpdatedListener {
    public final g1 f10258a;

    public f1(g1 g1Var) {
        this.f10258a = g1Var;
    }

    @Override
    public final void onStateUpdated(int i3, boolean z10) {
        g1 g1Var = this.f10258a;
        boolean m10 = g1Var.m();
        g1Var.E = i3;
        org.telegram.messenger.a8.b("[LivePlayer] connectionState = " + i3);
        if (m10 != g1Var.m()) {
            org.telegram.messenger.g0.h3(new ci.d1(this, 22));
        }
    }
}
