package di;

import org.telegram.messenger.hd;
import org.telegram.ui.bn;
public final class b3 implements Runnable {
    public final int f8513a;
    public final f6 f8514b;
    public final bn f8515c;
    public final long d;

    public b3(f6 f6Var, bn bnVar, long j3, int i7) {
        this.f8513a = i7;
        this.f8514b = f6Var;
        this.f8515c = bnVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f8513a;
        long j3 = this.d;
        bn bnVar = this.f8515c;
        f6 f6Var = this.f8514b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(bnVar).I(2131624029, hd.N0(2131749880, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749881, f6Var.E1(), org.telegram.messenger.n5.t(j3))));
                I.f35499t = true;
                I.j();
                return;
            default:
                org.telegram.ui.Components.gc I2 = org.telegram.ui.Components.lc.b0(bnVar).I(2131624029, hd.N0(2131749880, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749881, f6Var.E1(), org.telegram.messenger.n5.t(j3))));
                I2.f35499t = true;
                I2.j();
                return;
        }
    }
}
