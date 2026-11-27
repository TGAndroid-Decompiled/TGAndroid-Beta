package defpackage;

import org.telegram.ui.p;
public final class x18 implements Runnable {
    public final byte a;
    public final p b;

    public x18(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 0:
                pVar.f[0].requestFocus();
                hl.E3(pVar.f[0]);
                return;
            case 1:
                if (pVar.e0 != null) {
                    pVar.A0();
                    pVar.e0 = null;
                    return;
                }
                return;
            case 2:
                pVar.h0();
                return;
            default:
                pVar.getMessagesController().c4 = null;
                if (pVar.g1 == 3 && !pVar.isFinishing()) {
                    pVar.g1 = 4;
                    z28 z28Var = pVar.a1;
                    if (z28Var != null) {
                        z28Var.c(4);
                    }
                    pVar.finishFragment();
                    return;
                } else if (pVar.g1 == 1 && !pVar.isFinishing()) {
                    pVar.finishFragment();
                    return;
                } else {
                    return;
                }
        }
    }
}
