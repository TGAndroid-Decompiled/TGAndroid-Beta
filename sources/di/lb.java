package di;
public final class lb implements Runnable {
    public final long f9301a;
    public final int f9302b;
    public final int f9303c;
    public final boolean d;

    public lb(int i7, int i10, long j3, boolean z10) {
        this.f9301a = j3;
        this.f9302b = i7;
        this.f9303c = i10;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f9301a;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f9302b;
        int i11 = this.f9303c;
        if (i7 != 0) {
            e0.g(i10).p(i11, j3);
        } else {
            y8.y(i10, this.d).V(i11);
        }
    }
}
