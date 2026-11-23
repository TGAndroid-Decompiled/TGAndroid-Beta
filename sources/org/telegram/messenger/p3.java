package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class p3 implements RequestDelegate {
    public final int f26264a;
    public final boolean f26265b;
    public final Object f26266c;
    public final Object d;

    public p3(Object obj, Object obj2, boolean z10, int i7) {
        this.f26264a = i7;
        this.f26266c = obj;
        this.d = obj2;
        this.f26265b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26264a) {
            case 0:
                g0.g3(new aa.c0((t3) this.f26266c, this.f26265b, tLObject, (TL_phone.getGroupParticipants) this.d, 9));
                return;
            case 1:
                g0.g3(new aa.c0((si) this.f26266c, tL_error, tLObject, (String) this.d, this.f26265b));
                return;
            case 2:
                g0.g3(new aa.c0((si) this.f26266c, tLObject, (SharedPreferences) this.d, this.f26265b, 16));
                return;
            case 3:
                np npVar = (np) this.f26266c;
                npVar.getClass();
                g0.g3(new aa.c0(npVar, tLObject, this.f26265b, (TLRPC.TL_contacts_getBlocked) this.d, 18));
                return;
            default:
                g0.g3(new aa.c0((qo) this.f26266c, (int[]) this.d, tLObject, this.f26265b, 20));
                return;
        }
    }

    public p3(Object obj, boolean z10, TLObject tLObject, int i7) {
        this.f26264a = i7;
        this.f26266c = obj;
        this.f26265b = z10;
        this.d = tLObject;
    }
}
