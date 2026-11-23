package org.telegram.messenger;
public final class wb implements Runnable {
    public final int f27757a;
    public final zb f27758b;

    public wb(zb zbVar, int i7) {
        this.f27757a = i7;
        this.f27758b = zbVar;
    }

    @Override
    public final void run() {
        int i7 = this.f27757a;
        zb zbVar = this.f27758b;
        switch (i7) {
            case 0:
                ec ecVar = zbVar.h;
                ThreadLocal threadLocal = ec.I;
                ecVar.V(true);
                return;
            case 1:
                zbVar.h.f23799u.remove(zbVar.f28368a.f26866e);
                g0.g3(new wb(zbVar, 3));
                return;
            case 2:
                ec ecVar2 = zbVar.h;
                ThreadLocal threadLocal2 = ec.I;
                ecVar2.V(true);
                return;
            default:
                sb sbVar = zbVar.f28368a;
                ks.f(sbVar.f26875o).k(143, sbVar.f26866e, 1);
                return;
        }
    }
}
