package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class uo extends b3 {
    public final vp e;

    public uo(vp vpVar) {
        this.e = vpVar;
    }

    @Override
    public final boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }

    @Override
    public final void e(int i10, Object obj, j20 j20Var) {
        Integer num = (Integer) obj;
        this.e.getMessagesStorage().f15938a.c(new qo(i10, (z2) j20Var, 1));
    }

    @Override
    public final void f(int i10, Object obj, long j10, a3 a3Var) {
        Integer num = (Integer) obj;
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j10;
        this.e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new ro(a3Var, 1));
    }

    @Override
    public final void g(int i10, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        hs.a0(i10).f15938a.c(new a1(i10, (TLRPC.messages_AvailableEffects) obj2, 6));
    }

    @Override
    public final void h(int i10, long j10) {
        SharedPreferences.Editor edit = this.e.f7.edit();
        edit.putLong("effects_last_" + i10, j10).apply();
    }
}
