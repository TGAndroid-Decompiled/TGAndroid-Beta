package m4;
public final class z implements d0, o0 {
    public final boolean f15422a;
    public final boolean f15423b;
    public final Object f15424c;
    public final Object d;

    public z(p0 p0Var, b2.p0 p0Var2, boolean z10, boolean z11) {
        this.f15424c = p0Var;
        this.d = p0Var2;
        this.f15422a = z10;
        this.f15423b = z11;
    }

    @Override
    public void d(u uVar, int i10) {
        uVar.f(i10, (r1) this.f15424c, this.f15422a, this.f15423b, ((v) this.d).f15402c);
    }

    @Override
    public void e(v vVar) {
        p0 p0Var = (p0) this.f15424c;
        j9.e0 q6 = p0Var.f15303g.q(vVar, e9.n0.y((b2.p0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = p0Var;
        obj.f14845c = vVar;
        obj.f14843a = this.f15422a;
        obj.f14844b = this.f15423b;
        q6.a(new j9.u(0, q6, (Object) obj), j9.r.f12944a);
    }

    public z(r1 r1Var, boolean z10, boolean z11, v vVar) {
        this.f15424c = r1Var;
        this.f15422a = z10;
        this.f15423b = z11;
        this.d = vVar;
    }
}
