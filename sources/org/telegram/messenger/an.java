package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cn0;
public final class an implements RequestDelegate {
    public final int f22951a = 0;
    public final int f22952b;
    public final boolean f22953c;
    public final TLRPC.User d;
    public final fs f22954e;
    public final Object f22955f;

    public an(mp mpVar, int i7, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f22954e = mpVar;
        this.f22952b = i7;
        this.f22955f = chat;
        this.d = user;
        this.f22953c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        switch (this.f22951a) {
            case 0:
                mp mpVar = (mp) this.f22954e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f22955f;
                mpVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.f22952b));
                    tr messagesStorage = mpVar.getMessagesStorage();
                    if (chat != null) {
                        j3 = -chat.f28431id;
                    } else {
                        j3 = this.d.f28580id;
                    }
                    messagesStorage.c2(j3, arrayList, !this.f22953c, -1, 0, false, null);
                    mpVar.V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                g0.g3(new oi.q2((cn0) this.f22954e, (String) this.f22955f, this.f22952b, tLObject, this.f22953c, this.d));
                return;
        }
    }

    public an(cn0 cn0Var, String str, int i7, boolean z10, TLRPC.User user) {
        this.f22954e = cn0Var;
        this.f22955f = str;
        this.f22952b = i7;
        this.f22953c = z10;
        this.d = user;
    }
}
