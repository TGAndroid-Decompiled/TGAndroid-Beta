package defpackage;

import org.telegram.tgnet.TLRPC;
public final class p16 implements he2 {
    public final nk3 a;
    public final int b;

    public p16(nk3 nk3Var, int i) {
        this.a = nk3Var;
        this.b = i;
    }

    @Override
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        nm7.f(this.b).k(nm7.s, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
