package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class fo extends x2 {
    public final hp f22536e;

    public fo(hp hpVar) {
        this.f22536e = hpVar;
    }

    @Override
    public final boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }

    @Override
    public final void e(int i3, Object obj, n10 n10Var) {
        Integer num = (Integer) obj;
        this.f22536e.getMessagesStorage().f24934a.c(new ao(i3, (v2) n10Var, 1));
    }

    @Override
    public final void f(int i3, Object obj, long j10, w2 w2Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j10;
        this.f22536e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new bo(w2Var, 1));
    }

    @Override
    public final void g(int i3, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        qr.a0(i3).f24934a.c(new x0(i3, (TLRPC.messages_AvailableEffects) obj2, 6));
    }

    @Override
    public final void h(int i3, long j10) {
        SharedPreferences.Editor edit = this.f22536e.f22999e7.edit();
        edit.putLong("effects_last_" + i3, j10).apply();
    }
}
