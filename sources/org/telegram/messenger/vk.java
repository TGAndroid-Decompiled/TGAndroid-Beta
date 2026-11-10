package org.telegram.messenger;
public final class vk implements Runnable {
    public final int f26051a;
    public final qp f26052b;
    public final long f26053c;
    public final long d;
    public final int f26054e;

    public vk(int i7, long j3, long j10, qp qpVar) {
        this.f26051a = 1;
        this.f26052b = qpVar;
        this.f26053c = j3;
        this.d = j10;
        this.f26054e = i7;
    }

    @Override
    public final void run() {
        switch (this.f26051a) {
            case 0:
                this.f26052b.z(this.f26053c, this.f26054e, this.d);
                return;
            case 1:
                long j3 = this.d;
                this.f26052b.p0(this.f26053c, this.f26054e, j3);
                return;
            default:
                this.f26052b.z(this.f26053c, this.f26054e, this.d);
                return;
        }
    }

    public vk(qp qpVar, int i7, long j3, long j10, int i10) {
        this.f26051a = i10;
        this.f26052b = qpVar;
        this.f26054e = i7;
        this.f26053c = j3;
        this.d = j10;
    }
}
