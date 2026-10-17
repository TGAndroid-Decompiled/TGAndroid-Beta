package ai;
public final class hd implements Runnable {
    public final long f1449a;
    public final int f1450b;
    public final int f1451c;
    public final boolean d;

    public hd(long j10, int i10, int i11, boolean z10) {
        this.f1449a = j10;
        this.f1450b = i10;
        this.f1451c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j10 = this.f1449a;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f1450b;
        int i12 = this.f1451c;
        if (i10 != 0) {
            k0.g(i11).p(i12, j10);
        } else {
            fa.y(i11, this.d).X(i12);
        }
    }
}
