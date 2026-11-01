package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class q3 implements RequestDelegate {
    public final int f17737a;
    public final boolean f17738b;
    public final Object f17739c;
    public final Object d;

    public q3(Object obj, Object obj2, boolean z10, int i10) {
        this.f17737a = i10;
        this.f17739c = obj;
        this.d = obj2;
        this.f17738b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17737a) {
            case 0:
                i0.g3(new bi.n4((u3) this.f17739c, this.f17738b, tLObject, (TL_phone.getGroupParticipants) this.d, 7));
                return;
            case 1:
                i0.g3(new bi.n4((vi) this.f17739c, tL_error, tLObject, (String) this.d, this.f17738b));
                return;
            case 2:
                i0.g3(new bi.n4((vi) this.f17739c, tLObject, (SharedPreferences) this.d, this.f17738b, 14));
                return;
            case 3:
                wp wpVar = (wp) this.f17739c;
                wpVar.getClass();
                i0.g3(new bi.n4(wpVar, tLObject, this.f17738b, (TLRPC.TL_contacts_getBlocked) this.d, 16));
                return;
            default:
                i0.g3(new bi.n4((zo) this.f17739c, (int[]) this.d, tLObject, this.f17738b, 18));
                return;
        }
    }

    public q3(Object obj, boolean z10, TLObject tLObject, int i10) {
        this.f17737a = i10;
        this.f17739c = obj;
        this.f17738b = z10;
        this.d = tLObject;
    }
}
