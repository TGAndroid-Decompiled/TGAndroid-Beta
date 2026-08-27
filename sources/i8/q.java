package i8;

import j8.m0;

public final class q implements Runnable {

    public final int f10962a;

    public final m0 f10963b;

    public final m f10964c;

    public q(m mVar, m0 m0Var, int i10) {
        this.f10962a = i10;
        this.f10964c = mVar;
        this.f10963b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f10962a) {
            case 0:
                this.f10964c.f10958c.onPeerConnected(this.f10963b);
                break;
            default:
                this.f10964c.f10958c.onPeerDisconnected(this.f10963b);
                break;
        }
    }
}
