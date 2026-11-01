package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class vo extends b3 {
    public final wp e;

    public vo(wp wpVar) {
        this.e = wpVar;
    }

    @Override
    public final boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }

    @Override
    public final void e(int i10, Object obj, k20 k20Var) {
        Integer num = (Integer) obj;
        this.e.getMessagesStorage().f16331a.c(new ro(i10, (z2) k20Var, 1));
    }

    @Override
    public final void f(int i10, Object obj, long j10, a3 a3Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j10;
        this.e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new so(a3Var, 1));
    }

    @Override
    public final void g(int i10, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        is.a0(i10).f16331a.c(new a1(i10, (TLRPC.messages_AvailableEffects) obj2, 6));
    }

    @Override
    public final void h(int i10, long j10) {
        SharedPreferences.Editor edit = this.e.f7.edit();
        edit.putLong("effects_last_" + i10, j10).apply();
    }
}
