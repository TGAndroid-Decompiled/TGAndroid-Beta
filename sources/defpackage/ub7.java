package defpackage;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class ub7 extends b71 {
    public final uc7 e;

    public ub7(uc7 uc7Var) {
        this.e = uc7Var;
    }

    @Override
    public final boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }

    @Override
    public final void e(int i, Object obj, icc iccVar) {
        Integer num = (Integer) obj;
        this.e.getMessagesStorage().a.c(new qb7(i, (f) iccVar, (byte) 1));
    }

    @Override
    public final void f(int i, Object obj, long j, a71 a71Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j;
        this.e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new rb7(a71Var, (byte) 1));
    }

    @Override
    public final void g(int i, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        jf7.Y(i).a.c(new hl3(i, (TLRPC.messages_AvailableEffects) obj2, (byte) 26));
    }

    @Override
    public final void h(int i, long j) {
        SharedPreferences.Editor edit = this.e.X3.edit();
        edit.putLong("effects_last_" + i, j).apply();
    }
}
