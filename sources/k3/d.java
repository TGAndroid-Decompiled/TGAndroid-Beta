package k3;

import c3.a0;
import c3.b0;
import c3.c0;
import c3.v;
import e6.n;
public final class d extends v {
    public final b0 f13413b;
    public final n f13414c;

    public d(n nVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f13414c = nVar;
        this.f13413b = b0Var2;
    }

    @Override
    public final a0 j(long j3) {
        a0 j10 = this.f13413b.j(j3);
        c0 c0Var = j10.f3711a;
        long j11 = c0Var.f3740a;
        long j12 = c0Var.f3741b;
        long j13 = this.f13414c.f8031b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = j10.f3712b;
        return new a0(c0Var2, new c0(c0Var3.f3740a, c0Var3.f3741b + j13));
    }
}
