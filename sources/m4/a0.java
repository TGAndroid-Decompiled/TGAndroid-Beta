package m4;
public final class a0 implements e0, o0 {
    public final boolean f17996a;
    public final boolean f17997b;
    public final Object f17998c;
    public final Object d;

    public a0(p0 p0Var, b2.p0 p0Var2, boolean z10, boolean z11) {
        this.f17998c = p0Var;
        this.d = p0Var2;
        this.f17996a = z10;
        this.f17997b = z11;
    }

    @Override
    public void d(v vVar, int i10) {
        vVar.f(i10, (s1) this.f17998c, this.f17996a, this.f17997b, ((w) this.d).f18288c);
    }

    @Override
    public void i(w wVar) {
        p0 p0Var = (p0) this.f17998c;
        k9.e0 q5 = p0Var.f18181g.q(wVar, f9.i0.y((b2.p0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = p0Var;
        obj.f17707c = wVar;
        obj.f17705a = this.f17996a;
        obj.f17706b = this.f17997b;
        q5.a(new k9.u(0, q5, (Object) obj), k9.r.f16491a);
    }

    public a0(s1 s1Var, boolean z10, boolean z11, w wVar) {
        this.f17998c = s1Var;
        this.f17996a = z10;
        this.f17997b = z11;
        this.d = wVar;
    }
}
