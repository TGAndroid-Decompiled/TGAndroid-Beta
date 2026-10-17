package i2;
public final class i implements u0 {
    public final s1 f12446a;
    public final p0 f12447b;
    public b f12448c;
    public u0 d;
    public boolean e = true;
    public boolean f12449f;

    public i(p0 p0Var, e2.g0 g0Var) {
        this.f12447b = p0Var;
        this.f12446a = new s1(g0Var);
    }

    @Override
    public final long a() {
        if (this.e) {
            return this.f12446a.a();
        }
        u0 u0Var = this.d;
        u0Var.getClass();
        return u0Var.a();
    }

    @Override
    public final boolean b() {
        if (this.e) {
            this.f12446a.getClass();
            return false;
        }
        u0 u0Var = this.d;
        u0Var.getClass();
        return u0Var.b();
    }

    public final void c(b bVar) {
        u0 u0Var;
        u0 i10 = bVar.i();
        if (i10 != null && i10 != (u0Var = this.d)) {
            if (u0Var == null) {
                this.d = i10;
                this.f12448c = bVar;
                i10.f((b2.z0) this.f12446a.e);
                return;
            }
            throw new l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override
    public final void f(b2.z0 z0Var) {
        u0 u0Var = this.d;
        if (u0Var != null) {
            u0Var.f(z0Var);
            z0Var = this.d.h();
        }
        this.f12446a.f(z0Var);
    }

    @Override
    public final b2.z0 h() {
        u0 u0Var = this.d;
        if (u0Var != null) {
            return u0Var.h();
        }
        return (b2.z0) this.f12446a.e;
    }
}
