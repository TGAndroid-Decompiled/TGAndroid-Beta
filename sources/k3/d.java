package k3;

import c3.a0;
import c3.b0;
import c3.c0;
import c3.v;
import e6.n;
public final class d extends v {
    public final b0 f14598b;
    public final n f14599c;

    public d(n nVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f14599c = nVar;
        this.f14598b = b0Var2;
    }

    @Override
    public final a0 j(long j3) {
        a0 j10 = this.f14598b.j(j3);
        c0 c0Var = j10.f4053a;
        long j11 = c0Var.f4084a;
        long j12 = c0Var.f4085b;
        long j13 = this.f14599c.f8688b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = j10.f4054b;
        return new a0(c0Var2, new c0(c0Var3.f4084a, c0Var3.f4085b + j13));
    }
}
