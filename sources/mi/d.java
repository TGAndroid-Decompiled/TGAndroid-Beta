package mi;

import org.telegram.messenger.h10;
import org.telegram.ui.vf0;
public final class d implements Runnable {
    public final int f19554a;
    public final p f19555b;

    public d(p pVar, int i3) {
        this.f19554a = i3;
        this.f19555b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f19554a) {
            case 0:
                p pVar = this.f19555b;
                pVar.L(true, 2147483646, 0, 0L, false);
                vf0 vf0Var = pVar.P;
                if (vf0Var != null) {
                    vf0Var.g(false);
                    pVar.P = null;
                    return;
                }
                return;
            case 1:
                p pVar2 = this.f19555b;
                pVar2.L(false, 0, 0, 0L, false);
                vf0 vf0Var2 = pVar2.P;
                if (vf0Var2 != null) {
                    vf0Var2.g(true);
                    pVar2.P = null;
                    return;
                }
                return;
            case 2:
                p pVar3 = this.f19555b;
                if (!h10.i(pVar3.f19792n).q()) {
                    new vg.v0(pVar3.f38416b.X1, pVar3.getContext(), pVar3.f19792n, 43, true).show();
                    return;
                }
                return;
            case 3:
                p pVar4 = this.f19555b;
                y3 y3Var = pVar4.f19794s;
                if (y3Var != null) {
                    y3Var.setSendEnabled(pVar4.f19793r.P3());
                    return;
                }
                return;
            default:
                this.f19555b.f0();
                return;
        }
    }
}
