package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n3 implements RequestDelegate {
    public final int f24127a;
    public final boolean f24128b;
    public final Object f24129c;
    public final Object d;

    public n3(Object obj, Object obj2, boolean z9, int i7) {
        this.f24127a = i7;
        this.f24129c = obj;
        this.d = obj2;
        this.f24128b = z9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24127a) {
            case 0:
                g0.h3(new aa.d0((r3) this.f24129c, this.f24128b, tLObject, (TL_phone.getGroupParticipants) this.d, 9));
                return;
            case 1:
                g0.h3(new aa.d0((ui) this.f24129c, tL_error, tLObject, (String) this.d, this.f24128b));
                return;
            case 2:
                g0.h3(new aa.d0((ui) this.f24129c, tLObject, (SharedPreferences) this.d, this.f24128b, 16));
                return;
            case 3:
                qp qpVar = (qp) this.f24129c;
                qpVar.getClass();
                g0.h3(new aa.d0(qpVar, tLObject, this.f24128b, (TLRPC.TL_contacts_getBlocked) this.d, 18));
                return;
            default:
                g0.h3(new aa.d0((to) this.f24129c, (int[]) this.d, tLObject, this.f24128b, 20));
                return;
        }
    }

    public n3(Object obj, boolean z9, TLObject tLObject, int i7) {
        this.f24127a = i7;
        this.f24129c = obj;
        this.f24128b = z9;
        this.d = tLObject;
    }
}
