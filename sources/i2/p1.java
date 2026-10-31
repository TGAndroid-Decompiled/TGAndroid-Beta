package i2;

import android.os.Looper;
import v7.t6;
public final class p1 {
    public final o1 f8020a;
    public final n1 f8021b;
    public int f8022c;
    public Object d;
    public final Looper e;
    public boolean f8023f;

    public p1(n1 n1Var, o1 o1Var, b2.o1 o1Var2, int i10, Looper looper) {
        this.f8021b = n1Var;
        this.f8020a = o1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        t6.p(!this.f8023f);
        this.f8023f = true;
        s0 s0Var = (s0) this.f8021b;
        if (!s0Var.Z && s0Var.f8070s.getThread().isAlive()) {
            s0Var.f8063n.b(14, this).b();
            return;
        }
        e2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
