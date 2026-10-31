package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class so extends b3 {
    public final vp e;

    public so(vp vpVar) {
        this.e = vpVar;
    }

    @Override
    public final void e(int i10, Object obj, j20 j20Var) {
        Integer num = (Integer) obj;
        this.e.getMessagesStorage().f15938a.c(new qo(i10, (z2) j20Var, 0));
    }

    @Override
    public final void f(int i10, Object obj, long j10, a3 a3Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j10;
        this.e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new ro(a3Var, 0));
    }

    @Override
    public final void g(int i10, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        hs.a0(i10).f15938a.c(new a1(i10, (TLRPC.TL_help_appConfig) obj2, 5));
    }

    @Override
    public final boolean j(Object obj) {
        Integer num = (Integer) obj;
        return false;
    }
}
