package defpackage;

import org.telegram.tgnet.TLRPC;
public final class mb7 extends a81 {
    public final oc7 e;

    public mb7(oc7 oc7Var) {
        this.e = oc7Var;
    }

    @Override
    public final void e(int i, Object obj, jac jacVar) {
        Integer num = (Integer) obj;
        this.e.getMessagesStorage().a.c(new kb7(i, (e) jacVar, (byte) 0));
    }

    @Override
    public final void f(int i, Object obj, long j, z71 z71Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j;
        this.e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new lb7(z71Var, (byte) 0));
    }

    @Override
    public final void g(int i, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        cf7.Y(i).a.c(new bm3(i, (TLRPC.TL_help_appConfig) obj2, (byte) 25));
    }

    @Override
    public final boolean j(Object obj) {
        Integer num = (Integer) obj;
        return false;
    }
}
