package bi;
public final class zc implements Runnable {
    public final long f5193a;
    public final int f5194b;
    public final int f5195c;
    public final boolean d;

    public zc(int i7, int i10, long j3, boolean z9) {
        this.f5193a = j3;
        this.f5194b = i7;
        this.f5195c = i10;
        this.d = z9;
    }

    @Override
    public final void run() {
        long j3 = this.f5193a;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f5194b;
        int i11 = this.f5195c;
        if (i7 != 0) {
            n0.g(i10).p(i11, j3);
        } else {
            ea.y(i10, this.d).W(i11);
        }
    }
}
