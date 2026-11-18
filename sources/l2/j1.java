package l2;

import a8.la;
import android.os.Looper;
public final class j1 {
    public final i1 f19416a;
    public final h1 f19417b;
    public int f19418c;
    public Object d;
    public final Looper f19419e;
    public boolean f19420f;

    public j1(h1 h1Var, i1 i1Var, e2.l1 l1Var, int i7, Looper looper) {
        this.f19417b = h1Var;
        this.f19416a = i1Var;
        this.f19419e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        la.p(!this.f19420f);
        this.f19420f = true;
        o0 o0Var = (o0) this.f19417b;
        if (!o0Var.f19486a0 && o0Var.f19509s.getThread().isAlive()) {
            o0Var.f19502n.b(14, this).b();
            return;
        }
        h2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
