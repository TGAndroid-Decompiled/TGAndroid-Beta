package di;
public final class ib implements Runnable {
    public final long f8817a;
    public final int f8818b;
    public final int f8819c;
    public final boolean d;

    public ib(int i7, int i10, long j3, boolean z10) {
        this.f8817a = j3;
        this.f8818b = i7;
        this.f8819c = i10;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f8817a;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f8818b;
        int i11 = this.f8819c;
        if (i7 != 0) {
            e0.g(i10).p(i11, j3);
        } else {
            v8.y(i10, this.d).W(i11);
        }
    }
}
