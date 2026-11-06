package org.telegram.messenger;
public final class wk implements Runnable {
    public final int f26323a;
    public final qp f26324b;
    public final long f26325c;
    public final long d;
    public final int f26326e;

    public wk(int i7, long j3, long j10, qp qpVar) {
        this.f26323a = 1;
        this.f26324b = qpVar;
        this.f26325c = j3;
        this.d = j10;
        this.f26326e = i7;
    }

    @Override
    public final void run() {
        switch (this.f26323a) {
            case 0:
                this.f26324b.z(this.f26325c, this.f26326e, this.d);
                return;
            case 1:
                long j3 = this.d;
                this.f26324b.p0(this.f26325c, this.f26326e, j3);
                return;
            default:
                this.f26324b.z(this.f26325c, this.f26326e, this.d);
                return;
        }
    }

    public wk(qp qpVar, int i7, long j3, long j10, int i10) {
        this.f26323a = i10;
        this.f26324b = qpVar;
        this.f26326e = i7;
        this.f26325c = j3;
        this.d = j10;
    }
}
