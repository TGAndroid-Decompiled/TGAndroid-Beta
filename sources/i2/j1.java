package i2;

import android.os.Looper;
public final class j1 {
    public final i1 f11630a;
    public final h1 f11631b;
    public int f11632c;
    public Object d;
    public final Looper f11633e;
    public boolean f11634f;

    public j1(h1 h1Var, i1 i1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.f11631b = h1Var;
        this.f11630a = i1Var;
        this.f11633e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        e2.d.g(!this.f11634f);
        this.f11634f = true;
        o0 o0Var = (o0) this.f11631b;
        if (!o0Var.X && o0Var.f11708s.getThread().isAlive()) {
            o0Var.f11701n.a(14, this).b();
            return;
        }
        e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
