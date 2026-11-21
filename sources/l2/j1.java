package l2;

import a8.la;
import android.os.Looper;
public final class j1 {
    public final i1 f19444a;
    public final h1 f19445b;
    public int f19446c;
    public Object d;
    public final Looper f19447e;
    public boolean f19448f;

    public j1(h1 h1Var, i1 i1Var, e2.l1 l1Var, int i7, Looper looper) {
        this.f19445b = h1Var;
        this.f19444a = i1Var;
        this.f19447e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        la.p(!this.f19448f);
        this.f19448f = true;
        o0 o0Var = (o0) this.f19445b;
        if (!o0Var.f19514a0 && o0Var.f19537s.getThread().isAlive()) {
            o0Var.f19530n.b(14, this).b();
            return;
        }
        h2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
