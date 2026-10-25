package bi;
public final class zc implements Runnable {
    public final long f5865a;
    public final int f5866b;
    public final int f5867c;
    public final boolean d;

    public zc(long j10, int i10, int i11, boolean z10) {
        this.f5865a = j10;
        this.f5866b = i10;
        this.f5867c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j10 = this.f5865a;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f5866b;
        int i12 = this.f5867c;
        if (i10 != 0) {
            m0.g(i11).p(i12, j10);
        } else {
            ca.y(i11, this.d).X(i12);
        }
    }
}
