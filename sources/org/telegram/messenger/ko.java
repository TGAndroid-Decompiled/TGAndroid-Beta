package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ko extends y2 {
    public final np f25080e;

    public ko(np npVar) {
        this.f25080e = npVar;
    }

    @Override
    public final void e(int i7, Object obj, r10 r10Var) {
        Integer num = (Integer) obj;
        this.f25080e.getMessagesStorage().f27214a.c(new io(i7, (w2) r10Var, 0));
    }

    @Override
    public final void f(int i7, Object obj, long j3, x2 x2Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j3;
        this.f25080e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new jo(x2Var, 0));
    }

    @Override
    public final void g(int i7, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        ur.a0(i7).f27214a.c(new x0(i7, (TLRPC.TL_help_appConfig) obj2, 5));
    }

    @Override
    public final boolean j(Object obj) {
        Integer num = (Integer) obj;
        return false;
    }
}
