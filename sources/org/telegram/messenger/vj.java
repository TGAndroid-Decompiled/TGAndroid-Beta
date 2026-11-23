package org.telegram.messenger;
public final class vj implements Runnable {
    public final int f27429a;
    public final np f27430b;
    public final int f27431c;
    public final long d;
    public final long f27432e;

    public vj(int i7, long j3, long j10, np npVar) {
        this.f27429a = 2;
        this.f27430b = npVar;
        this.d = j3;
        this.f27432e = j10;
        this.f27431c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27429a) {
            case 0:
                this.f27430b.z(this.d, this.f27431c, this.f27432e);
                return;
            case 1:
                this.f27430b.z(this.d, this.f27431c, this.f27432e);
                return;
            default:
                long j3 = this.f27432e;
                this.f27430b.q0(this.d, this.f27431c, j3);
                return;
        }
    }

    public vj(np npVar, int i7, long j3, long j10, int i10) {
        this.f27429a = i10;
        this.f27430b = npVar;
        this.f27431c = i7;
        this.d = j3;
        this.f27432e = j10;
    }
}
