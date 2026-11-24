package defpackage;

import android.os.Looper;
public final class af8 {
    public final ze8 a;
    public final r74 b;
    public byte c;
    public Object d;
    public final Looper e;
    public boolean f;

    public af8(r74 r74Var, ze8 ze8Var, bqb bqbVar, int i, Looper looper) {
        this.b = r74Var;
        this.a = ze8Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        jte.p(!this.f);
        this.f = true;
        r74 r74Var = this.b;
        if (!r74Var.a0 && r74Var.r.getThread().isAlive()) {
            r74Var.h.c(14, this).b();
            return;
        }
        ncd.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
