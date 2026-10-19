package i2;
public final class k implements w0 {
    public final t1 f12466a;
    public final r0 f12467b;
    public b f12468c;
    public w0 d;
    public boolean e = true;
    public boolean f12469f;

    public k(r0 r0Var, e2.g0 g0Var) {
        this.f12467b = r0Var;
        this.f12466a = new t1(g0Var);
    }

    @Override
    public final long a() {
        if (this.e) {
            return this.f12466a.a();
        }
        w0 w0Var = this.d;
        w0Var.getClass();
        return w0Var.a();
    }

    @Override
    public final boolean b() {
        if (this.e) {
            this.f12466a.getClass();
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
                this.f12468c = bVar;
                i10.f((b2.z0) this.f12466a.e);
                return;
            }
            throw new n(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override
    public final void f(b2.z0 z0Var) {
        w0 w0Var = this.d;
        if (w0Var != null) {
            w0Var.f(z0Var);
            z0Var = this.d.h();
        }
        this.f12466a.f(z0Var);
    }

    @Override
    public final b2.z0 h() {
        w0 w0Var = this.d;
        if (w0Var != null) {
            return w0Var.h();
        }
        return (b2.z0) this.f12466a.e;
    }
}
