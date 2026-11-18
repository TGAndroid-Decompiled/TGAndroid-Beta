package di;

import org.telegram.messenger.gd;
import org.telegram.ui.bn;
public final class b3 implements Runnable {
    public final int f8526a;
    public final f6 f8527b;
    public final bn f8528c;
    public final long d;

    public b3(f6 f6Var, bn bnVar, long j3, int i7) {
        this.f8526a = i7;
        this.f8527b = f6Var;
        this.f8528c = bnVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f8526a;
        long j3 = this.d;
        bn bnVar = this.f8528c;
        f6 f6Var = this.f8527b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(bnVar).I(2131624029, gd.M0(2131749881, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749882, f6Var.E1(), org.telegram.messenger.n5.t(j3))));
                I.f35471t = true;
                I.j();
                return;
            default:
                org.telegram.ui.Components.gc I2 = org.telegram.ui.Components.lc.b0(bnVar).I(2131624029, gd.M0(2131749881, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749882, f6Var.E1(), org.telegram.messenger.n5.t(j3))));
                I2.f35471t = true;
                I2.j();
                return;
        }
    }
}
