package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f26695a;
    public final np f26696b;
    public final long f26697c;
    public final long d;
    public final int f26698e;

    public tk(int i7, long j3, long j10, np npVar) {
        this.f26695a = 1;
        this.f26696b = npVar;
        this.f26697c = j3;
        this.d = j10;
        this.f26698e = i7;
    }

    @Override
    public final void run() {
        switch (this.f26695a) {
            case 0:
                this.f26696b.z(this.f26697c, this.f26698e, this.d);
                return;
            case 1:
                long j3 = this.d;
                this.f26696b.p0(this.f26697c, this.f26698e, j3);
                return;
            default:
                this.f26696b.z(this.f26697c, this.f26698e, this.d);
                return;
        }
    }

    public tk(np npVar, int i7, long j3, long j10, int i10) {
        this.f26695a = i10;
        this.f26696b = npVar;
        this.f26698e = i7;
        this.f26697c = j3;
        this.d = j10;
    }
}
