package defpackage;

import android.os.Looper;
public final class yc8 {
    public final xc8 a;
    public final i64 b;
    public byte c;
    public Object d;
    public final Looper e;
    public boolean f;

    public yc8(i64 i64Var, xc8 xc8Var, aob aobVar, int i, Looper looper) {
        this.b = i64Var;
        this.a = xc8Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        gre.p(!this.f);
        this.f = true;
        i64 i64Var = this.b;
        if (!i64Var.a0 && i64Var.r.getThread().isAlive()) {
            i64Var.h.c(14, this).b();
            return;
        }
        lad.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
