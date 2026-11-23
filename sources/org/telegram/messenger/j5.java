package org.telegram.messenger;
public final class j5 implements gs {
    public final int f24828a;
    public final Object f24829b;

    public j5(Object obj, int i7) {
        this.f24828a = i7;
        this.f24829b = obj;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f24828a) {
            case 0:
                fi.y3 y3Var = (fi.y3) this.f24829b;
                if (i7 == 25) {
                    y3Var.d(false);
                    return;
                }
                return;
            default:
                rz rzVar = (rz) this.f24829b;
                if (i7 == 256) {
                    g0.g3(new yr(rzVar, 15));
                    return;
                }
                return;
        }
    }
}
