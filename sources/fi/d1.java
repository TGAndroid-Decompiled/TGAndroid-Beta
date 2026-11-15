package fi;

import org.telegram.messenger.voip.Instance;
public final class d1 implements Instance.OnStateUpdatedListener {
    public final e1 f11620a;

    public d1(e1 e1Var) {
        this.f11620a = e1Var;
    }

    @Override
    public final void onStateUpdated(int i7, boolean z10) {
        e1 e1Var = this.f11620a;
        boolean m10 = e1Var.m();
        e1Var.E = i7;
        org.telegram.messenger.a8.b("[LivePlayer] connectionState = " + i7);
        if (m10 != e1Var.m()) {
            org.telegram.messenger.g0.h3(new c1(this, 0));
        }
    }
}
