package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class no extends x2 {
    public final qp f24202e;

    public no(qp qpVar) {
        this.f24202e = qpVar;
    }

    @Override
    public final void e(int i7, Object obj, v10 v10Var) {
        Integer num = (Integer) obj;
        this.f24202e.getMessagesStorage().f26688a.c(new lo(i7, (v2) v10Var, 0));
    }

    @Override
    public final void f(int i7, Object obj, long j3, w2 w2Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j3;
        this.f24202e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new mo(w2Var, 0));
    }

    @Override
    public final void g(int i7, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        yr.a0(i7).f26688a.c(new x0(i7, (TLRPC.TL_help_appConfig) obj2, 5));
    }

    @Override
    public final boolean j(Object obj) {
        Integer num = (Integer) obj;
        return false;
    }
}
