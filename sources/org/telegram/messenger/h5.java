package org.telegram.messenger;
public final class h5 implements is {
    public final int f24055a;
    public final Object f24056b;

    public h5(Object obj, int i7) {
        this.f24055a = i7;
        this.f24056b = obj;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f24055a) {
            case 0:
                fi.a4 a4Var = (fi.a4) this.f24056b;
                if (i7 == 25) {
                    a4Var.d(false);
                    return;
                }
                return;
            default:
                uz uzVar = (uz) this.f24056b;
                if (i7 == 253) {
                    g0.h3(new as(uzVar, 15));
                    return;
                }
                return;
        }
    }
}
