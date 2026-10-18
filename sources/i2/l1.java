package i2;

import android.os.Looper;
import v7.u6;
public final class l1 {
    public final k1 f12477a;
    public final j1 f12478b;
    public int f12479c;
    public Object d;
    public final Looper e;
    public boolean f12480f;

    public l1(j1 j1Var, k1 k1Var, b2.o1 o1Var, int i10, Looper looper) {
        this.f12478b = j1Var;
        this.f12477a = k1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        u6.p(!this.f12480f);
        this.f12480f = true;
        q0 q0Var = (q0) this.f12478b;
        if (!q0Var.Z && q0Var.f12564s.getThread().isAlive()) {
            q0Var.f12557n.b(14, this).b();
            return;
        }
        e2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
