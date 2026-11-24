package defpackage;

import org.telegram.tgnet.TLRPC;
public final class dc0 extends yb0 {
    @Override
    public final void a() {
        na7.q1(y6c.t0).h3(this.d, (TLRPC.User) this.c, false);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.c).id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z = this.g;
            if (z) {
                if (z) {
                    this.g = false;
                    this.b.n(this.a, this.e);
                }
                this.f.accept(userFull);
            }
        }
    }
}
