package org.telegram.messenger;
public final class xb implements Runnable {
    public final int f27827a;
    public final ac f27828b;

    public xb(ac acVar, int i7) {
        this.f27827a = i7;
        this.f27828b = acVar;
    }

    @Override
    public final void run() {
        int i7 = this.f27827a;
        ac acVar = this.f27828b;
        switch (i7) {
            case 0:
                fc fcVar = acVar.h;
                ThreadLocal threadLocal = fc.I;
                fcVar.V(true);
                return;
            case 1:
                acVar.h.f23867u.remove(acVar.f22859a.f26957e);
                g0.g3(new xb(acVar, 3));
                return;
            case 2:
                fc fcVar2 = acVar.h;
                ThreadLocal threadLocal2 = fc.I;
                fcVar2.V(true);
                return;
            default:
                tb tbVar = acVar.f22859a;
                ls.f(tbVar.f26966o).k(143, tbVar.f26957e, 1);
                return;
        }
    }
}
