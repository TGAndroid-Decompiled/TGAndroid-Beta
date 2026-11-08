package l2;

import a8.ia;
import android.os.Looper;
public final class n1 {
    public final m1 f17968a;
    public final l1 f17969b;
    public int f17970c;
    public Object d;
    public final Looper f17971e;
    public boolean f17972f;

    public n1(l1 l1Var, m1 m1Var, e2.l1 l1Var2, int i7, Looper looper) {
        this.f17969b = l1Var;
        this.f17968a = m1Var;
        this.f17971e = looper;
    }

    public final synchronized void a(boolean z9) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        ia.p(!this.f17972f);
        this.f17972f = true;
        r0 r0Var = (r0) this.f17969b;
        if (!r0Var.Z && r0Var.f18028s.getThread().isAlive()) {
            r0Var.f18021n.b(14, this).b();
            return;
        }
        h2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
