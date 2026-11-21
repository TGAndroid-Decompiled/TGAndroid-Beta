package bi;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public final class i8 implements fs {
    public final int f3729a;
    public final di.p8 f3730b;
    public final y7 f3731c;
    public c8 d;
    public boolean f3732e;

    public i8(int i7, long j3) {
        this.f3729a = i7;
        di.p8 p8Var = new di.p8(i7, 0L, false);
        this.f3730b = p8Var;
        p8Var.f9553p = j3;
        y7 y7Var = new y7(i7, j3, new ai.h0(this, 4));
        y7Var.f4313x = true;
        this.f3731c = y7Var;
    }

    public final void a() {
        if (this.f3732e) {
            return;
        }
        ks.f(this.f3729a).c(this, ks.I3);
        this.f3730b.a();
        this.f3731c.l(false);
        this.f3732e = true;
    }

    public final void b() {
        if (!this.f3732e) {
            return;
        }
        ks.f(this.f3729a).n(this, ks.I3);
        this.f3730b.f();
        this.f3731c.i();
        this.f3732e = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c8 c8Var;
        if (i7 == ks.I3 && objArr[1] == this.f3730b && (c8Var = this.d) != null) {
            c8Var.run();
        }
    }
}
