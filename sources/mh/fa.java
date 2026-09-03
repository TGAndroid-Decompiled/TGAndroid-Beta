package mh;
public final class fa implements Runnable {
    public final long f14057a;
    public final int f14058b;
    public final int f14059c;
    public final boolean d;

    public fa(long j10, int i10, int i11, boolean z4) {
        this.f14057a = j10;
        this.f14058b = i10;
        this.f14059c = i11;
        this.d = z4;
    }

    @Override
    public final void run() {
        long j10 = this.f14057a;
        int i10 = this.f14058b;
        int i11 = this.f14059c;
        if (j10 != 0) {
            a0.g(i10).p(i11, j10);
        } else {
            t7.y(i10, this.d).X(i11);
        }
    }
}
