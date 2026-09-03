package j3;
public final class k implements h5.n {
    public final c2.e0 f8623a;
    public final k0 f8624b;
    public e f8625c;
    public h5.n d;
    public boolean e = true;
    public boolean f8626f;

    public k(k0 k0Var, h5.y yVar) {
        this.f8624b = k0Var;
        this.f8623a = new c2.e0(yVar);
    }

    @Override
    public final void a(v1 v1Var) {
        h5.n nVar = this.d;
        if (nVar != null) {
            nVar.a(v1Var);
            v1Var = this.d.d();
        }
        this.f8623a.a(v1Var);
    }

    @Override
    public final v1 d() {
        h5.n nVar = this.d;
        if (nVar != null) {
            return nVar.d();
        }
        return (v1) this.f8623a.e;
    }

    @Override
    public final long e() {
        if (this.e) {
            return this.f8623a.e();
        }
        h5.n nVar = this.d;
        nVar.getClass();
        return nVar.e();
    }
}
