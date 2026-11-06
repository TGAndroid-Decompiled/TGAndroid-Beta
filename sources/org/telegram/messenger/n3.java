package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n3 implements RequestDelegate {
    public final int f24114a;
    public final boolean f24115b;
    public final Object f24116c;
    public final Object d;

    public n3(Object obj, Object obj2, boolean z9, int i7) {
        this.f24114a = i7;
        this.f24116c = obj;
        this.d = obj2;
        this.f24115b = z9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24114a) {
            case 0:
                g0.h3(new aa.d0((r3) this.f24116c, this.f24115b, tLObject, (TL_phone.getGroupParticipants) this.d, 9));
                return;
            case 1:
                g0.h3(new aa.d0((ui) this.f24116c, tL_error, tLObject, (String) this.d, this.f24115b));
                return;
            case 2:
                g0.h3(new aa.d0((ui) this.f24116c, tLObject, (SharedPreferences) this.d, this.f24115b, 16));
                return;
            case 3:
                qp qpVar = (qp) this.f24116c;
                qpVar.getClass();
                g0.h3(new aa.d0(qpVar, tLObject, this.f24115b, (TLRPC.TL_contacts_getBlocked) this.d, 18));
                return;
            default:
                g0.h3(new aa.d0((to) this.f24116c, (int[]) this.d, tLObject, this.f24115b, 20));
                return;
        }
    }

    public n3(Object obj, boolean z9, TLObject tLObject, int i7) {
        this.f24114a = i7;
        this.f24116c = obj;
        this.f24115b = z9;
        this.d = tLObject;
    }
}
