package org.telegram.messenger;
public final class h5 implements ls {
    public final int f22846a;
    public final Object f22847b;

    public h5(Object obj, int i7) {
        this.f22846a = i7;
        this.f22847b = obj;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f22846a) {
            case 0:
                di.i4 i4Var = (di.i4) this.f22847b;
                if (i7 == 25) {
                    i4Var.d(false);
                    return;
                }
                return;
            default:
                wz wzVar = (wz) this.f22847b;
                if (i7 == 253) {
                    g0.h3(new ds(wzVar, 15));
                    return;
                }
                return;
        }
    }
}
