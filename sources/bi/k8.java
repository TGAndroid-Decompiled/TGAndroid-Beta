package bi;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public final class k8 implements fs {
    public final int f3764a;
    public final di.p8 f3765b;
    public final a8 f3766c;
    public e8 d;
    public boolean f3767e;

    public k8(int i7, long j3) {
        this.f3764a = i7;
        di.p8 p8Var = new di.p8(i7, 0L, false);
        this.f3765b = p8Var;
        p8Var.f9517p = j3;
        a8 a8Var = new a8(i7, j3, new ai.d0(this, 4));
        a8Var.f3381x = true;
        this.f3766c = a8Var;
    }

    public final void a() {
        if (this.f3767e) {
            return;
        }
        ks.f(this.f3764a).c(this, ks.I3);
        this.f3765b.a();
        this.f3766c.l(false);
        this.f3767e = true;
    }

    public final void b() {
        if (!this.f3767e) {
            return;
        }
        ks.f(this.f3764a).n(this, ks.I3);
        this.f3765b.f();
        this.f3766c.i();
        this.f3767e = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        e8 e8Var;
        if (i7 == ks.I3 && objArr[1] == this.f3765b && (e8Var = this.d) != null) {
            e8Var.run();
        }
    }
}
