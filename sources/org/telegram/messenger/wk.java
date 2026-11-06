package org.telegram.messenger;
public final class wk implements Runnable {
    public final int f26315a;
    public final qp f26316b;
    public final long f26317c;
    public final long d;
    public final int f26318e;

    public wk(int i7, long j3, long j10, qp qpVar) {
        this.f26315a = 1;
        this.f26316b = qpVar;
        this.f26317c = j3;
        this.d = j10;
        this.f26318e = i7;
    }

    @Override
    public final void run() {
        switch (this.f26315a) {
            case 0:
                this.f26316b.z(this.f26317c, this.f26318e, this.d);
                return;
            case 1:
                long j3 = this.d;
                this.f26316b.p0(this.f26317c, this.f26318e, j3);
                return;
            default:
                this.f26316b.z(this.f26317c, this.f26318e, this.d);
                return;
        }
    }

    public wk(qp qpVar, int i7, long j3, long j10, int i10) {
        this.f26315a = i10;
        this.f26316b = qpVar;
        this.f26318e = i7;
        this.f26317c = j3;
        this.d = j10;
    }
}
