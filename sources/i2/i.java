package i2;
public final class i implements x0 {
    public final w1 f7893a;
    public final s0 f7894b;
    public b f7895c;
    public x0 d;
    public boolean e;
    public boolean f7896f;

    public i(s0 s0Var, e2.g0 g0Var) {
        this.f7894b = s0Var;
        ?? obj = new Object();
        obj.d = g0Var;
        obj.e = b2.z0.d;
        this.f7893a = obj;
        this.e = true;
    }

    @Override
    public final long a() {
        if (this.e) {
            return this.f7893a.a();
        }
        x0 x0Var = this.d;
        x0Var.getClass();
        return x0Var.a();
    }

    @Override
    public final boolean b() {
        if (this.e) {
            this.f7893a.getClass();
            return false;
        }
        x0 x0Var = this.d;
        x0Var.getClass();
        return x0Var.b();
    }

    @Override
    public final void c(b2.z0 z0Var) {
        x0 x0Var = this.d;
        if (x0Var != null) {
            x0Var.c(z0Var);
            z0Var = this.d.g();
        }
        this.f7893a.c(z0Var);
    }

    public final void d(b bVar) {
        x0 x0Var;
        x0 i10 = bVar.i();
        if (i10 != null && i10 != (x0Var = this.d)) {
            if (x0Var == null) {
                this.d = i10;
                this.f7895c = bVar;
                i10.c((b2.z0) this.f7893a.e);
                return;
            }
            throw new l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override
    public final b2.z0 g() {
        x0 x0Var = this.d;
        if (x0Var != null) {
            return x0Var.g();
        }
        return (b2.z0) this.f7893a.e;
    }
}
