package li;

import org.telegram.messenger.p10;
import org.telegram.ui.bg0;
public final class d implements Runnable {
    public final int f18505a;
    public final p f18506b;

    public d(p pVar, int i7) {
        this.f18505a = i7;
        this.f18506b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f18505a) {
            case 0:
                p pVar = this.f18506b;
                pVar.L(true, 2147483646, 0, 0L, false);
                bg0 bg0Var = pVar.O;
                if (bg0Var != null) {
                    bg0Var.g(false);
                    pVar.O = null;
                    return;
                }
                return;
            case 1:
                p pVar2 = this.f18506b;
                pVar2.L(false, 0, 0, 0L, false);
                bg0 bg0Var2 = pVar2.O;
                if (bg0Var2 != null) {
                    bg0Var2.g(true);
                    pVar2.O = null;
                    return;
                }
                return;
            case 2:
                p pVar3 = this.f18506b;
                if (!p10.i(pVar3.f18756n).q()) {
                    new ug.w0(pVar3.f38951b.W1, pVar3.getContext(), pVar3.f18756n, 43, true).show();
                    return;
                }
                return;
            case 3:
                p pVar4 = this.f18506b;
                y3 y3Var = pVar4.f18758s;
                if (y3Var != null) {
                    y3Var.setSendEnabled(pVar4.f18757r.P3());
                    return;
                }
                return;
            default:
                this.f18506b.f0();
                return;
        }
    }
}
