package i2;

import android.os.Looper;
public final class j1 {
    public final i1 f11604a;
    public final h1 f11605b;
    public int f11606c;
    public Object d;
    public final Looper f11607e;
    public boolean f11608f;

    public j1(h1 h1Var, i1 i1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.f11605b = h1Var;
        this.f11604a = i1Var;
        this.f11607e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        e2.d.g(!this.f11608f);
        this.f11608f = true;
        o0 o0Var = (o0) this.f11605b;
        if (!o0Var.X && o0Var.f11682s.getThread().isAlive()) {
            o0Var.f11675n.a(14, this).b();
            return;
        }
        e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
