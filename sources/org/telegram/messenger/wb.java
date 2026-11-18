package org.telegram.messenger;
public final class wb implements Runnable {
    public final int f27663a;
    public final zb f27664b;

    public wb(zb zbVar, int i7) {
        this.f27663a = i7;
        this.f27664b = zbVar;
    }

    @Override
    public final void run() {
        int i7 = this.f27663a;
        zb zbVar = this.f27664b;
        switch (i7) {
            case 0:
                ec ecVar = zbVar.h;
                ThreadLocal threadLocal = ec.I;
                ecVar.V(true);
                return;
            case 1:
                zbVar.h.f23694u.remove(zbVar.f28276a.f26765e);
                g0.g3(new wb(zbVar, 3));
                return;
            case 2:
                ec ecVar2 = zbVar.h;
                ThreadLocal threadLocal2 = ec.I;
                ecVar2.V(true);
                return;
            default:
                sb sbVar = zbVar.f28276a;
                ks.f(sbVar.f26774o).k(143, sbVar.f26765e, 1);
                return;
        }
    }
}
