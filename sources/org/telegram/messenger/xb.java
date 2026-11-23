package org.telegram.messenger;
public final class xb implements Runnable {
    public final int f27947a;
    public final zb f27948b;
    public final Boolean f27949c;

    public xb(zb zbVar, Boolean bool, int i7) {
        this.f27947a = i7;
        this.f27948b = zbVar;
        this.f27949c = bool;
    }

    @Override
    public final void run() {
        int i7 = this.f27947a;
        Boolean bool = this.f27949c;
        zb zbVar = this.f27948b;
        switch (i7) {
            case 0:
                zbVar.h.f23799u.remove(zbVar.f28368a.f26866e);
                g0.g3(new xb(zbVar, bool, 1));
                return;
            default:
                sb sbVar = zbVar.f28368a;
                if (bool.booleanValue()) {
                    ks.f(sbVar.f26875o).k(142, sbVar.f26866e, sbVar.f26876p);
                    return;
                } else {
                    ks.f(sbVar.f26875o).k(143, sbVar.f26866e, 2);
                    return;
                }
        }
    }
}
