package f3;

import a8.va;
public final class g0 extends v {
    public final b0 f11185b;
    public final va f11186c;

    public g0(va vaVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f11186c = vaVar;
        this.f11185b = b0Var2;
    }

    @Override
    public final a0 f(long j3) {
        a0 f10 = this.f11185b.f(j3);
        c0 c0Var = f10.f11125a;
        long j10 = c0Var.f11156a;
        long j11 = c0Var.f11157b;
        long j12 = this.f11186c.f693b;
        c0 c0Var2 = new c0(j10, j11 + j12);
        c0 c0Var3 = f10.f11126b;
        return new a0(c0Var2, new c0(c0Var3.f11156a, c0Var3.f11157b + j12));
    }
}
