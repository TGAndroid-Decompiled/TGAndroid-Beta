package di;
public final class lb implements Runnable {
    public final long f9271a;
    public final int f9272b;
    public final int f9273c;
    public final boolean d;

    public lb(int i7, int i10, long j3, boolean z10) {
        this.f9271a = j3;
        this.f9272b = i7;
        this.f9273c = i10;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f9271a;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f9272b;
        int i11 = this.f9273c;
        if (i7 != 0) {
            e0.g(i10).p(i11, j3);
        } else {
            x8.y(i10, this.d).V(i11);
        }
    }
}
