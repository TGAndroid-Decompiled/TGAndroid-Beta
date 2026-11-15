package bi;

import di.l8;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
public final class y5 implements is {
    public final int f4017a;
    public final l8 f4018b;
    public final o5 f4019c;
    public s5 d;
    public boolean f4020e;

    public y5(int i7, long j3) {
        this.f4017a = i7;
        l8 l8Var = new l8(i7, 0L, false);
        this.f4018b = l8Var;
        l8Var.f9005p = j3;
        o5 o5Var = new o5(i7, j3, new ai.g0(this, 2));
        o5Var.f3773s = true;
        this.f4019c = o5Var;
    }

    public final void a() {
        if (this.f4020e) {
            return;
        }
        ns.f(this.f4017a).c(this, ns.G3);
        this.f4018b.a();
        this.f4019c.g(false);
        this.f4020e = true;
    }

    public final void b() {
        if (!this.f4020e) {
            return;
        }
        ns.f(this.f4017a).n(this, ns.G3);
        this.f4018b.f();
        this.f4019c.f();
        this.f4020e = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        s5 s5Var;
        if (i7 == ns.G3 && objArr[1] == this.f4018b && (s5Var = this.d) != null) {
            s5Var.run();
        }
    }
}
