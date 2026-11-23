package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class lo extends y2 {
    public final mp f25533e;

    public lo(mp mpVar) {
        this.f25533e = mpVar;
    }

    @Override
    public final boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }

    @Override
    public final void e(int i7, Object obj, p10 p10Var) {
        Integer num = (Integer) obj;
        this.f25533e.getMessagesStorage().f27149a.c(new ho(i7, (w2) p10Var, 1));
    }

    @Override
    public final void f(int i7, Object obj, long j3, x2 x2Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j3;
        this.f25533e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new io(x2Var, 1));
    }

    @Override
    public final void g(int i7, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        tr.a0(i7).f27149a.c(new x0(i7, (TLRPC.messages_AvailableEffects) obj2, 6));
    }

    @Override
    public final void h(int i7, long j3) {
        SharedPreferences.Editor edit = this.f25533e.h7.edit();
        edit.putLong("effects_last_" + i7, j3).apply();
    }
}
