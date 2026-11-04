package ci;

import org.telegram.messenger.bd;
import org.telegram.ui.wm;
public final class f3 implements Runnable {
    public final int f5072a;
    public final l6 f5073b;
    public final wm f5074c;
    public final long d;

    public f3(l6 l6Var, wm wmVar, long j10, int i3) {
        this.f5072a = i3;
        this.f5073b = l6Var;
        this.f5074c = wmVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i3 = this.f5072a;
        long j10 = this.d;
        wm wmVar = this.f5074c;
        l6 l6Var = this.f5073b;
        switch (i3) {
            case 0:
                org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(wmVar).I(2131624028, bd.M0(2131749905, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749906, l6Var.z1(), org.telegram.messenger.m5.t(j10))));
                I.f31802t = true;
                I.j();
                return;
            default:
                org.telegram.ui.Components.ac I2 = org.telegram.ui.Components.fc.a0(wmVar).I(2131624028, bd.M0(2131749905, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749906, l6Var.z1(), org.telegram.messenger.m5.t(j10))));
                I2.f31802t = true;
                I2.j();
                return;
        }
    }
}
