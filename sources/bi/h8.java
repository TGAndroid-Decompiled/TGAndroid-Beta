package bi;

import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
public final class h8 implements gs {
    public final int f3712a;
    public final di.p8 f3713b;
    public final x7 f3714c;
    public b8 d;
    public boolean f3715e;

    public h8(int i7, long j3) {
        this.f3712a = i7;
        di.p8 p8Var = new di.p8(i7, 0L, false);
        this.f3713b = p8Var;
        p8Var.f9556p = j3;
        x7 x7Var = new x7(i7, j3, new ai.h0(this, 4));
        x7Var.f4274x = true;
        this.f3714c = x7Var;
    }

    public final void a() {
        if (this.f3715e) {
            return;
        }
        ls.f(this.f3712a).c(this, ls.I3);
        this.f3713b.a();
        this.f3714c.l(false);
        this.f3715e = true;
    }

    public final void b() {
        if (!this.f3715e) {
            return;
        }
        ls.f(this.f3712a).n(this, ls.I3);
        this.f3713b.f();
        this.f3714c.i();
        this.f3715e = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        b8 b8Var;
        if (i7 == ls.I3 && objArr[1] == this.f3713b && (b8Var = this.d) != null) {
            b8Var.run();
        }
    }
}
