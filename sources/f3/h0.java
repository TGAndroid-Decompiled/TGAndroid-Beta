package f3;

import a8.ua;
public final class h0 extends v {
    public final c0 f11038b;
    public final ua f11039c;

    public h0(ua uaVar, c0 c0Var, c0 c0Var2) {
        super(c0Var);
        this.f11039c = uaVar;
        this.f11038b = c0Var2;
    }

    @Override
    public final b0 f(long j3) {
        b0 f10 = this.f11038b.f(j3);
        d0 d0Var = f10.f10997a;
        long j10 = d0Var.f11016a;
        long j11 = d0Var.f11017b;
        long j12 = this.f11039c.f679b;
        d0 d0Var2 = new d0(j10, j11 + j12);
        d0 d0Var3 = f10.f10998b;
        return new b0(d0Var2, new d0(d0Var3.f11016a, d0Var3.f11017b + j12));
    }
}
