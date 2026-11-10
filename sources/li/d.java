package li;

import org.telegram.messenger.p10;
import org.telegram.ui.eg0;
public final class d implements Runnable {
    public final int f18511a;
    public final p f18512b;

    public d(p pVar, int i7) {
        this.f18511a = i7;
        this.f18512b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f18511a) {
            case 0:
                p pVar = this.f18512b;
                pVar.L(true, 2147483646, 0, 0L, false);
                eg0 eg0Var = pVar.O;
                if (eg0Var != null) {
                    eg0Var.g(false);
                    pVar.O = null;
                    return;
                }
                return;
            case 1:
                p pVar2 = this.f18512b;
                pVar2.L(false, 0, 0, 0L, false);
                eg0 eg0Var2 = pVar2.O;
                if (eg0Var2 != null) {
                    eg0Var2.g(true);
                    pVar2.O = null;
                    return;
                }
                return;
            case 2:
                p pVar3 = this.f18512b;
                if (!p10.i(pVar3.f18762n).q()) {
                    new ug.w0(pVar3.f38656b.Z1, pVar3.getContext(), pVar3.f18762n, 43, true).show();
                    return;
                }
                return;
            case 3:
                p pVar4 = this.f18512b;
                y3 y3Var = pVar4.f18764s;
                if (y3Var != null) {
                    y3Var.setSendEnabled(pVar4.f18763r.P3());
                    return;
                }
                return;
            default:
                this.f18512b.f0();
                return;
        }
    }
}
