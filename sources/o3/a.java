package o3;
public final class a implements t {
    public final c f19068a;
    public final long f19069b;
    public final long f19070c;
    public final long d;
    public final long f19071e;
    public final long f19072f;

    public a(c cVar, long j10, long j11, long j12, long j13, long j14) {
        this.f19068a = cVar;
        this.f19069b = j10;
        this.f19070c = j11;
        this.d = j12;
        this.f19071e = j13;
        this.f19072f = j14;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final s g(long j10) {
        u uVar = new u(j10, b.a(this.f19068a.l(j10), 0L, this.f19070c, this.d, this.f19071e, this.f19072f));
        return new s(uVar, uVar);
    }

    @Override
    public final long h() {
        return this.f19069b;
    }
}
