package org.telegram.messenger;
public final class wb implements Runnable {
    public final int f27665a;
    public final zb f27666b;

    public wb(zb zbVar, int i7) {
        this.f27665a = i7;
        this.f27666b = zbVar;
    }

    @Override
    public final void run() {
        int i7 = this.f27665a;
        zb zbVar = this.f27666b;
        switch (i7) {
            case 0:
                ec ecVar = zbVar.h;
                ThreadLocal threadLocal = ec.I;
                ecVar.V(true);
                return;
            case 1:
                zbVar.h.f23697u.remove(zbVar.f28278a.f26767e);
                g0.g3(new wb(zbVar, 3));
                return;
            case 2:
                ec ecVar2 = zbVar.h;
                ThreadLocal threadLocal2 = ec.I;
                ecVar2.V(true);
                return;
            default:
                sb sbVar = zbVar.f28278a;
                ks.f(sbVar.f26776o).k(143, sbVar.f26767e, 1);
                return;
        }
    }
}
