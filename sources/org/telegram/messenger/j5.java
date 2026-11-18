package org.telegram.messenger;
public final class j5 implements fs {
    public final int f24808a;
    public final Object f24809b;

    public j5(Object obj, int i7) {
        this.f24808a = i7;
        this.f24809b = obj;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f24808a) {
            case 0:
                fi.y3 y3Var = (fi.y3) this.f24809b;
                if (i7 == 25) {
                    y3Var.d(false);
                    return;
                }
                return;
            default:
                qz qzVar = (qz) this.f24809b;
                if (i7 == 256) {
                    g0.g3(new xr(qzVar, 15));
                    return;
                }
                return;
        }
    }
}
