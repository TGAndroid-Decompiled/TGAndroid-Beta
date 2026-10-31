package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class q3 implements RequestDelegate {
    public final int f17549a;
    public final boolean f17550b;
    public final Object f17551c;
    public final Object d;

    public q3(Object obj, Object obj2, boolean z10, int i10) {
        this.f17549a = i10;
        this.f17551c = obj;
        this.d = obj2;
        this.f17550b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17549a) {
            case 0:
                i0.g3(new bi.n4((u3) this.f17551c, this.f17550b, tLObject, (TL_phone.getGroupParticipants) this.d, 7));
                return;
            case 1:
                i0.g3(new bi.n4((ui) this.f17551c, tL_error, tLObject, (String) this.d, this.f17550b));
                return;
            case 2:
                i0.g3(new bi.n4((ui) this.f17551c, tLObject, (SharedPreferences) this.d, this.f17550b, 14));
                return;
            case 3:
                vp vpVar = (vp) this.f17551c;
                vpVar.getClass();
                i0.g3(new bi.n4(vpVar, tLObject, this.f17550b, (TLRPC.TL_contacts_getBlocked) this.d, 16));
                return;
            default:
                i0.g3(new bi.n4((yo) this.f17551c, (int[]) this.d, tLObject, this.f17550b, 18));
                return;
        }
    }

    public q3(Object obj, boolean z10, TLObject tLObject, int i10) {
        this.f17549a = i10;
        this.f17551c = obj;
        this.f17550b = z10;
        this.d = tLObject;
    }
}
