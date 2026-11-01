package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jo0;
public final class mn implements RequestDelegate {
    public final int f17157a = 0;
    public final int f17158b;
    public final boolean f17159c;
    public final TLRPC.User d;
    public final vs e;
    public final Object f17160f;

    public mn(wp wpVar, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = wpVar;
        this.f17158b = i10;
        this.f17160f = chat;
        this.d = user;
        this.f17159c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10;
        switch (this.f17157a) {
            case 0:
                wp wpVar = (wp) this.e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f17160f;
                wpVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.f17158b));
                    is messagesStorage = wpVar.getMessagesStorage();
                    if (chat != null) {
                        j10 = -chat.f19794id;
                    } else {
                        j10 = this.d.f19943id;
                    }
                    messagesStorage.c2(j10, arrayList, !this.f17159c, -1, 0, false, null);
                    wpVar.L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                i0.g3(new bi.y2((jo0) this.e, (String) this.f17160f, this.f17158b, tLObject, this.f17159c, this.d));
                return;
        }
    }

    public mn(jo0 jo0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = jo0Var;
        this.f17160f = str;
        this.f17158b = i10;
        this.f17159c = z10;
        this.d = user;
    }
}
