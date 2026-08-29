package j8;

import k8.n0;
public final class q implements Runnable {
    public final int f11289a;
    public final n0 f11290b;
    public final m f11291c;

    public q(m mVar, n0 n0Var, int i10) {
        this.f11289a = i10;
        this.f11291c = mVar;
        this.f11290b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f11289a) {
            case 0:
                this.f11291c.f11285c.onPeerConnected(this.f11290b);
                return;
            default:
                this.f11291c.f11285c.onPeerDisconnected(this.f11290b);
                return;
        }
    }
}
