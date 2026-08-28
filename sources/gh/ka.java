package gh;
public final class ka implements Runnable {
    public final long f8448a;
    public final int f8449b;
    public final int f8450c;
    public final boolean d;

    public ka(long j10, int i9, int i10, boolean z10) {
        this.f8448a = j10;
        this.f8449b = i9;
        this.f8450c = i10;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j10 = this.f8448a;
        int i9 = this.f8449b;
        int i10 = this.f8450c;
        if (j10 != 0) {
            c0.g(i9).p(i10, j10);
        } else {
            v7.y(i9, this.d).X(i10);
        }
    }
}
