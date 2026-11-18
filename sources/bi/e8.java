package bi;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public final class e8 implements fs {
    public final int f3552a;
    public final di.o8 f3553b;
    public final u7 f3554c;
    public y7 d;
    public boolean f3555e;

    public e8(int i7, long j3) {
        this.f3552a = i7;
        di.o8 o8Var = new di.o8(i7, 0L, false);
        this.f3553b = o8Var;
        o8Var.f9471p = j3;
        u7 u7Var = new u7(i7, j3, new ai.g0(this, 4));
        u7Var.f4107x = true;
        this.f3554c = u7Var;
    }

    public final void a() {
        if (this.f3555e) {
            return;
        }
        ks.f(this.f3552a).c(this, ks.I3);
        this.f3553b.a();
        this.f3554c.l(false);
        this.f3555e = true;
    }

    public final void b() {
        if (!this.f3555e) {
            return;
        }
        ks.f(this.f3552a).n(this, ks.I3);
        this.f3553b.f();
        this.f3554c.i();
        this.f3555e = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        y7 y7Var;
        if (i7 == ks.I3 && objArr[1] == this.f3553b && (y7Var = this.d) != null) {
            y7Var.run();
        }
    }
}
