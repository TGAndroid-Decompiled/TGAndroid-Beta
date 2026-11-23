package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class p3 implements RequestDelegate {
    public final int f26228a;
    public final boolean f26229b;
    public final Object f26230c;
    public final Object d;

    public p3(Object obj, Object obj2, boolean z10, int i7) {
        this.f26228a = i7;
        this.f26230c = obj;
        this.d = obj2;
        this.f26229b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26228a) {
            case 0:
                g0.g3(new aa.c0((t3) this.f26230c, this.f26229b, tLObject, (TL_phone.getGroupParticipants) this.d, 9));
                return;
            case 1:
                g0.g3(new aa.c0((si) this.f26230c, tL_error, tLObject, (String) this.d, this.f26229b));
                return;
            case 2:
                g0.g3(new aa.c0((si) this.f26230c, tLObject, (SharedPreferences) this.d, this.f26229b, 16));
                return;
            case 3:
                np npVar = (np) this.f26230c;
                npVar.getClass();
                g0.g3(new aa.c0(npVar, tLObject, this.f26229b, (TLRPC.TL_contacts_getBlocked) this.d, 18));
                return;
            default:
                g0.g3(new aa.c0((qo) this.f26230c, (int[]) this.d, tLObject, this.f26229b, 20));
                return;
        }
    }

    public p3(Object obj, boolean z10, TLObject tLObject, int i7) {
        this.f26228a = i7;
        this.f26230c = obj;
        this.f26229b = z10;
        this.d = tLObject;
    }
}
