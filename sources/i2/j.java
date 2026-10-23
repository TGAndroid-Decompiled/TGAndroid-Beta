package i2;
public final class j implements v0 {
    public final t1 f12495a;
    public final q0 f12496b;
    public b f12497c;
    public v0 d;
    public boolean e = true;
    public boolean f12498f;

    public j(q0 q0Var, e2.g0 g0Var) {
        this.f12496b = q0Var;
        this.f12495a = new t1(g0Var);
    }

    @Override
    public final long a() {
        if (this.e) {
            return this.f12495a.a();
        }
        v0 v0Var = this.d;
        v0Var.getClass();
        return v0Var.a();
    }

    @Override
    public final boolean b() {
        if (this.e) {
            this.f12495a.getClass();
            return false;
        }
        v0 v0Var = this.d;
        v0Var.getClass();
        return v0Var.b();
    }

    public final void c(b bVar) {
        v0 v0Var;
        v0 i10 = bVar.i();
        if (i10 != null && i10 != (v0Var = this.d)) {
            if (v0Var == null) {
                this.d = i10;
                this.f12497c = bVar;
                i10.f((b2.z0) this.f12495a.e);
                return;
            }
            throw new m(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override
    public final void f(b2.z0 z0Var) {
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.f(z0Var);
            z0Var = this.d.h();
        }
        this.f12495a.f(z0Var);
    }

    @Override
    public final b2.z0 h() {
        v0 v0Var = this.d;
        if (v0Var != null) {
            return v0Var.h();
        }
        return (b2.z0) this.f12495a.e;
    }
}
