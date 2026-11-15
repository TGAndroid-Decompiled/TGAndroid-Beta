package org.telegram.messenger;
public final class h5 implements is {
    public final int f24058a;
    public final Object f24059b;

    public h5(Object obj, int i7) {
        this.f24058a = i7;
        this.f24059b = obj;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f24058a) {
            case 0:
                fi.a4 a4Var = (fi.a4) this.f24059b;
                if (i7 == 25) {
                    a4Var.d(false);
                    return;
                }
                return;
            default:
                uz uzVar = (uz) this.f24059b;
                if (i7 == 253) {
                    g0.h3(new as(uzVar, 15));
                    return;
                }
                return;
        }
    }
}
