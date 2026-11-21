package org.telegram.messenger;
public final class wb implements Runnable {
    public final int f27691a;
    public final zb f27692b;

    public wb(zb zbVar, int i7) {
        this.f27691a = i7;
        this.f27692b = zbVar;
    }

    @Override
    public final void run() {
        int i7 = this.f27691a;
        zb zbVar = this.f27692b;
        switch (i7) {
            case 0:
                ec ecVar = zbVar.h;
                ThreadLocal threadLocal = ec.I;
                ecVar.V(true);
                return;
            case 1:
                zbVar.h.f23722u.remove(zbVar.f28304a.f26793e);
                g0.g3(new wb(zbVar, 3));
                return;
            case 2:
                ec ecVar2 = zbVar.h;
                ThreadLocal threadLocal2 = ec.I;
                ecVar2.V(true);
                return;
            default:
                sb sbVar = zbVar.f28304a;
                ks.f(sbVar.f26802o).k(143, sbVar.f26793e, 1);
                return;
        }
    }
}
