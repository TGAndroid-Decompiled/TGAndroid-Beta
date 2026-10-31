package org.telegram.messenger;
public final class fk implements Runnable {
    public final int f15582a;
    public final vp f15583b;
    public final long f15584c;
    public final long d;
    public final int e;

    public fk(int i10, long j10, long j11, vp vpVar) {
        this.f15582a = 1;
        this.f15583b = vpVar;
        this.f15584c = j10;
        this.d = j11;
        this.e = i10;
    }

    @Override
    public final void run() {
        switch (this.f15582a) {
            case 0:
                this.f15583b.z(this.f15584c, this.e, this.d);
                return;
            case 1:
                long j10 = this.d;
                this.f15583b.p0(this.f15584c, this.e, j10);
                return;
            default:
                this.f15583b.z(this.f15584c, this.e, this.d);
                return;
        }
    }

    public fk(vp vpVar, int i10, long j10, long j11, int i11) {
        this.f15582a = i11;
        this.f15583b = vpVar;
        this.e = i10;
        this.f15584c = j10;
        this.d = j11;
    }
}
