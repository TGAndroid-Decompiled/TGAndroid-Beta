package ai;
public final class id implements Runnable {
    public final long f1507a;
    public final int f1508b;
    public final int f1509c;
    public final boolean d;

    public id(long j10, int i10, int i11, boolean z10) {
        this.f1507a = j10;
        this.f1508b = i10;
        this.f1509c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j10 = this.f1507a;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f1508b;
        int i12 = this.f1509c;
        if (i10 != 0) {
            k0.g(i11).p(i12, j10);
        } else {
            ga.y(i11, this.d).X(i12);
        }
    }
}
