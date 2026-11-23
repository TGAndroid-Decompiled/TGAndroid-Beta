package org.telegram.messenger;
public final class uj implements Runnable {
    public final int f27285a;
    public final mp f27286b;
    public final int f27287c;
    public final long d;
    public final long f27288e;

    public uj(int i7, long j3, long j10, mp mpVar) {
        this.f27285a = 2;
        this.f27286b = mpVar;
        this.d = j3;
        this.f27288e = j10;
        this.f27287c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27285a) {
            case 0:
                this.f27286b.z(this.d, this.f27287c, this.f27288e);
                return;
            case 1:
                this.f27286b.z(this.d, this.f27287c, this.f27288e);
                return;
            default:
                long j3 = this.f27288e;
                this.f27286b.q0(this.d, this.f27287c, j3);
                return;
        }
    }

    public uj(mp mpVar, int i7, long j3, long j10, int i10) {
        this.f27285a = i10;
        this.f27286b = mpVar;
        this.f27287c = i7;
        this.d = j3;
        this.f27288e = j10;
    }
}
