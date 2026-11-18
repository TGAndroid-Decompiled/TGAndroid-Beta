package bi;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public final class f8 implements fs {
    public final int f3615a;
    public final di.o8 f3616b;
    public final v7 f3617c;
    public z7 d;
    public boolean f3618e;

    public f8(int i7, long j3) {
        this.f3615a = i7;
        di.o8 o8Var = new di.o8(i7, 0L, false);
        this.f3616b = o8Var;
        o8Var.f9474p = j3;
        v7 v7Var = new v7(i7, j3, new ai.g0(this, 4));
        v7Var.f4165x = true;
        this.f3617c = v7Var;
    }

    public final void a() {
        if (this.f3618e) {
            return;
        }
        ks.f(this.f3615a).c(this, ks.I3);
        this.f3616b.a();
        this.f3617c.l(false);
        this.f3618e = true;
    }

    public final void b() {
        if (!this.f3618e) {
            return;
        }
        ks.f(this.f3615a).n(this, ks.I3);
        this.f3616b.f();
        this.f3617c.i();
        this.f3618e = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        z7 z7Var;
        if (i7 == ks.I3 && objArr[1] == this.f3616b && (z7Var = this.d) != null) {
            z7Var.run();
        }
    }
}
