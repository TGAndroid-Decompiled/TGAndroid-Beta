package i2;

import android.os.Looper;
public final class k1 {
    public final j1 f10768a;
    public final i1 f10769b;
    public int f10770c;
    public Object d;
    public final Looper e;
    public boolean f10771f;

    public k1(i1 i1Var, j1 j1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.f10769b = i1Var;
        this.f10768a = j1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        e2.d.g(!this.f10771f);
        this.f10771f = true;
        p0 p0Var = (p0) this.f10769b;
        if (!p0Var.X && p0Var.f10853s.getThread().isAlive()) {
            p0Var.f10846n.a(14, this).b();
            return;
        }
        e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
