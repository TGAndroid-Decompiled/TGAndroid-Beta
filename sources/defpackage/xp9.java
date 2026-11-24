package defpackage;

import java.io.Closeable;
public final class xp9 implements b16, Closeable {
    public final String a;
    public final wp9 b;
    public boolean c;

    public xp9(String str, wp9 wp9Var) {
        this.a = str;
        this.b = wp9Var;
    }

    public final void a(oo ooVar, w06 w06Var) {
        ooVar.getClass();
        w06Var.getClass();
        if (!this.c) {
            this.c = true;
            w06Var.a(this);
            ooVar.f(this.a, this.b.e);
            return;
        }
        sc8.j("Already attached to lifecycleOwner");
    }

    @Override
    public final void b(e16 e16Var, u06 u06Var) {
        if (u06Var == u06.ON_DESTROY) {
            this.c = false;
            e16Var.m().b(this);
        }
    }

    @Override
    public final void close() {
    }
}
