package f3;

import a8.va;
public final class g0 extends v {
    public final b0 f11151b;
    public final va f11152c;

    public g0(va vaVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f11152c = vaVar;
        this.f11151b = b0Var2;
    }

    @Override
    public final a0 f(long j3) {
        a0 f10 = this.f11151b.f(j3);
        c0 c0Var = f10.f11091a;
        long j10 = c0Var.f11122a;
        long j11 = c0Var.f11123b;
        long j12 = this.f11152c.f693b;
        c0 c0Var2 = new c0(j10, j11 + j12);
        c0 c0Var3 = f10.f11092b;
        return new a0(c0Var2, new c0(c0Var3.f11122a, c0Var3.f11123b + j12));
    }
}
