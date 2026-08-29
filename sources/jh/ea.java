package jh;
public final class ea implements Runnable {
    public final long f12031a;
    public final int f12032b;
    public final int f12033c;
    public final boolean d;

    public ea(long j10, int i10, int i11, boolean z10) {
        this.f12031a = j10;
        this.f12032b = i10;
        this.f12033c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j10 = this.f12031a;
        int i10 = this.f12032b;
        int i11 = this.f12033c;
        if (j10 != 0) {
            b0.g(i10).p(i11, j10);
        } else {
            s7.y(i10, this.d).X(i11);
        }
    }
}
