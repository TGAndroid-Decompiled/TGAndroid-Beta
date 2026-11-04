package org.telegram.messenger;
public final class sb implements Runnable {
    public final int f25297a;
    public final ub f25298b;
    public final Boolean f25299c;

    public sb(ub ubVar, Boolean bool, int i3) {
        this.f25297a = i3;
        this.f25298b = ubVar;
        this.f25299c = bool;
    }

    @Override
    public final void run() {
        int i3 = this.f25297a;
        Boolean bool = this.f25299c;
        ub ubVar = this.f25298b;
        switch (i3) {
            case 0:
                ubVar.h.f26775u.remove(ubVar.f25667a.f24343e);
                g0.h3(new sb(ubVar, bool, 1));
                return;
            default:
                nb nbVar = ubVar.f25667a;
                if (bool.booleanValue()) {
                    hs.f(nbVar.f24352o).k(142, nbVar.f24343e, nbVar.f24353p);
                    return;
                } else {
                    hs.f(nbVar.f24352o).k(143, nbVar.f24343e, 2);
                    return;
                }
        }
    }
}
