package org.telegram.messenger;
public final class xb implements Runnable {
    public final int f27863a;
    public final ac f27864b;

    public xb(ac acVar, int i7) {
        this.f27863a = i7;
        this.f27864b = acVar;
    }

    @Override
    public final void run() {
        int i7 = this.f27863a;
        ac acVar = this.f27864b;
        switch (i7) {
            case 0:
                fc fcVar = acVar.h;
                ThreadLocal threadLocal = fc.I;
                fcVar.V(true);
                return;
            case 1:
                acVar.h.f23903u.remove(acVar.f22895a.f26993e);
                g0.g3(new xb(acVar, 3));
                return;
            case 2:
                fc fcVar2 = acVar.h;
                ThreadLocal threadLocal2 = fc.I;
                fcVar2.V(true);
                return;
            default:
                tb tbVar = acVar.f22895a;
                ls.f(tbVar.f27002o).k(143, tbVar.f26993e, 1);
                return;
        }
    }
}
