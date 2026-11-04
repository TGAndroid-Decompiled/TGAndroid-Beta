package ci;
public final class sb implements Runnable {
    public final long f5980a;
    public final int f5981b;
    public final int f5982c;
    public final boolean d;

    public sb(int i3, int i10, long j10, boolean z10) {
        this.f5980a = j10;
        this.f5981b = i3;
        this.f5982c = i10;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j10 = this.f5980a;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i10 = this.f5981b;
        int i11 = this.f5982c;
        if (i3 != 0) {
            i0.g(i10).p(i11, j10);
        } else {
            e9.y(i10, this.d).W(i11);
        }
    }
}
