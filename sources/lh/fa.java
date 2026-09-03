package lh;
public final class fa implements Runnable {
    public final long f12426a;
    public final int f12427b;
    public final int f12428c;
    public final boolean d;

    public fa(long j10, int i10, int i11, boolean z4) {
        this.f12426a = j10;
        this.f12427b = i10;
        this.f12428c = i11;
        this.d = z4;
    }

    @Override
    public final void run() {
        long j10 = this.f12426a;
        int i10 = this.f12427b;
        int i11 = this.f12428c;
        if (j10 != 0) {
            b0.g(i10).p(i11, j10);
        } else {
            t7.y(i10, this.d).X(i11);
        }
    }
}
