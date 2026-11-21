package org.telegram.messenger;
public final class xb implements Runnable {
    public final int f27859a;
    public final zb f27860b;
    public final Boolean f27861c;

    public xb(zb zbVar, Boolean bool, int i7) {
        this.f27859a = i7;
        this.f27860b = zbVar;
        this.f27861c = bool;
    }

    @Override
    public final void run() {
        int i7 = this.f27859a;
        Boolean bool = this.f27861c;
        zb zbVar = this.f27860b;
        switch (i7) {
            case 0:
                zbVar.h.f23722u.remove(zbVar.f28304a.f26793e);
                g0.g3(new xb(zbVar, bool, 1));
                return;
            default:
                sb sbVar = zbVar.f28304a;
                if (bool.booleanValue()) {
                    ks.f(sbVar.f26802o).k(142, sbVar.f26793e, sbVar.f26803p);
                    return;
                } else {
                    ks.f(sbVar.f26802o).k(143, sbVar.f26793e, 2);
                    return;
                }
        }
    }
}
