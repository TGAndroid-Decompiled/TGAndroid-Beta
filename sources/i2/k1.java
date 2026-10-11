package i2;

import android.os.Looper;
public final class k1 {
    public final j1 f11768a;
    public final i1 f11769b;
    public int f11770c;
    public Object d;
    public final Looper f11771e;
    public boolean f11772f;

    public k1(i1 i1Var, j1 j1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.f11769b = i1Var;
        this.f11768a = j1Var;
        this.f11771e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        e2.d.g(!this.f11772f);
        this.f11772f = true;
        p0 p0Var = (p0) this.f11769b;
        if (!p0Var.X && p0Var.f11859s.getThread().isAlive()) {
            p0Var.f11852n.a(14, this).b();
            return;
        }
        e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
