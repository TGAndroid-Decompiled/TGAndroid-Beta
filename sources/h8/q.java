package h8;

import i8.n0;
public final class q implements Runnable {
    public final int f10253a;
    public final n0 f10254b;
    public final m f10255c;

    public q(m mVar, n0 n0Var, int i9) {
        this.f10253a = i9;
        this.f10255c = mVar;
        this.f10254b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f10253a) {
            case 0:
                this.f10255c.f10249c.onPeerConnected(this.f10254b);
                return;
            default:
                this.f10255c.f10249c.onPeerDisconnected(this.f10254b);
                return;
        }
    }
}
