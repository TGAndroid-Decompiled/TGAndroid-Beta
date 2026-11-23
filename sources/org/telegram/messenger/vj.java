package org.telegram.messenger;
public final class vj implements Runnable {
    public final int f27393a;
    public final np f27394b;
    public final int f27395c;
    public final long d;
    public final long f27396e;

    public vj(int i7, long j3, long j10, np npVar) {
        this.f27393a = 2;
        this.f27394b = npVar;
        this.d = j3;
        this.f27396e = j10;
        this.f27395c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27393a) {
            case 0:
                this.f27394b.z(this.d, this.f27395c, this.f27396e);
                return;
            case 1:
                this.f27394b.z(this.d, this.f27395c, this.f27396e);
                return;
            default:
                long j3 = this.f27396e;
                this.f27394b.q0(this.d, this.f27395c, j3);
                return;
        }
    }

    public vj(np npVar, int i7, long j3, long j10, int i10) {
        this.f27393a = i10;
        this.f27394b = npVar;
        this.f27395c = i7;
        this.d = j3;
        this.f27396e = j10;
    }
}
