package k3;

import c3.a0;
import c3.b0;
import c3.c0;
import c3.v;
import e6.n;
public final class d extends v {
    public final b0 f13411b;
    public final n f13412c;

    public d(n nVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f13412c = nVar;
        this.f13411b = b0Var2;
    }

    @Override
    public final a0 j(long j3) {
        a0 j10 = this.f13411b.j(j3);
        c0 c0Var = j10.f3706a;
        long j11 = c0Var.f3735a;
        long j12 = c0Var.f3736b;
        long j13 = this.f13412c.f8026b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = j10.f3707b;
        return new a0(c0Var2, new c0(c0Var3.f3735a, c0Var3.f3736b + j13));
    }
}
