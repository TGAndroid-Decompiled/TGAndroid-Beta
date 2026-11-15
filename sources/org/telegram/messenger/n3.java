package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n3 implements RequestDelegate {
    public final int f25146a;
    public final boolean f25147b;
    public final Object f25148c;
    public final Object d;

    public n3(Object obj, Object obj2, boolean z10, int i7) {
        this.f25146a = i7;
        this.f25148c = obj;
        this.d = obj2;
        this.f25147b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25146a) {
            case 0:
                g0.h3(new aa.c0((r3) this.f25148c, this.f25147b, tLObject, (TL_phone.getGroupParticipants) this.d, 9));
                return;
            case 1:
                g0.h3(new aa.c0((si) this.f25148c, tL_error, tLObject, (String) this.d, this.f25147b));
                return;
            case 2:
                g0.h3(new aa.c0((si) this.f25148c, tLObject, (SharedPreferences) this.d, this.f25147b, 16));
                return;
            case 3:
                np npVar = (np) this.f25148c;
                npVar.getClass();
                g0.h3(new aa.c0(npVar, tLObject, this.f25147b, (TLRPC.TL_contacts_getBlocked) this.d, 18));
                return;
            default:
                g0.h3(new aa.c0((qo) this.f25148c, (int[]) this.d, tLObject, this.f25147b, 20));
                return;
        }
    }

    public n3(Object obj, boolean z10, TLObject tLObject, int i7) {
        this.f25146a = i7;
        this.f25148c = obj;
        this.f25147b = z10;
        this.d = tLObject;
    }
}
