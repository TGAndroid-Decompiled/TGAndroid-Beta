package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f26686a;
    public final np f26687b;
    public final long f26688c;
    public final long d;
    public final int f26689e;

    public tk(int i7, long j3, long j10, np npVar) {
        this.f26686a = 1;
        this.f26687b = npVar;
        this.f26688c = j3;
        this.d = j10;
        this.f26689e = i7;
    }

    @Override
    public final void run() {
        switch (this.f26686a) {
            case 0:
                this.f26687b.z(this.f26688c, this.f26689e, this.d);
                return;
            case 1:
                long j3 = this.d;
                this.f26687b.p0(this.f26688c, this.f26689e, j3);
                return;
            default:
                this.f26687b.z(this.f26688c, this.f26689e, this.d);
                return;
        }
    }

    public tk(np npVar, int i7, long j3, long j10, int i10) {
        this.f26686a = i10;
        this.f26687b = npVar;
        this.f26689e = i7;
        this.f26688c = j3;
        this.d = j10;
    }
}
