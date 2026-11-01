package org.telegram.messenger;
public final class gk implements Runnable {
    public final int f15923a;
    public final wp f15924b;
    public final long f15925c;
    public final long d;
    public final int e;

    public gk(int i10, long j10, long j11, wp wpVar) {
        this.f15923a = 1;
        this.f15924b = wpVar;
        this.f15925c = j10;
        this.d = j11;
        this.e = i10;
    }

    @Override
    public final void run() {
        switch (this.f15923a) {
            case 0:
                this.f15924b.z(this.f15925c, this.e, this.d);
                return;
            case 1:
                long j10 = this.d;
                this.f15924b.p0(this.f15925c, this.e, j10);
                return;
            default:
                this.f15924b.z(this.f15925c, this.e, this.d);
                return;
        }
    }

    public gk(wp wpVar, int i10, long j10, long j11, int i11) {
        this.f15923a = i11;
        this.f15924b = wpVar;
        this.e = i10;
        this.f15925c = j10;
        this.d = j11;
    }
}
