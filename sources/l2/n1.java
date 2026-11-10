package l2;

import a8.ia;
import android.os.Looper;
public final class n1 {
    public final m1 f17969a;
    public final l1 f17970b;
    public int f17971c;
    public Object d;
    public final Looper f17972e;
    public boolean f17973f;

    public n1(l1 l1Var, m1 m1Var, e2.l1 l1Var2, int i7, Looper looper) {
        this.f17970b = l1Var;
        this.f17969a = m1Var;
        this.f17972e = looper;
    }

    public final synchronized void a(boolean z9) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        ia.p(!this.f17973f);
        this.f17973f = true;
        r0 r0Var = (r0) this.f17970b;
        if (!r0Var.Z && r0Var.f18029s.getThread().isAlive()) {
            r0Var.f18022n.b(14, this).b();
            return;
        }
        h2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
