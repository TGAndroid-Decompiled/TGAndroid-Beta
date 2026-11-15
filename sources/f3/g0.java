package f3;

import a8.va;
public final class g0 extends v {
    public final b0 f10837b;
    public final va f10838c;

    public g0(va vaVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f10838c = vaVar;
        this.f10837b = b0Var2;
    }

    @Override
    public final a0 f(long j3) {
        a0 f10 = this.f10837b.f(j3);
        c0 c0Var = f10.f10777a;
        long j10 = c0Var.f10808a;
        long j11 = c0Var.f10809b;
        long j12 = this.f10838c.f693b;
        c0 c0Var2 = new c0(j10, j11 + j12);
        c0 c0Var3 = f10.f10778b;
        return new a0(c0Var2, new c0(c0Var3.f10808a, c0Var3.f10809b + j12));
    }
}
