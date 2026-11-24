package defpackage;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class ob7 extends a81 {
    public final oc7 e;

    public ob7(oc7 oc7Var) {
        this.e = oc7Var;
    }

    @Override
    public final boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }

    @Override
    public final void e(int i, Object obj, jac jacVar) {
        Integer num = (Integer) obj;
        this.e.getMessagesStorage().a.c(new kb7(i, (e) jacVar, (byte) 1));
    }

    @Override
    public final void f(int i, Object obj, long j, z71 z71Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j;
        this.e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new lb7(z71Var, (byte) 1));
    }

    @Override
    public final void g(int i, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        cf7.Y(i).a.c(new bm3(i, (TLRPC.messages_AvailableEffects) obj2, (byte) 26));
    }

    @Override
    public final void h(int i, long j) {
        SharedPreferences.Editor edit = this.e.X3.edit();
        edit.putLong("effects_last_" + i, j).apply();
    }
}
