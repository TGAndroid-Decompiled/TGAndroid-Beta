package di;
public final class lb implements Runnable {
    public final long f9265a;
    public final int f9266b;
    public final int f9267c;
    public final boolean d;

    public lb(int i7, int i10, long j3, boolean z10) {
        this.f9265a = j3;
        this.f9266b = i7;
        this.f9267c = i10;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f9265a;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f9266b;
        int i11 = this.f9267c;
        if (i7 != 0) {
            e0.g(i10).p(i11, j3);
        } else {
            y8.y(i10, this.d).V(i11);
        }
    }
}
