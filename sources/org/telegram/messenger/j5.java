package org.telegram.messenger;
public final class j5 implements fs {
    public final int f24811a;
    public final Object f24812b;

    public j5(Object obj, int i7) {
        this.f24811a = i7;
        this.f24812b = obj;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f24811a) {
            case 0:
                fi.y3 y3Var = (fi.y3) this.f24812b;
                if (i7 == 25) {
                    y3Var.d(false);
                    return;
                }
                return;
            default:
                qz qzVar = (qz) this.f24812b;
                if (i7 == 255) {
                    g0.g3(new xr(qzVar, 15));
                    return;
                }
                return;
        }
    }
}
