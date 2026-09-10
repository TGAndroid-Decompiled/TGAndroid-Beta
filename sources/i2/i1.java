package i2;

import android.os.Looper;
public final class i1 {
    public final h1 f10233a;
    public final g1 f10234b;
    public int f10235c;
    public Object d;
    public final Looper e;
    public boolean f10236f;

    public i1(g1 g1Var, h1 h1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.f10234b = g1Var;
        this.f10233a = h1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        e2.d.g(!this.f10236f);
        this.f10236f = true;
        n0 n0Var = (n0) this.f10234b;
        if (!n0Var.X && n0Var.f10305s.getThread().isAlive()) {
            n0Var.f10298n.a(14, this).b();
            return;
        }
        e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
