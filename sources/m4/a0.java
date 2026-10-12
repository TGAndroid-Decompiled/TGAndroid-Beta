package m4;
public final class a0 implements e0, p0 {
    public final boolean f15379a;
    public final boolean f15380b;
    public final Object f15381c;
    public final Object d;

    public a0(q0 q0Var, b2.p0 p0Var, boolean z10, boolean z11) {
        this.f15381c = q0Var;
        this.d = p0Var;
        this.f15379a = z10;
        this.f15380b = z11;
    }

    @Override
    public void d(v vVar, int i10) {
        vVar.f(i10, (s1) this.f15381c, this.f15379a, this.f15380b, ((w) this.d).f15672c);
    }

    @Override
    public void f(w wVar) {
        q0 q0Var = (q0) this.f15381c;
        j9.e0 q6 = q0Var.f15573g.q(wVar, e9.n0.y((b2.p0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = q0Var;
        obj.f15095c = wVar;
        obj.f15093a = this.f15379a;
        obj.f15094b = this.f15380b;
        q6.a(new j9.u(0, q6, (Object) obj), j9.r.f12940a);
    }

    public a0(s1 s1Var, boolean z10, boolean z11, w wVar) {
        this.f15381c = s1Var;
        this.f15379a = z10;
        this.f15380b = z11;
        this.d = wVar;
    }
}
