package ai;

import ci.v8;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
public final class g6 implements cs {
    public final int f664a;
    public final v8 f665b;
    public final w5 f666c;
    public a6 d;
    public boolean f667e;

    public g6(int i3, long j10) {
        this.f664a = i3;
        v8 v8Var = new v8(i3, 0L, false);
        this.f665b = v8Var;
        v8Var.f6207p = j10;
        w5 w5Var = new w5(i3, j10, new v2(this, 2));
        w5Var.f1083s = true;
        this.f666c = w5Var;
    }

    public final void a() {
        if (this.f667e) {
            return;
        }
        hs.f(this.f664a).c(this, hs.G3);
        this.f665b.a();
        this.f666c.g(false);
        this.f667e = true;
    }

    public final void b() {
        if (!this.f667e) {
            return;
        }
        hs.f(this.f664a).n(this, hs.G3);
        this.f665b.f();
        this.f666c.f();
        this.f667e = false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        a6 a6Var;
        if (i3 == hs.G3 && objArr[1] == this.f665b && (a6Var = this.d) != null) {
            a6Var.run();
        }
    }
}
