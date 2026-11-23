package l2;

import a8.ma;
import android.os.Looper;
public final class j1 {
    public final i1 f19413a;
    public final h1 f19414b;
    public int f19415c;
    public Object d;
    public final Looper f19416e;
    public boolean f19417f;

    public j1(h1 h1Var, i1 i1Var, e2.l1 l1Var, int i7, Looper looper) {
        this.f19414b = h1Var;
        this.f19413a = i1Var;
        this.f19416e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        ma.p(!this.f19417f);
        this.f19417f = true;
        o0 o0Var = (o0) this.f19414b;
        if (!o0Var.f19483a0 && o0Var.f19506s.getThread().isAlive()) {
            o0Var.f19499n.b(14, this).b();
            return;
        }
        h2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
