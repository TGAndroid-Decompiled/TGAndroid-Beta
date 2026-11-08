package org.telegram.messenger;
public final class vk implements Runnable {
    public final int f26047a;
    public final qp f26048b;
    public final long f26049c;
    public final long d;
    public final int f26050e;

    public vk(int i7, long j3, long j10, qp qpVar) {
        this.f26047a = 1;
        this.f26048b = qpVar;
        this.f26049c = j3;
        this.d = j10;
        this.f26050e = i7;
    }

    @Override
    public final void run() {
        switch (this.f26047a) {
            case 0:
                this.f26048b.z(this.f26049c, this.f26050e, this.d);
                return;
            case 1:
                long j3 = this.d;
                this.f26048b.p0(this.f26049c, this.f26050e, j3);
                return;
            default:
                this.f26048b.z(this.f26049c, this.f26050e, this.d);
                return;
        }
    }

    public vk(qp qpVar, int i7, long j3, long j10, int i10) {
        this.f26047a = i10;
        this.f26048b = qpVar;
        this.f26050e = i7;
        this.f26049c = j3;
        this.d = j10;
    }
}
