package di;
public final class lb implements Runnable {
    public final long f9274a;
    public final int f9275b;
    public final int f9276c;
    public final boolean d;

    public lb(int i7, int i10, long j3, boolean z10) {
        this.f9274a = j3;
        this.f9275b = i7;
        this.f9276c = i10;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f9274a;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f9275b;
        int i11 = this.f9276c;
        if (i7 != 0) {
            e0.g(i10).p(i11, j3);
        } else {
            x8.y(i10, this.d).V(i11);
        }
    }
}
