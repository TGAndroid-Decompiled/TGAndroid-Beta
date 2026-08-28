package m3;
public final class a implements t {
    public final c f17209a;
    public final long f17210b;
    public final long f17211c;
    public final long d;
    public final long f17212e;
    public final long f17213f;

    public a(c cVar, long j10, long j11, long j12, long j13, long j14) {
        this.f17209a = cVar;
        this.f17210b = j10;
        this.f17211c = j11;
        this.d = j12;
        this.f17212e = j13;
        this.f17213f = j14;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final s h(long j10) {
        u uVar = new u(j10, b.a(this.f17209a.c(j10), 0L, this.f17211c, this.d, this.f17212e, this.f17213f));
        return new s(uVar, uVar);
    }

    @Override
    public final long i() {
        return this.f17210b;
    }
}
