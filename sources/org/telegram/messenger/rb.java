package org.telegram.messenger;
public final class rb implements Runnable {
    public final int f25099a;
    public final ub f25100b;

    public rb(ub ubVar, int i3) {
        this.f25099a = i3;
        this.f25100b = ubVar;
    }

    @Override
    public final void run() {
        int i3 = this.f25099a;
        ub ubVar = this.f25100b;
        switch (i3) {
            case 0:
                zb zbVar = ubVar.h;
                ThreadLocal threadLocal = zb.I;
                zbVar.V(true);
                return;
            case 1:
                ubVar.h.f26775u.remove(ubVar.f25667a.f24343e);
                g0.h3(new rb(ubVar, 3));
                return;
            case 2:
                zb zbVar2 = ubVar.h;
                ThreadLocal threadLocal2 = zb.I;
                zbVar2.V(true);
                return;
            default:
                nb nbVar = ubVar.f25667a;
                hs.f(nbVar.f24352o).k(143, nbVar.f24343e, 1);
                return;
        }
    }
}
