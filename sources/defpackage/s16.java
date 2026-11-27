package defpackage;

import org.telegram.tgnet.TLRPC;
public final class s16 implements md2 {
    public final uj3 a;
    public final int b;

    public s16(uj3 uj3Var, int i) {
        this.a = uj3Var;
        this.b = i;
    }

    @Override
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        jn7.f(this.b).k(jn7.s, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
