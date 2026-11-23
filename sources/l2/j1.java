package l2;

import a8.la;
import android.os.Looper;
public final class j1 {
    public final i1 f19447a;
    public final h1 f19448b;
    public int f19449c;
    public Object d;
    public final Looper f19450e;
    public boolean f19451f;

    public j1(h1 h1Var, i1 i1Var, e2.l1 l1Var, int i7, Looper looper) {
        this.f19448b = h1Var;
        this.f19447a = i1Var;
        this.f19450e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        la.p(!this.f19451f);
        this.f19451f = true;
        o0 o0Var = (o0) this.f19448b;
        if (!o0Var.f19517a0 && o0Var.f19540s.getThread().isAlive()) {
            o0Var.f19533n.b(14, this).b();
            return;
        }
        h2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
