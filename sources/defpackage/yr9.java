package defpackage;

import java.io.Closeable;
public final class yr9 implements b36, Closeable {
    public final String a;
    public final xr9 b;
    public boolean c;

    public yr9(String str, xr9 xr9Var) {
        this.a = str;
        this.b = xr9Var;
    }

    public final void a(op opVar, w26 w26Var) {
        opVar.getClass();
        w26Var.getClass();
        if (!this.c) {
            this.c = true;
            w26Var.a(this);
            opVar.f(this.a, this.b.e);
            return;
        }
        dq9.m("Already attached to lifecycleOwner");
    }

    @Override
    public final void b(e36 e36Var, u26 u26Var) {
        if (u26Var == u26.ON_DESTROY) {
            this.c = false;
            e36Var.m().b(this);
        }
    }

    @Override
    public final void close() {
    }
}
