package i2;
public final class j implements w0 {
    public final u1 f11049a;
    public final r0 f11050b;
    public b f11051c;
    public w0 d;
    public boolean e = true;
    public boolean f11052f;

    public j(r0 r0Var, e2.g0 g0Var) {
        this.f11050b = r0Var;
        this.f11049a = new u1(g0Var);
    }

    @Override
    public final long a() {
        if (this.e) {
            return this.f11049a.a();
        }
        w0 w0Var = this.d;
        w0Var.getClass();
        return w0Var.a();
    }

    @Override
    public final boolean b() {
        if (this.e) {
            this.f11049a.getClass();
            return false;
        }
        w0 w0Var = this.d;
        w0Var.getClass();
        return w0Var.b();
    }

    public final void c(b bVar) {
        w0 w0Var;
        w0 i10 = bVar.i();
        if (i10 != null && i10 != (w0Var = this.d)) {
            if (w0Var == null) {
                this.d = i10;
                this.f11051c = bVar;
                i10.f((b2.a1) this.f11049a.e);
                return;
            }
            throw new m(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override
    public final void f(b2.a1 a1Var) {
        w0 w0Var = this.d;
        if (w0Var != null) {
            w0Var.f(a1Var);
            a1Var = this.d.h();
        }
        this.f11049a.f(a1Var);
    }

    @Override
    public final b2.a1 h() {
        w0 w0Var = this.d;
        if (w0Var != null) {
            return w0Var.h();
        }
        return (b2.a1) this.f11049a.e;
    }
}
