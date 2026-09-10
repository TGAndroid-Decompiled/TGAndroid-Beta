package k3;

import c3.a0;
import c3.b0;
import c3.c0;
import c3.v;
import e6.n;
public final class d extends v {
    public final b0 f12257b;
    public final n f12258c;

    public d(n nVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f12258c = nVar;
        this.f12257b = b0Var2;
    }

    @Override
    public final a0 j(long j3) {
        a0 j10 = this.f12257b.j(j3);
        c0 c0Var = j10.f4125a;
        long j11 = c0Var.f4154a;
        long j12 = c0Var.f4155b;
        long j13 = this.f12258c.f7331b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = j10.f4126b;
        return new a0(c0Var2, new c0(c0Var3.f4154a, c0Var3.f4155b + j13));
    }
}
