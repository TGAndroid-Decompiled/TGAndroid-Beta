package oi;

import org.telegram.messenger.j10;
import org.telegram.ui.eg0;
public final class d implements Runnable {
    public final int f22046a;
    public final o f22047b;

    public d(o oVar, int i7) {
        this.f22046a = i7;
        this.f22047b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f22046a) {
            case 0:
                o oVar = this.f22047b;
                oVar.M(true, 2147483646, 0, 0L, false);
                eg0 eg0Var = oVar.P;
                if (eg0Var != null) {
                    eg0Var.h(false);
                    oVar.P = null;
                    return;
                }
                return;
            case 1:
                o oVar2 = this.f22047b;
                oVar2.M(false, 0, 0, 0L, false);
                eg0 eg0Var2 = oVar2.P;
                if (eg0Var2 != null) {
                    eg0Var2.h(true);
                    oVar2.P = null;
                    return;
                }
                return;
            case 2:
                o oVar3 = this.f22047b;
                if (!j10.i(oVar3.f22266n).q()) {
                    new ug.y0(oVar3.f37521b.f40375a2, oVar3.getContext(), oVar3.f22266n, 43, true).show();
                    return;
                }
                return;
            case 3:
                o oVar4 = this.f22047b;
                y3 y3Var = oVar4.f22268s;
                if (y3Var != null) {
                    y3Var.setSendEnabled(oVar4.f22267r.P3());
                    return;
                }
                return;
            default:
                this.f22047b.f0();
                return;
        }
    }
}
