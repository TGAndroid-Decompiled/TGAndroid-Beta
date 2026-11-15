package org.telegram.messenger;
public final class xb implements Runnable {
    public final int f27477a;
    public final ac f27478b;

    public xb(ac acVar, int i7) {
        this.f27477a = i7;
        this.f27478b = acVar;
    }

    @Override
    public final void run() {
        int i7 = this.f27477a;
        ac acVar = this.f27478b;
        switch (i7) {
            case 0:
                fc fcVar = acVar.h;
                ThreadLocal threadLocal = fc.I;
                fcVar.V(true);
                return;
            case 1:
                acVar.h.f23478u.remove(acVar.f22486a.f26637e);
                g0.h3(new xb(acVar, 3));
                return;
            case 2:
                fc fcVar2 = acVar.h;
                ThreadLocal threadLocal2 = fc.I;
                fcVar2.V(true);
                return;
            default:
                tb tbVar = acVar.f22486a;
                ns.f(tbVar.f26646o).k(143, tbVar.f26637e, 1);
                return;
        }
    }
}
