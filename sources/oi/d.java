package oi;

import org.telegram.messenger.j10;
import org.telegram.ui.eg0;
public final class d implements Runnable {
    public final int f21979a;
    public final o f21980b;

    public d(o oVar, int i7) {
        this.f21979a = i7;
        this.f21980b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f21979a) {
            case 0:
                o oVar = this.f21980b;
                oVar.M(true, 2147483646, 0, 0L, false);
                eg0 eg0Var = oVar.P;
                if (eg0Var != null) {
                    eg0Var.h(false);
                    oVar.P = null;
                    return;
                }
                return;
            case 1:
                o oVar2 = this.f21980b;
                oVar2.M(false, 0, 0, 0L, false);
                eg0 eg0Var2 = oVar2.P;
                if (eg0Var2 != null) {
                    eg0Var2.h(true);
                    oVar2.P = null;
                    return;
                }
                return;
            case 2:
                o oVar3 = this.f21980b;
                if (!j10.i(oVar3.f22209n).q()) {
                    new ug.z0(oVar3.f36766b.f39659a2, oVar3.getContext(), oVar3.f22209n, 43, true).show();
                    return;
                }
                return;
            case 3:
                o oVar4 = this.f21980b;
                x3 x3Var = oVar4.f22211s;
                if (x3Var != null) {
                    x3Var.setSendEnabled(oVar4.f22210r.P3());
                    return;
                }
                return;
            default:
                this.f21980b.f0();
                return;
        }
    }
}
