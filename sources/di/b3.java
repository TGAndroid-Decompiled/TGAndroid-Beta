package di;

import org.telegram.messenger.gd;
import org.telegram.ui.bn;
public final class b3 implements Runnable {
    public final int f8512a;
    public final f6 f8513b;
    public final bn f8514c;
    public final long d;

    public b3(f6 f6Var, bn bnVar, long j3, int i7) {
        this.f8512a = i7;
        this.f8513b = f6Var;
        this.f8514c = bnVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f8512a;
        long j3 = this.d;
        bn bnVar = this.f8514c;
        f6 f6Var = this.f8513b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.fc I = org.telegram.ui.Components.kc.b0(bnVar).I(2131624029, gd.N0(2131749880, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749881, f6Var.E1(), org.telegram.messenger.n5.t(j3))));
                I.f35101t = true;
                I.j();
                return;
            default:
                org.telegram.ui.Components.fc I2 = org.telegram.ui.Components.kc.b0(bnVar).I(2131624029, gd.N0(2131749880, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749881, f6Var.E1(), org.telegram.messenger.n5.t(j3))));
                I2.f35101t = true;
                I2.j();
                return;
        }
    }
}
