package defpackage;

import org.telegram.tgnet.TLRPC;
public final class l97 extends t61 {
    public final na7 e;

    public l97(na7 na7Var) {
        this.e = na7Var;
    }

    @Override
    public final void e(int i, Object obj, i8c i8cVar) {
        Integer num = (Integer) obj;
        this.e.getMessagesStorage().a.c(new j97(i, (e) i8cVar, (byte) 0));
    }

    @Override
    public final void f(int i, Object obj, long j, s61 s61Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j;
        this.e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new k97(s61Var, (byte) 0));
    }

    @Override
    public final void g(int i, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        ad7.Y(i).a.c(new sm3(i, (TLRPC.TL_help_appConfig) obj2, (byte) 23));
    }

    @Override
    public final boolean j(Object obj) {
        Integer num = (Integer) obj;
        return false;
    }
}
