package org.telegram.messenger;
public final class xb implements Runnable {
    public final int f27833a;
    public final zb f27834b;
    public final Boolean f27835c;

    public xb(zb zbVar, Boolean bool, int i7) {
        this.f27833a = i7;
        this.f27834b = zbVar;
        this.f27835c = bool;
    }

    @Override
    public final void run() {
        int i7 = this.f27833a;
        Boolean bool = this.f27835c;
        zb zbVar = this.f27834b;
        switch (i7) {
            case 0:
                zbVar.h.f23697u.remove(zbVar.f28278a.f26767e);
                g0.g3(new xb(zbVar, bool, 1));
                return;
            default:
                sb sbVar = zbVar.f28278a;
                if (bool.booleanValue()) {
                    ks.f(sbVar.f26776o).k(142, sbVar.f26767e, sbVar.f26777p);
                    return;
                } else {
                    ks.f(sbVar.f26776o).k(143, sbVar.f26767e, 2);
                    return;
                }
        }
    }
}
