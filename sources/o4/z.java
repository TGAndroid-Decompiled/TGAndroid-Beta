package o4;
public final class z implements d0, n0 {
    public final boolean f20900a;
    public final boolean f20901b;
    public final Object f20902c;
    public final Object d;

    public z(o0 o0Var, d2.n0 n0Var, boolean z10, boolean z11) {
        this.f20902c = o0Var;
        this.d = n0Var;
        this.f20900a = z10;
        this.f20901b = z11;
    }

    @Override
    public void c(v vVar) {
        o0 o0Var = (o0) this.f20902c;
        l9.e0 q10 = o0Var.h.q(vVar, g9.i0.u((d2.n0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = o0Var;
        obj.f18547c = vVar;
        obj.f18545a = this.f20900a;
        obj.f18546b = this.f20901b;
        q10.b(new l9.u(0, q10, (Object) obj), l9.r.f18162a);
    }

    @Override
    public void d(u uVar, int i3) {
        uVar.i(i3, (q1) this.f20902c, this.f20900a, this.f20901b, ((v) this.d).f20881c);
    }

    public z(q1 q1Var, boolean z10, boolean z11, v vVar) {
        this.f20902c = q1Var;
        this.f20900a = z10;
        this.f20901b = z11;
        this.d = vVar;
    }
}
