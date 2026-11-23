package fi;

import org.telegram.messenger.voip.Instance;
public final class b1 implements Instance.OnStateUpdatedListener {
    public final c1 f11794a;

    public b1(c1 c1Var) {
        this.f11794a = c1Var;
    }

    @Override
    public final void onStateUpdated(int i7, boolean z10) {
        c1 c1Var = this.f11794a;
        boolean m10 = c1Var.m();
        c1Var.E = i7;
        org.telegram.messenger.a8.b("[LivePlayer] connectionState = " + i7);
        if (m10 != c1Var.m()) {
            org.telegram.messenger.g0.g3(new f2.a(this, 4));
        }
    }
}
