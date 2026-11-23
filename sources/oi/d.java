package oi;

import org.telegram.messenger.i10;
import org.telegram.ui.dg0;
public final class d implements Runnable {
    public final int f22115a;
    public final p f22116b;

    public d(p pVar, int i7) {
        this.f22115a = i7;
        this.f22116b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f22115a) {
            case 0:
                p pVar = this.f22116b;
                pVar.M(true, 2147483646, 0, 0L, false);
                dg0 dg0Var = pVar.P;
                if (dg0Var != null) {
                    dg0Var.h(false);
                    pVar.P = null;
                    return;
                }
                return;
            case 1:
                p pVar2 = this.f22116b;
                pVar2.M(false, 0, 0, 0L, false);
                dg0 dg0Var2 = pVar2.P;
                if (dg0Var2 != null) {
                    dg0Var2.h(true);
                    pVar2.P = null;
                    return;
                }
                return;
            case 2:
                p pVar3 = this.f22116b;
                if (!i10.i(pVar3.f22366n).q()) {
                    new ug.y0(pVar3.f37135b.f39956a2, pVar3.getContext(), pVar3.f22366n, 43, true).show();
                    return;
                }
                return;
            case 3:
                p pVar4 = this.f22116b;
                y3 y3Var = pVar4.f22368s;
                if (y3Var != null) {
                    y3Var.setSendEnabled(pVar4.f22367r.P3());
                    return;
                }
                return;
            default:
                this.f22116b.f0();
                return;
        }
    }
}
