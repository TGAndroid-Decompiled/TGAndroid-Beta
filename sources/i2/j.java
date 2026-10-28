package i2;
public final class j implements x0 {
    public final u1 f13578a;
    public final s0 f13579b;
    public b f13580c;
    public x0 d;
    public boolean e = true;
    public boolean f13581f;

    public j(s0 s0Var, e2.g0 g0Var) {
        this.f13579b = s0Var;
        this.f13578a = new u1(g0Var);
    }

    @Override
    public final long a() {
        if (this.e) {
            return this.f13578a.a();
        }
        x0 x0Var = this.d;
        x0Var.getClass();
        return x0Var.a();
    }

    @Override
    public final boolean b() {
        if (this.e) {
            this.f13578a.getClass();
            return false;
        }
        x0 x0Var = this.d;
        x0Var.getClass();
        return x0Var.b();
    }

    public final void c(b bVar) {
        x0 x0Var;
        x0 i10 = bVar.i();
        if (i10 != null && i10 != (x0Var = this.d)) {
            if (x0Var == null) {
                this.d = i10;
                this.f13580c = bVar;
                i10.f((b2.a1) this.f13578a.e);
                return;
            }
            throw new m(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override
    public final void f(b2.a1 a1Var) {
        x0 x0Var = this.d;
        if (x0Var != null) {
            x0Var.f(a1Var);
            a1Var = this.d.h();
        }
        this.f13578a.f(a1Var);
    }

    @Override
    public final b2.a1 h() {
        x0 x0Var = this.d;
        if (x0Var != null) {
            return x0Var.h();
        }
        return (b2.a1) this.f13578a.e;
    }
}
