package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zm0;
public final class cn implements RequestDelegate {
    public final int f21903a = 0;
    public final int f21904b;
    public final boolean f21905c;
    public final TLRPC.User d;
    public final ls f21906e;
    public final Object f21907f;

    public cn(qp qpVar, int i7, TLRPC.Chat chat, TLRPC.User user, boolean z9) {
        this.f21906e = qpVar;
        this.f21904b = i7;
        this.f21907f = chat;
        this.d = user;
        this.f21905c = z9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        switch (this.f21903a) {
            case 0:
                qp qpVar = (qp) this.f21906e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f21907f;
                qpVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.f21904b));
                    yr messagesStorage = qpVar.getMessagesStorage();
                    if (chat != null) {
                        j3 = -chat.f26956id;
                    } else {
                        j3 = this.d.f27105id;
                    }
                    messagesStorage.c2(j3, arrayList, !this.f21905c, -1, 0, false, null);
                    qpVar.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                g0.h3(new li.p2((zm0) this.f21906e, (String) this.f21907f, this.f21904b, tLObject, this.f21905c, this.d));
                return;
        }
    }

    public cn(zm0 zm0Var, String str, int i7, boolean z9, TLRPC.User user) {
        this.f21906e = zm0Var;
        this.f21907f = str;
        this.f21904b = i7;
        this.f21905c = z9;
        this.d = user;
    }
}
