package defpackage;

import org.telegram.tgnet.TLRPC;
public final class dd0 extends yc0 {
    @Override
    public final void a() {
        oc7.r1(z8c.t0).k3(this.d, (TLRPC.User) this.c, false);
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
