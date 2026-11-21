package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class p3 implements RequestDelegate {
    public final int f26211a;
    public final boolean f26212b;
    public final Object f26213c;
    public final Object d;

    public p3(Object obj, Object obj2, boolean z10, int i7) {
        this.f26211a = i7;
        this.f26213c = obj;
        this.d = obj2;
        this.f26212b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26211a) {
            case 0:
                g0.g3(new aa.c0((t3) this.f26213c, this.f26212b, tLObject, (TL_phone.getGroupParticipants) this.d, 9));
                return;
            case 1:
                g0.g3(new aa.c0((ri) this.f26213c, tL_error, tLObject, (String) this.d, this.f26212b));
                return;
            case 2:
                g0.g3(new aa.c0((ri) this.f26213c, tLObject, (SharedPreferences) this.d, this.f26212b, 16));
                return;
            case 3:
                mp mpVar = (mp) this.f26213c;
                mpVar.getClass();
                g0.g3(new aa.c0(mpVar, tLObject, this.f26212b, (TLRPC.TL_contacts_getBlocked) this.d, 18));
                return;
            default:
                g0.g3(new aa.c0((po) this.f26213c, (int[]) this.d, tLObject, this.f26212b, 20));
                return;
        }
    }

    public p3(Object obj, boolean z10, TLObject tLObject, int i7) {
        this.f26211a = i7;
        this.f26213c = obj;
        this.f26212b = z10;
        this.d = tLObject;
    }
}
