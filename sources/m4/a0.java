package m4;
public final class a0 implements e0, o0 {
    public final boolean f16477a;
    public final boolean f16478b;
    public final Object f16479c;
    public final Object d;

    public a0(p0 p0Var, b2.o0 o0Var, boolean z10, boolean z11) {
        this.f16479c = p0Var;
        this.d = o0Var;
        this.f16477a = z10;
        this.f16478b = z11;
    }

    @Override
    public void b(u uVar, int i10) {
        uVar.f(i10, (r1) this.f16479c, this.f16477a, this.f16478b, ((v) this.d).f16761c);
    }

    @Override
    public void f(v vVar) {
        p0 p0Var = (p0) this.f16479c;
        j9.e0 q6 = p0Var.f16662g.q(vVar, e9.n0.y((b2.o0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = p0Var;
        obj.f16197c = vVar;
        obj.f16195a = this.f16477a;
        obj.f16196b = this.f16478b;
        q6.a(new j9.u(0, q6, (Object) obj), j9.r.f14358a);
    }

    public a0(r1 r1Var, boolean z10, boolean z11, v vVar) {
        this.f16479c = r1Var;
        this.f16477a = z10;
        this.f16478b = z11;
        this.d = vVar;
    }
}
