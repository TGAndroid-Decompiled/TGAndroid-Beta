package hh;

public final class ka implements Runnable {

    public final long f9625a;

    public final int f9626b;

    public final int f9627c;
    public final boolean d;

    public ka(long j10, int i10, int i11, boolean z10) {
        this.f9625a = j10;
        this.f9626b = i10;
        this.f9627c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j10 = this.f9625a;
        int i10 = this.f9626b;
        int i11 = this.f9627c;
        if (j10 != 0) {
            c0.g(i10).p(i11, j10);
        } else {
            u7.y(i10, this.d).X(i11);
        }
    }
}
