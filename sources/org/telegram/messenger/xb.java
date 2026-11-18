package org.telegram.messenger;
public final class xb implements Runnable {
    public final int f27831a;
    public final zb f27832b;
    public final Boolean f27833c;

    public xb(zb zbVar, Boolean bool, int i7) {
        this.f27831a = i7;
        this.f27832b = zbVar;
        this.f27833c = bool;
    }

    @Override
    public final void run() {
        int i7 = this.f27831a;
        Boolean bool = this.f27833c;
        zb zbVar = this.f27832b;
        switch (i7) {
            case 0:
                zbVar.h.f23694u.remove(zbVar.f28276a.f26765e);
                g0.g3(new xb(zbVar, bool, 1));
                return;
            default:
                sb sbVar = zbVar.f28276a;
                if (bool.booleanValue()) {
                    ks.f(sbVar.f26774o).k(142, sbVar.f26765e, sbVar.f26775p);
                    return;
                } else {
                    ks.f(sbVar.f26774o).k(143, sbVar.f26765e, 2);
                    return;
                }
        }
    }
}
