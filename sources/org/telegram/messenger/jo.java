package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jo extends y2 {
    public final mp f24904e;

    public jo(mp mpVar) {
        this.f24904e = mpVar;
    }

    @Override
    public final void e(int i7, Object obj, q10 q10Var) {
        Integer num = (Integer) obj;
        this.f24904e.getMessagesStorage().f27054a.c(new ho(i7, (w2) q10Var, 0));
    }

    @Override
    public final void f(int i7, Object obj, long j3, x2 x2Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j3;
        this.f24904e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new io(x2Var, 0));
    }

    @Override
    public final void g(int i7, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        tr.a0(i7).f27054a.c(new x0(i7, (TLRPC.TL_help_appConfig) obj2, 5));
    }

    @Override
    public final boolean j(Object obj) {
        Integer num = (Integer) obj;
        return false;
    }
}
