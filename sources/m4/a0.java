package m4;
public final class a0 implements e0, o0 {
    public final boolean f12690a;
    public final boolean f12691b;
    public final Object f12692c;
    public final Object d;

    public a0(p0 p0Var, b2.p0 p0Var2, boolean z10, boolean z11) {
        this.f12692c = p0Var;
        this.d = p0Var2;
        this.f12690a = z10;
        this.f12691b = z11;
    }

    @Override
    public void b(w wVar) {
        p0 p0Var = (p0) this.f12692c;
        j9.e0 q6 = p0Var.h.q(wVar, e9.n0.y((b2.p0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = p0Var;
        obj.f12383c = wVar;
        obj.f12381a = this.f12690a;
        obj.f12382b = this.f12691b;
        q6.a(new j9.u(0, q6, (Object) obj), j9.r.f9763a);
    }

    @Override
    public void e(v vVar, int i10) {
        vVar.f(i10, (s1) this.f12692c, this.f12690a, this.f12691b, ((w) this.d).f12983c);
    }

    public a0(s1 s1Var, boolean z10, boolean z11, w wVar) {
        this.f12692c = s1Var;
        this.f12690a = z10;
        this.f12691b = z11;
        this.d = wVar;
    }
}
