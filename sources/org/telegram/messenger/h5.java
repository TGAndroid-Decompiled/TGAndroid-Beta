package org.telegram.messenger;
public final class h5 implements ls {
    public final int f22842a;
    public final Object f22843b;

    public h5(Object obj, int i7) {
        this.f22842a = i7;
        this.f22843b = obj;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f22842a) {
            case 0:
                di.i4 i4Var = (di.i4) this.f22843b;
                if (i7 == 25) {
                    i4Var.d(false);
                    return;
                }
                return;
            default:
                wz wzVar = (wz) this.f22843b;
                if (i7 == 253) {
                    g0.h3(new ds(wzVar, 15));
                    return;
                }
                return;
        }
    }
}
