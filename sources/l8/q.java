package l8;

import m8.m0;
public final class q implements Runnable {
    public final int f11726a;
    public final m0 f11727b;
    public final m f11728c;

    public q(m mVar, m0 m0Var, int i10) {
        this.f11726a = i10;
        this.f11728c = mVar;
        this.f11727b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f11726a) {
            case 0:
                this.f11728c.f11722c.onPeerConnected(this.f11727b);
                return;
            default:
                this.f11728c.f11722c.onPeerDisconnected(this.f11727b);
                return;
        }
    }
}
