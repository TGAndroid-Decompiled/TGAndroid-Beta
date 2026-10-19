package i2;
public final class k implements w0 {
    public final t1 f12468a;
    public final r0 f12469b;
    public b f12470c;
    public w0 d;
    public boolean e = true;
    public boolean f12471f;

    public k(r0 r0Var, e2.g0 g0Var) {
        this.f12469b = r0Var;
        this.f12468a = new t1(g0Var);
    }

    @Override
    public final long a() {
        if (this.e) {
            return this.f12468a.a();
        }
        w0 w0Var = this.d;
        w0Var.getClass();
        return w0Var.a();
    }

    @Override
    public final boolean b() {
        if (this.e) {
            this.f12468a.getClass();
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
                this.f12470c = bVar;
                i10.f((b2.z0) this.f12468a.e);
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
        this.f12468a.f(z0Var);
    }

    @Override
    public final b2.z0 h() {
        w0 w0Var = this.d;
        if (w0Var != null) {
            return w0Var.h();
        }
        return (b2.z0) this.f12468a.e;
    }
}
