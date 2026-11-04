package k2;
public final class i implements w0 {
    public final u1 f16535a;
    public final r0 f16536b;
    public b f16537c;
    public w0 d;
    public boolean f16538e;
    public boolean f16539f;

    public i(r0 r0Var, g2.h0 h0Var) {
        this.f16536b = r0Var;
        ?? obj = new Object();
        obj.d = h0Var;
        obj.f16750e = d2.y0.d;
        this.f16535a = obj;
        this.f16538e = true;
    }

    @Override
    public final long a() {
        if (this.f16538e) {
            return this.f16535a.a();
        }
        w0 w0Var = this.d;
        w0Var.getClass();
        return w0Var.a();
    }

    @Override
    public final boolean b() {
        if (this.f16538e) {
            this.f16535a.getClass();
            return false;
        }
        w0 w0Var = this.d;
        w0Var.getClass();
        return w0Var.b();
    }

    @Override
    public final void c(d2.y0 y0Var) {
        w0 w0Var = this.d;
        if (w0Var != null) {
            w0Var.c(y0Var);
            y0Var = this.d.g();
        }
        this.f16535a.c(y0Var);
    }

    public final void d(b bVar) {
        w0 w0Var;
        w0 i3 = bVar.i();
        if (i3 != null && i3 != (w0Var = this.d)) {
            if (w0Var == null) {
                this.d = i3;
                this.f16537c = bVar;
                i3.c((d2.y0) this.f16535a.f16750e);
                return;
            }
            throw new l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override
    public final d2.y0 g() {
        w0 w0Var = this.d;
        if (w0Var != null) {
            return w0Var.g();
        }
        return (d2.y0) this.f16535a.f16750e;
    }
}
