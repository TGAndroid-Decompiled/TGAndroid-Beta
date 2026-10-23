package m4;
public final class a0 implements e0, o0 {
    public final boolean f16539a;
    public final boolean f16540b;
    public final Object f16541c;
    public final Object d;

    public a0(p0 p0Var, b2.o0 o0Var, boolean z10, boolean z11) {
        this.f16541c = p0Var;
        this.d = o0Var;
        this.f16539a = z10;
        this.f16540b = z11;
    }

    @Override
    public void e(u uVar, int i10) {
        uVar.f(i10, (r1) this.f16541c, this.f16539a, this.f16540b, ((v) this.d).f16823c);
    }

    @Override
    public void f(v vVar) {
        p0 p0Var = (p0) this.f16541c;
        j9.e0 q6 = p0Var.f16724g.q(vVar, e9.n0.y((b2.o0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = p0Var;
        obj.f16259c = vVar;
        obj.f16257a = this.f16539a;
        obj.f16258b = this.f16540b;
        q6.a(new j9.u(0, q6, (Object) obj), j9.r.f14401a);
    }

    public a0(r1 r1Var, boolean z10, boolean z11, v vVar) {
        this.f16541c = r1Var;
        this.f16539a = z10;
        this.f16540b = z11;
        this.d = vVar;
    }
}
