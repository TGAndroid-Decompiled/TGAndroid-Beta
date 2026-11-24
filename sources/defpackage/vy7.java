package defpackage;

import org.telegram.ui.p;
public final class vy7 implements Runnable {
    public final byte a;
    public final p b;

    public vy7(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 0:
                pVar.h0();
                return;
            case 1:
                pVar.getMessagesController().b4 = null;
                if (pVar.g1 == 3 && !pVar.isFinishing()) {
                    pVar.g1 = 4;
                    tz7 tz7Var = pVar.a1;
                    if (tz7Var != null) {
                        tz7Var.c(4);
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
                    pVar.z0();
                    pVar.e0 = null;
                    return;
                }
                return;
            default:
                pVar.f[0].requestFocus();
                gl.F3(pVar.f[0]);
                return;
        }
    }
}
