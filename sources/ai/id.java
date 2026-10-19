package ai;
public final class id implements Runnable {
    public final long f1504a;
    public final int f1505b;
    public final int f1506c;
    public final boolean d;

    public id(long j10, int i10, int i11, boolean z10) {
        this.f1504a = j10;
        this.f1505b = i10;
        this.f1506c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j10 = this.f1504a;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f1505b;
        int i12 = this.f1506c;
        if (i10 != 0) {
            k0.g(i11).p(i12, j10);
        } else {
            ga.y(i11, this.d).X(i12);
        }
    }
}
