package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n3 implements RequestDelegate {
    public final int f24131a;
    public final boolean f24132b;
    public final Object f24133c;
    public final Object d;

    public n3(Object obj, Object obj2, boolean z9, int i7) {
        this.f24131a = i7;
        this.f24133c = obj;
        this.d = obj2;
        this.f24132b = z9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24131a) {
            case 0:
                g0.h3(new aa.d0((r3) this.f24133c, this.f24132b, tLObject, (TL_phone.getGroupParticipants) this.d, 9));
                return;
            case 1:
                g0.h3(new aa.d0((ui) this.f24133c, tL_error, tLObject, (String) this.d, this.f24132b));
                return;
            case 2:
                g0.h3(new aa.d0((ui) this.f24133c, tLObject, (SharedPreferences) this.d, this.f24132b, 16));
                return;
            case 3:
                qp qpVar = (qp) this.f24133c;
                qpVar.getClass();
                g0.h3(new aa.d0(qpVar, tLObject, this.f24132b, (TLRPC.TL_contacts_getBlocked) this.d, 18));
                return;
            default:
                g0.h3(new aa.d0((to) this.f24133c, (int[]) this.d, tLObject, this.f24132b, 20));
                return;
        }
    }

    public n3(Object obj, boolean z9, TLObject tLObject, int i7) {
        this.f24131a = i7;
        this.f24133c = obj;
        this.f24132b = z9;
        this.d = tLObject;
    }
}
