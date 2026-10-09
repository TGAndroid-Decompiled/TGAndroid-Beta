package i2;

import android.os.Looper;
public final class k1 {
    public final j1 f11769a;
    public final i1 f11770b;
    public int f11771c;
    public Object d;
    public final Looper f11772e;
    public boolean f11773f;

    public k1(i1 i1Var, j1 j1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.f11770b = i1Var;
        this.f11769a = j1Var;
        this.f11772e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        e2.d.g(!this.f11773f);
        this.f11773f = true;
        p0 p0Var = (p0) this.f11770b;
        if (!p0Var.X && p0Var.f11860s.getThread().isAlive()) {
            p0Var.f11853n.a(14, this).b();
            return;
        }
        e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
