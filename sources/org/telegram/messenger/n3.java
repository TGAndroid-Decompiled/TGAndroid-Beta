package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n3 implements RequestDelegate {
    public final int f25143a;
    public final boolean f25144b;
    public final Object f25145c;
    public final Object d;

    public n3(Object obj, Object obj2, boolean z10, int i7) {
        this.f25143a = i7;
        this.f25145c = obj;
        this.d = obj2;
        this.f25144b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25143a) {
            case 0:
                g0.h3(new aa.c0((r3) this.f25145c, this.f25144b, tLObject, (TL_phone.getGroupParticipants) this.d, 9));
                return;
            case 1:
                g0.h3(new aa.c0((si) this.f25145c, tL_error, tLObject, (String) this.d, this.f25144b));
                return;
            case 2:
                g0.h3(new aa.c0((si) this.f25145c, tLObject, (SharedPreferences) this.d, this.f25144b, 16));
                return;
            case 3:
                np npVar = (np) this.f25145c;
                npVar.getClass();
                g0.h3(new aa.c0(npVar, tLObject, this.f25144b, (TLRPC.TL_contacts_getBlocked) this.d, 18));
                return;
            default:
                g0.h3(new aa.c0((qo) this.f25145c, (int[]) this.d, tLObject, this.f25144b, 20));
                return;
        }
    }

    public n3(Object obj, boolean z10, TLObject tLObject, int i7) {
        this.f25143a = i7;
        this.f25145c = obj;
        this.f25144b = z10;
        this.d = tLObject;
    }
}
