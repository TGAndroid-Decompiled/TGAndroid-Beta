package i2;

import android.os.Looper;
public final class k1 {
    public final j1 f11719a;
    public final i1 f11720b;
    public int f11721c;
    public Object d;
    public final Looper f11722e;
    public boolean f11723f;

    public k1(i1 i1Var, j1 j1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.f11720b = i1Var;
        this.f11719a = j1Var;
        this.f11722e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        e2.d.g(!this.f11723f);
        this.f11723f = true;
        p0 p0Var = (p0) this.f11720b;
        if (!p0Var.X && p0Var.f11810s.getThread().isAlive()) {
            p0Var.f11803n.a(14, this).b();
            return;
        }
        e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
