package defpackage;

import org.telegram.ui.p;
public final class x08 implements Runnable {
    public final byte a;
    public final p b;

    public x08(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 0:
                pVar.i0();
                return;
            case 1:
                pVar.getMessagesController().b4 = null;
                if (pVar.g1 == 3 && !pVar.isFinishing()) {
                    pVar.g1 = 4;
                    w18 w18Var = pVar.a1;
                    if (w18Var != null) {
                        w18Var.c(4);
                    }
                    pVar.finishFragment();
                    return;
                } else if (pVar.g1 == 1 && !pVar.isFinishing()) {
                    pVar.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                if (pVar.e0 != null) {
                    pVar.A0();
                    pVar.e0 = null;
                    return;
                }
                return;
            default:
                pVar.f[0].requestFocus();
                gm.E3(pVar.f[0]);
                return;
        }
    }
}
