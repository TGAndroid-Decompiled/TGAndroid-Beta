package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class po extends x2 {
    public final qp f24600e;

    public po(qp qpVar) {
        this.f24600e = qpVar;
    }

    @Override
    public final boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }

    @Override
    public final void e(int i7, Object obj, v10 v10Var) {
        Integer num = (Integer) obj;
        this.f24600e.getMessagesStorage().f26696a.c(new lo(i7, (v2) v10Var, 1));
    }

    @Override
    public final void f(int i7, Object obj, long j3, w2 w2Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j3;
        this.f24600e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new mo(w2Var, 1));
    }

    @Override
    public final void g(int i7, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        yr.a0(i7).f26696a.c(new x0(i7, (TLRPC.messages_AvailableEffects) obj2, 6));
    }

    @Override
    public final void h(int i7, long j3) {
        SharedPreferences.Editor edit = this.f24600e.f24767e7.edit();
        edit.putLong("effects_last_" + i7, j3).apply();
    }
}
