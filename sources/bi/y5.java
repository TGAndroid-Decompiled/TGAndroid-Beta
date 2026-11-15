package bi;

import di.m8;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
public final class y5 implements is {
    public final int f4014a;
    public final m8 f4015b;
    public final o5 f4016c;
    public s5 d;
    public boolean f4017e;

    public y5(int i7, long j3) {
        this.f4014a = i7;
        m8 m8Var = new m8(i7, 0L, false);
        this.f4015b = m8Var;
        m8Var.f9055p = j3;
        o5 o5Var = new o5(i7, j3, new ai.f0(this, 2));
        o5Var.f3770s = true;
        this.f4016c = o5Var;
    }

    public final void a() {
        if (this.f4017e) {
            return;
        }
        ns.f(this.f4014a).c(this, ns.G3);
        this.f4015b.a();
        this.f4016c.g(false);
        this.f4017e = true;
    }

    public final void b() {
        if (!this.f4017e) {
            return;
        }
        ns.f(this.f4014a).n(this, ns.G3);
        this.f4015b.f();
        this.f4016c.f();
        this.f4017e = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        s5 s5Var;
        if (i7 == ns.G3 && objArr[1] == this.f4015b && (s5Var = this.d) != null) {
            s5Var.run();
        }
    }
}
