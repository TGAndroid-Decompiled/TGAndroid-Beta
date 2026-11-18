package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cn0;
public final class an implements RequestDelegate {
    public final int f22923a = 0;
    public final int f22924b;
    public final boolean f22925c;
    public final TLRPC.User d;
    public final fs f22926e;
    public final Object f22927f;

    public an(mp mpVar, int i7, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f22926e = mpVar;
        this.f22924b = i7;
        this.f22927f = chat;
        this.d = user;
        this.f22925c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        switch (this.f22923a) {
            case 0:
                mp mpVar = (mp) this.f22926e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f22927f;
                mpVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.f22924b));
                    tr messagesStorage = mpVar.getMessagesStorage();
                    if (chat != null) {
                        j3 = -chat.f28403id;
                    } else {
                        j3 = this.d.f28552id;
                    }
                    messagesStorage.c2(j3, arrayList, !this.f22925c, -1, 0, false, null);
                    mpVar.V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                g0.g3(new oi.o2((cn0) this.f22926e, (String) this.f22927f, this.f22924b, tLObject, this.f22925c, this.d));
                return;
        }
    }

    public an(cn0 cn0Var, String str, int i7, boolean z10, TLRPC.User user) {
        this.f22926e = cn0Var;
        this.f22927f = str;
        this.f22924b = i7;
        this.f22925c = z10;
        this.d = user;
    }
}
