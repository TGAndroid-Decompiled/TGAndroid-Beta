package i2;

import a8.yb;
import android.os.Looper;
public final class n1 {
    public final m1 f13665a;
    public final l1 f13666b;
    public int f13667c;
    public Object d;
    public final Looper e;
    public boolean f13668f;

    public n1(l1 l1Var, m1 m1Var, b2.p1 p1Var, int i10, Looper looper) {
        this.f13666b = l1Var;
        this.f13665a = m1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        yb.p(!this.f13668f);
        this.f13668f = true;
        s0 s0Var = (s0) this.f13666b;
        if (!s0Var.Z && s0Var.f13750s.getThread().isAlive()) {
            s0Var.f13743n.b(14, this).b();
            return;
        }
        e2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
