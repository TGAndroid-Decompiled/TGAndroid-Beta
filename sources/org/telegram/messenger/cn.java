package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.an0;
public final class cn implements RequestDelegate {
    public final int f21907a = 0;
    public final int f21908b;
    public final boolean f21909c;
    public final TLRPC.User d;
    public final ls f21910e;
    public final Object f21911f;

    public cn(qp qpVar, int i7, TLRPC.Chat chat, TLRPC.User user, boolean z9) {
        this.f21910e = qpVar;
        this.f21908b = i7;
        this.f21911f = chat;
        this.d = user;
        this.f21909c = z9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        switch (this.f21907a) {
            case 0:
                qp qpVar = (qp) this.f21910e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f21911f;
                qpVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.f21908b));
                    yr messagesStorage = qpVar.getMessagesStorage();
                    if (chat != null) {
                        j3 = -chat.f26960id;
                    } else {
                        j3 = this.d.f27109id;
                    }
                    messagesStorage.c2(j3, arrayList, !this.f21909c, -1, 0, false, null);
                    qpVar.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                g0.h3(new li.p2((an0) this.f21910e, (String) this.f21911f, this.f21908b, tLObject, this.f21909c, this.d));
                return;
        }
    }

    public cn(an0 an0Var, String str, int i7, boolean z9, TLRPC.User user) {
        this.f21910e = an0Var;
        this.f21911f = str;
        this.f21908b = i7;
        this.f21909c = z9;
        this.d = user;
    }
}
