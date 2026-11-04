package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n3 implements RequestDelegate {
    public final int f24305a;
    public final boolean f24306b;
    public final Object f24307c;
    public final Object d;

    public n3(Object obj, Object obj2, boolean z10, int i3) {
        this.f24305a = i3;
        this.f24307c = obj;
        this.d = obj2;
        this.f24306b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24305a) {
            case 0:
                g0.h3(new ci.u8((r3) this.f24307c, this.f24306b, tLObject, (TL_phone.getGroupParticipants) this.d));
                return;
            case 1:
                g0.h3(new ci.u8((li) this.f24307c, tL_error, tLObject, (String) this.d, this.f24306b));
                return;
            case 2:
                g0.h3(new ci.u8((Object) ((li) this.f24307c), tLObject, (Object) ((SharedPreferences) this.d), this.f24306b, 16));
                return;
            case 3:
                hp hpVar = (hp) this.f24307c;
                hpVar.getClass();
                g0.h3(new ci.u8(hpVar, tLObject, this.f24306b, (TLRPC.TL_contacts_getBlocked) this.d));
                return;
            default:
                g0.h3(new ci.u8((ko) this.f24307c, (int[]) this.d, tLObject, this.f24306b, 20));
                return;
        }
    }

    public n3(Object obj, boolean z10, TLObject tLObject, int i3) {
        this.f24305a = i3;
        this.f24307c = obj;
        this.f24306b = z10;
        this.d = tLObject;
    }
}
