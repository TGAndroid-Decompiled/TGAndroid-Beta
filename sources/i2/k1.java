package i2;

import android.os.Looper;
public final class k1 {
    public final j1 f11718a;
    public final i1 f11719b;
    public int f11720c;
    public Object d;
    public final Looper f11721e;
    public boolean f11722f;

    public k1(i1 i1Var, j1 j1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.f11719b = i1Var;
        this.f11718a = j1Var;
        this.f11721e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        e2.d.g(!this.f11722f);
        this.f11722f = true;
        p0 p0Var = (p0) this.f11719b;
        if (!p0Var.X && p0Var.f11809s.getThread().isAlive()) {
            p0Var.f11802n.a(14, this).b();
            return;
        }
        e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
