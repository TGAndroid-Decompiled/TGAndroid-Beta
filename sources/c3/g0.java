package c3;

import a8.lg;
public final class g0 extends v {
    public final b0 f6056b;
    public final lg f6057c;

    public g0(lg lgVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f6057c = lgVar;
        this.f6056b = b0Var2;
    }

    @Override
    public final a0 f(long j10) {
        a0 f7 = this.f6056b.f(j10);
        c0 c0Var = f7.f6002a;
        long j11 = c0Var.f6031a;
        long j12 = c0Var.f6032b;
        long j13 = this.f6057c.f599b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = f7.f6003b;
        return new a0(c0Var2, new c0(c0Var3.f6031a, c0Var3.f6032b + j13));
    }
}
