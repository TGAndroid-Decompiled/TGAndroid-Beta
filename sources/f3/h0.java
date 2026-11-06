package f3;

import a8.ua;
public final class h0 extends v {
    public final c0 f11033b;
    public final ua f11034c;

    public h0(ua uaVar, c0 c0Var, c0 c0Var2) {
        super(c0Var);
        this.f11034c = uaVar;
        this.f11033b = c0Var2;
    }

    @Override
    public final b0 f(long j3) {
        b0 f10 = this.f11033b.f(j3);
        d0 d0Var = f10.f10992a;
        long j10 = d0Var.f11011a;
        long j11 = d0Var.f11012b;
        long j12 = this.f11034c.f679b;
        d0 d0Var2 = new d0(j10, j11 + j12);
        d0 d0Var3 = f10.f10993b;
        return new b0(d0Var2, new d0(d0Var3.f11011a, d0Var3.f11012b + j12));
    }
}
