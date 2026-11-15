package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class mo extends x2 {
    public final np f25078e;

    public mo(np npVar) {
        this.f25078e = npVar;
    }

    @Override
    public final boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }

    @Override
    public final void e(int i7, Object obj, s10 s10Var) {
        Integer num = (Integer) obj;
        this.f25078e.getMessagesStorage().f27220a.c(new io(i7, (v2) s10Var, 1));
    }

    @Override
    public final void f(int i7, Object obj, long j3, w2 w2Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j3;
        this.f25078e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new jo(w2Var, 1));
    }

    @Override
    public final void g(int i7, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        vr.a0(i7).f27220a.c(new x0(i7, (TLRPC.messages_AvailableEffects) obj2, 6));
    }

    @Override
    public final void h(int i7, long j3) {
        SharedPreferences.Editor edit = this.f25078e.f25280f7.edit();
        edit.putLong("effects_last_" + i7, j3).apply();
    }
}
