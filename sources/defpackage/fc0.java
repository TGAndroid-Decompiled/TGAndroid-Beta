package defpackage;

import org.telegram.tgnet.TLRPC;
public final class fc0 extends ac0 {
    @Override
    public final void a() {
        uc7.s1(yac.t0).o3(this.d, (TLRPC.User) this.c, false);
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
