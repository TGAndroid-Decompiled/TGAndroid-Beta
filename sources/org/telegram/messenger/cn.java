package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xm0;
public final class cn implements RequestDelegate {
    public final int f21868a = 0;
    public final int f21869b;
    public final boolean f21870c;
    public final TLRPC.User d;
    public final ls f21871e;
    public final Object f21872f;

    public cn(qp qpVar, int i7, TLRPC.Chat chat, TLRPC.User user, boolean z9) {
        this.f21871e = qpVar;
        this.f21869b = i7;
        this.f21872f = chat;
        this.d = user;
        this.f21870c = z9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        switch (this.f21868a) {
            case 0:
                qp qpVar = (qp) this.f21871e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f21872f;
                qpVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.f21869b));
                    yr messagesStorage = qpVar.getMessagesStorage();
                    if (chat != null) {
                        j3 = -chat.f26952id;
                    } else {
                        j3 = this.d.f27101id;
                    }
                    messagesStorage.c2(j3, arrayList, !this.f21870c, -1, 0, false, null);
                    qpVar.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                g0.h3(new li.p2((xm0) this.f21871e, (String) this.f21872f, this.f21869b, tLObject, this.f21870c, this.d));
                return;
        }
    }

    public cn(xm0 xm0Var, String str, int i7, boolean z9, TLRPC.User user) {
        this.f21871e = xm0Var;
        this.f21872f = str;
        this.f21869b = i7;
        this.f21870c = z9;
        this.d = user;
    }
}
