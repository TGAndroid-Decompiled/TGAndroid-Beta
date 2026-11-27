package defpackage;

import android.content.Context;
public final class ic5 extends vq4 {
    public final rc5 r;

    public ic5(rc5 rc5Var, Context context, int i) {
        super(context, i);
        this.r = rc5Var;
    }

    @Override
    public final void a(zc5 zc5Var) {
        super.a(zc5Var);
        this.r.u0();
    }

    @Override
    public final void b() {
        super.b();
        this.r.u0();
    }

    @Override
    public final void c(zc5 zc5Var) {
        rc5 rc5Var = this.r;
        if (zc5Var == rc5Var.Y) {
            rc5Var.Y = null;
        }
        if (zc5Var == rc5Var.Z) {
            rc5Var.Z = null;
        }
        super.c(zc5Var);
        rc5Var.u0();
    }
}
