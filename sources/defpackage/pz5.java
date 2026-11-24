package defpackage;

import org.telegram.tgnet.TLRPC;
public final class pz5 implements wc2 {
    public final cj3 a;
    public final int b;

    public pz5(cj3 cj3Var, int i) {
        this.a = cj3Var;
        this.b = i;
    }

    @Override
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        kk7.f(this.b).k(kk7.s, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
