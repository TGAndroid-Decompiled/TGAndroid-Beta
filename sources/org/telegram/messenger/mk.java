package org.telegram.messenger;
public final class mk implements Runnable {
    public final int f24215a;
    public final hp f24216b;
    public final long f24217c;
    public final long d;
    public final int f24218e;

    public mk(int i3, long j10, long j11, hp hpVar) {
        this.f24215a = 1;
        this.f24216b = hpVar;
        this.f24217c = j10;
        this.d = j11;
        this.f24218e = i3;
    }

    @Override
    public final void run() {
        switch (this.f24215a) {
            case 0:
                this.f24216b.z(this.f24217c, this.f24218e, this.d);
                return;
            case 1:
                long j10 = this.d;
                this.f24216b.p0(this.f24217c, this.f24218e, j10);
                return;
            default:
                this.f24216b.z(this.f24217c, this.f24218e, this.d);
                return;
        }
    }

    public mk(hp hpVar, int i3, long j10, long j11, int i10) {
        this.f24215a = i10;
        this.f24216b = hpVar;
        this.f24218e = i3;
        this.f24217c = j10;
        this.d = j11;
    }
}
