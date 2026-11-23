package f3;

import a8.va;
public final class g0 extends v {
    public final b0 f11188b;
    public final va f11189c;

    public g0(va vaVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f11189c = vaVar;
        this.f11188b = b0Var2;
    }

    @Override
    public final a0 f(long j3) {
        a0 f10 = this.f11188b.f(j3);
        c0 c0Var = f10.f11128a;
        long j10 = c0Var.f11159a;
        long j11 = c0Var.f11160b;
        long j12 = this.f11189c.f693b;
        c0 c0Var2 = new c0(j10, j11 + j12);
        c0 c0Var3 = f10.f11129b;
        return new a0(c0Var2, new c0(c0Var3.f11159a, c0Var3.f11160b + j12));
    }
}
