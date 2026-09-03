package l8;

import m8.m0;
public final class q implements Runnable {
    public final int f11836a;
    public final m0 f11837b;
    public final m f11838c;

    public q(m mVar, m0 m0Var, int i10) {
        this.f11836a = i10;
        this.f11838c = mVar;
        this.f11837b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f11836a) {
            case 0:
                this.f11838c.f11832c.onPeerConnected(this.f11837b);
                return;
            default:
                this.f11838c.f11832c.onPeerDisconnected(this.f11837b);
                return;
        }
    }
}
