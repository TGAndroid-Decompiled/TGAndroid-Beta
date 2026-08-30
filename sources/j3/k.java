package j3;
public final class k implements h5.n {
    public final c2.d0 f8641a;
    public final k0 f8642b;
    public e f8643c;
    public h5.n d;
    public boolean e = true;
    public boolean f8644f;

    public k(k0 k0Var, h5.y yVar) {
        this.f8642b = k0Var;
        this.f8641a = new c2.d0(yVar);
    }

    @Override
    public final void c(v1 v1Var) {
        h5.n nVar = this.d;
        if (nVar != null) {
            nVar.c(v1Var);
            v1Var = this.d.d();
        }
        this.f8641a.c(v1Var);
    }

    @Override
    public final v1 d() {
        h5.n nVar = this.d;
        if (nVar != null) {
            return nVar.d();
        }
        return (v1) this.f8641a.e;
    }

    @Override
    public final long e() {
        if (this.e) {
            return this.f8641a.e();
        }
        h5.n nVar = this.d;
        nVar.getClass();
        return nVar.e();
    }
}
