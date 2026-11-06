package org.telegram.messenger;
public final class h5 implements ls {
    public final int f22829a;
    public final Object f22830b;

    public h5(Object obj, int i7) {
        this.f22829a = i7;
        this.f22830b = obj;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f22829a) {
            case 0:
                di.h4 h4Var = (di.h4) this.f22830b;
                if (i7 == 25) {
                    h4Var.d(false);
                    return;
                }
                return;
            default:
                wz wzVar = (wz) this.f22830b;
                if (i7 == 253) {
                    g0.h3(new ds(wzVar, 15));
                    return;
                }
                return;
        }
    }
}
