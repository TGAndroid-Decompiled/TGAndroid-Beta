package f3;

import a8.va;
public final class h0 extends v {
    public final c0 f11158b;
    public final va f11159c;

    public h0(va vaVar, c0 c0Var, c0 c0Var2) {
        super(c0Var);
        this.f11159c = vaVar;
        this.f11158b = c0Var2;
    }

    @Override
    public final b0 f(long j3) {
        b0 f10 = this.f11158b.f(j3);
        d0 d0Var = f10.f11117a;
        long j10 = d0Var.f11136a;
        long j11 = d0Var.f11137b;
        long j12 = this.f11159c.f693b;
        d0 d0Var2 = new d0(j10, j11 + j12);
        d0 d0Var3 = f10.f11118b;
        return new b0(d0Var2, new d0(d0Var3.f11136a, d0Var3.f11137b + j12));
    }
}
