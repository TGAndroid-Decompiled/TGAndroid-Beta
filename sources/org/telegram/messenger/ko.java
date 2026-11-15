package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ko extends x2 {
    public final np f24738e;

    public ko(np npVar) {
        this.f24738e = npVar;
    }

    @Override
    public final void e(int i7, Object obj, s10 s10Var) {
        Integer num = (Integer) obj;
        this.f24738e.getMessagesStorage().f27219a.c(new io(i7, (v2) s10Var, 0));
    }

    @Override
    public final void f(int i7, Object obj, long j3, w2 w2Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j3;
        this.f24738e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new jo(w2Var, 0));
    }

    @Override
    public final void g(int i7, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        vr.a0(i7).f27219a.c(new x0(i7, (TLRPC.TL_help_appConfig) obj2, 5));
    }

    @Override
    public final boolean j(Object obj) {
        Integer num = (Integer) obj;
        return false;
    }
}
