package defpackage;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class n97 extends t61 {
    public final na7 e;

    public n97(na7 na7Var) {
        this.e = na7Var;
    }

    @Override
    public final boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }

    @Override
    public final void e(int i, Object obj, i8c i8cVar) {
        Integer num = (Integer) obj;
        this.e.getMessagesStorage().a.c(new j97(i, (e) i8cVar, (byte) 1));
    }

    @Override
    public final void f(int i, Object obj, long j, s61 s61Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j;
        this.e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new k97(s61Var, (byte) 1));
    }

    @Override
    public final void g(int i, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        ad7.Y(i).a.c(new sm3(i, (TLRPC.messages_AvailableEffects) obj2, (byte) 24));
    }

    @Override
    public final void h(int i, long j) {
        SharedPreferences.Editor edit = this.e.X3.edit();
        edit.putLong("effects_last_" + i, j).apply();
    }
}
