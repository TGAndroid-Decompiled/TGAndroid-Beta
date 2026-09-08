package k3;

import c3.a0;
import c3.b0;
import c3.c0;
import c3.v;
import e6.n;
public final class d extends v {
    public final b0 f14734b;
    public final n f14735c;

    public d(n nVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f14735c = nVar;
        this.f14734b = b0Var2;
    }

    @Override
    public final a0 j(long j3) {
        a0 j10 = this.f14734b.j(j3);
        c0 c0Var = j10.f4225a;
        long j11 = c0Var.f4256a;
        long j12 = c0Var.f4257b;
        long j13 = this.f14735c.f8922b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = j10.f4226b;
        return new a0(c0Var2, new c0(c0Var3.f4256a, c0Var3.f4257b + j13));
    }
}
