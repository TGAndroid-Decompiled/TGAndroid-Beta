package defpackage;

import org.telegram.tgnet.TLRPC;
public final class sb7 extends b71 {
    public final uc7 e;

    public sb7(uc7 uc7Var) {
        this.e = uc7Var;
    }

    @Override
    public final void e(int i, Object obj, icc iccVar) {
        Integer num = (Integer) obj;
        this.e.getMessagesStorage().a.c(new qb7(i, (f) iccVar, (byte) 0));
    }

    @Override
    public final void f(int i, Object obj, long j, a71 a71Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j;
        this.e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new rb7(a71Var, (byte) 0));
    }

    @Override
    public final void g(int i, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        jf7.Y(i).a.c(new hl3(i, (TLRPC.TL_help_appConfig) obj2, (byte) 25));
    }

    @Override
    public final boolean j(Object obj) {
        Integer num = (Integer) obj;
        return false;
    }
}
