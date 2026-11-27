package defpackage;

import java.io.Closeable;
public final class pt9 implements f36, Closeable {
    public final String a;
    public final ot9 b;
    public boolean c;

    public pt9(String str, ot9 ot9Var) {
        this.a = str;
        this.b = ot9Var;
    }

    public final void a(po poVar, a36 a36Var) {
        poVar.getClass();
        a36Var.getClass();
        if (!this.c) {
            this.c = true;
            a36Var.a(this);
            poVar.f(this.a, this.b.e);
            return;
        }
        grb.i("Already attached to lifecycleOwner");
    }

    @Override
    public final void b(i36 i36Var, y26 y26Var) {
        if (y26Var == y26.ON_DESTROY) {
            this.c = false;
            i36Var.m().b(this);
        }
    }

    @Override
    public final void close() {
    }
}
