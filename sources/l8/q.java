package l8;

import m8.m0;
public final class q implements Runnable {
    public final int f12133a;
    public final m0 f12134b;
    public final m f12135c;

    public q(m mVar, m0 m0Var, int i10) {
        this.f12133a = i10;
        this.f12135c = mVar;
        this.f12134b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f12133a) {
            case 0:
                this.f12135c.f12129c.onPeerConnected(this.f12134b);
                return;
            default:
                this.f12135c.f12129c.onPeerDisconnected(this.f12134b);
                return;
        }
    }
}
