package e3;

import b8.ig;
public final class g0 extends v {
    public final b0 f9466b;
    public final ig f9467c;

    public g0(ig igVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f9467c = igVar;
        this.f9466b = b0Var2;
    }

    @Override
    public final a0 f(long j10) {
        a0 f10 = this.f9466b.f(j10);
        c0 c0Var = f10.f9406a;
        long j11 = c0Var.f9437a;
        long j12 = c0Var.f9438b;
        long j13 = this.f9467c.f2682b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = f10.f9407b;
        return new a0(c0Var2, new c0(c0Var3.f9437a, c0Var3.f9438b + j13));
    }
}
