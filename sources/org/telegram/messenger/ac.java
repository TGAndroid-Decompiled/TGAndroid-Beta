package org.telegram.messenger;
public final class ac implements Runnable {
    public final int f14598a;
    public final cc f14599b;
    public final Boolean f14600c;

    public ac(cc ccVar, Boolean bool, int i10) {
        this.f14598a = i10;
        this.f14599b = ccVar;
        this.f14600c = bool;
    }

    @Override
    public final void run() {
        int i10 = this.f14598a;
        Boolean bool = this.f14600c;
        cc ccVar = this.f14599b;
        switch (i10) {
            case 0:
                ccVar.h.f15870u.remove(ccVar.f14974a.e);
                i0.g3(new ac(ccVar, bool, 1));
                return;
            default:
                vb vbVar = ccVar.f14974a;
                if (bool.booleanValue()) {
                    zs.f(vbVar.f18498o).k(142, vbVar.e, vbVar.f18499p);
                    return;
                } else {
                    zs.f(vbVar.f18498o).k(143, vbVar.e, 2);
                    return;
                }
        }
    }
}
