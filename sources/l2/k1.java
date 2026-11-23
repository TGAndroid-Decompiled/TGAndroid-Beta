package l2;

import a8.ma;
import android.os.Looper;
public final class k1 {
    public final j1 f19517a;
    public final i1 f19518b;
    public int f19519c;
    public Object d;
    public final Looper f19520e;
    public boolean f19521f;

    public k1(i1 i1Var, j1 j1Var, e2.l1 l1Var, int i7, Looper looper) {
        this.f19518b = i1Var;
        this.f19517a = j1Var;
        this.f19520e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        ma.p(!this.f19521f);
        this.f19521f = true;
        p0 p0Var = (p0) this.f19518b;
        if (!p0Var.f19587a0 && p0Var.f19610s.getThread().isAlive()) {
            p0Var.f19603n.b(14, this).b();
            return;
        }
        h2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
