package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lo0;
public final class ln implements RequestDelegate {
    public final int f16773a = 0;
    public final int f16774b;
    public final boolean f16775c;
    public final TLRPC.User d;
    public final us e;
    public final Object f16776f;

    public ln(vp vpVar, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = vpVar;
        this.f16774b = i10;
        this.f16776f = chat;
        this.d = user;
        this.f16775c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10;
        switch (this.f16773a) {
            case 0:
                vp vpVar = (vp) this.e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f16776f;
                vpVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.f16774b));
                    hs messagesStorage = vpVar.getMessagesStorage();
                    if (chat != null) {
                        j10 = -chat.f19793id;
                    } else {
                        j10 = this.d.f19942id;
                    }
                    messagesStorage.c2(j10, arrayList, !this.f16775c, -1, 0, false, null);
                    vpVar.L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                i0.g3(new bi.y2((lo0) this.e, (String) this.f16776f, this.f16774b, tLObject, this.f16775c, this.d));
                return;
        }
    }

    public ln(lo0 lo0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = lo0Var;
        this.f16776f = str;
        this.f16774b = i10;
        this.f16775c = z10;
        this.d = user;
    }
}
