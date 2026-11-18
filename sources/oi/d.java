package oi;

import org.telegram.messenger.j10;
import org.telegram.ui.fg0;
public final class d implements Runnable {
    public final int f21976a;
    public final o f21977b;

    public d(o oVar, int i7) {
        this.f21976a = i7;
        this.f21977b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f21976a) {
            case 0:
                o oVar = this.f21977b;
                oVar.M(true, 2147483646, 0, 0L, false);
                fg0 fg0Var = oVar.P;
                if (fg0Var != null) {
                    fg0Var.h(false);
                    oVar.P = null;
                    return;
                }
                return;
            case 1:
                o oVar2 = this.f21977b;
                oVar2.M(false, 0, 0, 0L, false);
                fg0 fg0Var2 = oVar2.P;
                if (fg0Var2 != null) {
                    fg0Var2.h(true);
                    oVar2.P = null;
                    return;
                }
                return;
            case 2:
                o oVar3 = this.f21977b;
                if (!j10.i(oVar3.f22206n).q()) {
                    new ug.z0(oVar3.f36766b.f39659a2, oVar3.getContext(), oVar3.f22206n, 43, true).show();
                    return;
                }
                return;
            case 3:
                o oVar4 = this.f21977b;
                x3 x3Var = oVar4.f22208s;
                if (x3Var != null) {
                    x3Var.setSendEnabled(oVar4.f22207r.P3());
                    return;
                }
                return;
            default:
                this.f21977b.f0();
                return;
        }
    }
}
