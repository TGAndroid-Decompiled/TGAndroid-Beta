package org.telegram.messenger;
public final class j5 implements gs {
    public final int f24792a;
    public final Object f24793b;

    public j5(Object obj, int i7) {
        this.f24792a = i7;
        this.f24793b = obj;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f24792a) {
            case 0:
                fi.y3 y3Var = (fi.y3) this.f24793b;
                if (i7 == 25) {
                    y3Var.d(false);
                    return;
                }
                return;
            default:
                rz rzVar = (rz) this.f24793b;
                if (i7 == 256) {
                    g0.g3(new yr(rzVar, 15));
                    return;
                }
                return;
        }
    }
}
