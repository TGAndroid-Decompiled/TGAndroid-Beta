package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class co extends x2 {
    public final hp f22050e;

    public co(hp hpVar) {
        this.f22050e = hpVar;
    }

    @Override
    public final void e(int i3, Object obj, n10 n10Var) {
        Integer num = (Integer) obj;
        this.f22050e.getMessagesStorage().f24934a.c(new ao(i3, (v2) n10Var, 0));
    }

    @Override
    public final void f(int i3, Object obj, long j10, w2 w2Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j10;
        this.f22050e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new bo(w2Var, 0));
    }

    @Override
    public final void g(int i3, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        qr.a0(i3).f24934a.c(new x0(i3, (TLRPC.TL_help_appConfig) obj2, 5));
    }

    @Override
    public final boolean j(Object obj) {
        Integer num = (Integer) obj;
        return false;
    }
}
