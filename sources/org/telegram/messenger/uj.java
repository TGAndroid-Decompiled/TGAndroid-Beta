package org.telegram.messenger;
public final class uj implements Runnable {
    public final int f27183a;
    public final mp f27184b;
    public final int f27185c;
    public final long d;
    public final long f27186e;

    public uj(int i7, long j3, long j10, mp mpVar) {
        this.f27183a = 2;
        this.f27184b = mpVar;
        this.d = j3;
        this.f27186e = j10;
        this.f27185c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27183a) {
            case 0:
                this.f27184b.z(this.d, this.f27185c, this.f27186e);
                return;
            case 1:
                this.f27184b.z(this.d, this.f27185c, this.f27186e);
                return;
            default:
                long j3 = this.f27186e;
                this.f27184b.q0(this.d, this.f27185c, j3);
                return;
        }
    }

    public uj(mp mpVar, int i7, long j3, long j10, int i10) {
        this.f27183a = i10;
        this.f27184b = mpVar;
        this.f27185c = i7;
        this.d = j3;
        this.f27186e = j10;
    }
}
