package di;
public final class hb implements Runnable {
    public final long f8742a;
    public final int f8743b;
    public final int f8744c;
    public final boolean d;

    public hb(int i7, int i10, long j3, boolean z10) {
        this.f8742a = j3;
        this.f8743b = i7;
        this.f8744c = i10;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f8742a;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f8743b;
        int i11 = this.f8744c;
        if (i7 != 0) {
            e0.g(i10).p(i11, j3);
        } else {
            u8.y(i10, this.d).W(i11);
        }
    }
}
