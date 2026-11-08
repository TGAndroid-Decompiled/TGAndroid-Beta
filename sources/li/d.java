package li;

import org.telegram.messenger.p10;
import org.telegram.ui.bg0;
public final class d implements Runnable {
    public final int f18508a;
    public final p f18509b;

    public d(p pVar, int i7) {
        this.f18508a = i7;
        this.f18509b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f18508a) {
            case 0:
                p pVar = this.f18509b;
                pVar.L(true, 2147483646, 0, 0L, false);
                bg0 bg0Var = pVar.O;
                if (bg0Var != null) {
                    bg0Var.g(false);
                    pVar.O = null;
                    return;
                }
                return;
            case 1:
                p pVar2 = this.f18509b;
                pVar2.L(false, 0, 0, 0L, false);
                bg0 bg0Var2 = pVar2.O;
                if (bg0Var2 != null) {
                    bg0Var2.g(true);
                    pVar2.O = null;
                    return;
                }
                return;
            case 2:
                p pVar3 = this.f18509b;
                if (!p10.i(pVar3.f18759n).q()) {
                    new ug.w0(pVar3.f39004b.W1, pVar3.getContext(), pVar3.f18759n, 43, true).show();
                    return;
                }
                return;
            case 3:
                p pVar4 = this.f18509b;
                y3 y3Var = pVar4.f18761s;
                if (y3Var != null) {
                    y3Var.setSendEnabled(pVar4.f18760r.P3());
                    return;
                }
                return;
            default:
                this.f18509b.f0();
                return;
        }
    }
}
