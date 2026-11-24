package defpackage;

import android.content.Context;
public final class ha5 extends ro4 {
    public final qa5 r;

    public ha5(qa5 qa5Var, Context context, int i) {
        super(context, i);
        this.r = qa5Var;
    }

    @Override
    public final void a(ya5 ya5Var) {
        super.a(ya5Var);
        this.r.u0();
    }

    @Override
    public final void b() {
        super.b();
        this.r.u0();
    }

    @Override
    public final void c(ya5 ya5Var) {
        qa5 qa5Var = this.r;
        if (ya5Var == qa5Var.Y) {
            qa5Var.Y = null;
        }
        if (ya5Var == qa5Var.Z) {
            qa5Var.Z = null;
        }
        super.c(ya5Var);
        qa5Var.u0();
    }
}
