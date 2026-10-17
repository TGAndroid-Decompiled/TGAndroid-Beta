package m4;
public final class a0 implements e0, o0 {
    public final boolean f16470a;
    public final boolean f16471b;
    public final Object f16472c;
    public final Object d;

    public a0(p0 p0Var, b2.o0 o0Var, boolean z10, boolean z11) {
        this.f16472c = p0Var;
        this.d = o0Var;
        this.f16470a = z10;
        this.f16471b = z11;
    }

    @Override
    public void b(u uVar, int i10) {
        uVar.f(i10, (r1) this.f16472c, this.f16470a, this.f16471b, ((v) this.d).f16754c);
    }

    @Override
    public void f(v vVar) {
        p0 p0Var = (p0) this.f16472c;
        j9.e0 q6 = p0Var.f16655g.q(vVar, e9.n0.y((b2.o0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = p0Var;
        obj.f16190c = vVar;
        obj.f16188a = this.f16470a;
        obj.f16189b = this.f16471b;
        q6.a(new j9.u(0, q6, (Object) obj), j9.r.f14351a);
    }

    public a0(r1 r1Var, boolean z10, boolean z11, v vVar) {
        this.f16472c = r1Var;
        this.f16470a = z10;
        this.f16471b = z11;
        this.d = vVar;
    }
}
