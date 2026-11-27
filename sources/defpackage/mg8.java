package defpackage;

import android.os.Looper;
public final class mg8 {
    public final lg8 a;
    public final c74 b;
    public byte c;
    public Object d;
    public final Looper e;
    public boolean f;

    public mg8(c74 c74Var, lg8 lg8Var, asb asbVar, int i, Looper looper) {
        this.b = c74Var;
        this.a = lg8Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        yve.p(!this.f);
        this.f = true;
        c74 c74Var = this.b;
        if (!c74Var.a0 && c74Var.r.getThread().isAlive()) {
            c74Var.h.c(14, this).b();
            return;
        }
        efd.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
