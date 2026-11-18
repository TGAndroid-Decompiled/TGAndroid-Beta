package org.telegram.messenger;
public final class uj implements Runnable {
    public final int f27181a;
    public final mp f27182b;
    public final int f27183c;
    public final long d;
    public final long f27184e;

    public uj(int i7, long j3, long j10, mp mpVar) {
        this.f27181a = 2;
        this.f27182b = mpVar;
        this.d = j3;
        this.f27184e = j10;
        this.f27183c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27181a) {
            case 0:
                this.f27182b.z(this.d, this.f27183c, this.f27184e);
                return;
            case 1:
                this.f27182b.z(this.d, this.f27183c, this.f27184e);
                return;
            default:
                long j3 = this.f27184e;
                this.f27182b.q0(this.d, this.f27183c, j3);
                return;
        }
    }

    public uj(mp mpVar, int i7, long j3, long j10, int i10) {
        this.f27181a = i10;
        this.f27182b = mpVar;
        this.f27183c = i7;
        this.d = j3;
        this.f27184e = j10;
    }
}
