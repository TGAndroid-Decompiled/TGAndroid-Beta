package mh;
public final class fa implements Runnable {
    public final long f14055a;
    public final int f14056b;
    public final int f14057c;
    public final boolean d;

    public fa(long j10, int i10, int i11, boolean z4) {
        this.f14055a = j10;
        this.f14056b = i10;
        this.f14057c = i11;
        this.d = z4;
    }

    @Override
    public final void run() {
        long j10 = this.f14055a;
        int i10 = this.f14056b;
        int i11 = this.f14057c;
        if (j10 != 0) {
            a0.g(i10).p(i11, j10);
        } else {
            t7.y(i10, this.d).X(i11);
        }
    }
}
