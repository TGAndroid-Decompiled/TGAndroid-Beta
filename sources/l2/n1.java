package l2;

import a8.ia;
import android.os.Looper;
public final class n1 {
    public final m1 f17966a;
    public final l1 f17967b;
    public int f17968c;
    public Object d;
    public final Looper f17969e;
    public boolean f17970f;

    public n1(l1 l1Var, m1 m1Var, e2.l1 l1Var2, int i7, Looper looper) {
        this.f17967b = l1Var;
        this.f17966a = m1Var;
        this.f17969e = looper;
    }

    public final synchronized void a(boolean z9) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        ia.p(!this.f17970f);
        this.f17970f = true;
        r0 r0Var = (r0) this.f17967b;
        if (!r0Var.Z && r0Var.f18026s.getThread().isAlive()) {
            r0Var.f18019n.b(14, this).b();
            return;
        }
        h2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
