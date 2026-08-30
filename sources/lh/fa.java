package lh;
public final class fa implements Runnable {
    public final long f12442a;
    public final int f12443b;
    public final int f12444c;
    public final boolean d;

    public fa(long j10, int i10, int i11, boolean z4) {
        this.f12442a = j10;
        this.f12443b = i10;
        this.f12444c = i11;
        this.d = z4;
    }

    @Override
    public final void run() {
        long j10 = this.f12442a;
        int i10 = this.f12443b;
        int i11 = this.f12444c;
        if (j10 != 0) {
            b0.g(i10).p(i11, j10);
        } else {
            t7.y(i10, this.d).X(i11);
        }
    }
}
