package org.telegram.messenger;
public final class uj implements Runnable {
    public final int f27209a;
    public final mp f27210b;
    public final int f27211c;
    public final long d;
    public final long f27212e;

    public uj(int i7, long j3, long j10, mp mpVar) {
        this.f27209a = 2;
        this.f27210b = mpVar;
        this.d = j3;
        this.f27212e = j10;
        this.f27211c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27209a) {
            case 0:
                this.f27210b.z(this.d, this.f27211c, this.f27212e);
                return;
            case 1:
                this.f27210b.z(this.d, this.f27211c, this.f27212e);
                return;
            default:
                long j3 = this.f27212e;
                this.f27210b.q0(this.d, this.f27211c, j3);
                return;
        }
    }

    public uj(mp mpVar, int i7, long j3, long j10, int i10) {
        this.f27209a = i10;
        this.f27210b = mpVar;
        this.f27211c = i7;
        this.d = j3;
        this.f27212e = j10;
    }
}
