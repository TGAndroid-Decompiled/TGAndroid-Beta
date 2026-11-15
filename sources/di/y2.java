package di;

import org.telegram.messenger.hd;
import org.telegram.ui.an;
public final class y2 implements Runnable {
    public final int f9752a;
    public final c6 f9753b;
    public final an f9754c;
    public final long d;

    public y2(c6 c6Var, an anVar, long j3, int i7) {
        this.f9752a = i7;
        this.f9753b = c6Var;
        this.f9754c = anVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f9752a;
        long j3 = this.d;
        an anVar = this.f9754c;
        c6 c6Var = this.f9753b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.xb I = org.telegram.ui.Components.cc.a0(anVar).I(2131624029, hd.M0(2131749897, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749898, c6Var.z1(), org.telegram.messenger.m5.t(j3))));
                I.f41645t = true;
                I.j();
                return;
            default:
                org.telegram.ui.Components.xb I2 = org.telegram.ui.Components.cc.a0(anVar).I(2131624029, hd.M0(2131749897, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749898, c6Var.z1(), org.telegram.messenger.m5.t(j3))));
                I2.f41645t = true;
                I2.j();
                return;
        }
    }
}
