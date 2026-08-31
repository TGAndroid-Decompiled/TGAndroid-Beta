package j3;
public final class k implements h5.n {
    public final c2.d0 f9217a;
    public final k0 f9218b;
    public e f9219c;
    public h5.n d;
    public boolean f9220e = true;
    public boolean f9221f;

    public k(k0 k0Var, h5.y yVar) {
        this.f9218b = k0Var;
        this.f9217a = new c2.d0(yVar);
    }

    @Override
    public final void c(v1 v1Var) {
        h5.n nVar = this.d;
        if (nVar != null) {
            nVar.c(v1Var);
            v1Var = this.d.d();
        }
        this.f9217a.c(v1Var);
    }

    @Override
    public final v1 d() {
        h5.n nVar = this.d;
        if (nVar != null) {
            return nVar.d();
        }
        return (v1) this.f9217a.f2075e;
    }

    @Override
    public final long e() {
        if (this.f9220e) {
            return this.f9217a.e();
        }
        h5.n nVar = this.d;
        nVar.getClass();
        return nVar.e();
    }
}
