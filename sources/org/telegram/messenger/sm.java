package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sm0;
public final class sm implements RequestDelegate {
    public final int f25386a = 0;
    public final int f25387b;
    public final boolean f25388c;
    public final TLRPC.User d;
    public final cs f25389e;
    public final Object f25390f;

    public sm(hp hpVar, int i3, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f25389e = hpVar;
        this.f25387b = i3;
        this.f25390f = chat;
        this.d = user;
        this.f25388c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10;
        switch (this.f25386a) {
            case 0:
                hp hpVar = (hp) this.f25389e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f25390f;
                hpVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.f25387b));
                    qr messagesStorage = hpVar.getMessagesStorage();
                    if (chat != null) {
                        j10 = -chat.f27001id;
                    } else {
                        j10 = this.d.f27150id;
                    }
                    messagesStorage.c2(j10, arrayList, !this.f25388c, -1, 0, false, null);
                    hpVar.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                g0.h3(new mi.q2((sm0) this.f25389e, (String) this.f25390f, this.f25387b, tLObject, this.f25388c, this.d));
                return;
        }
    }

    public sm(sm0 sm0Var, String str, int i3, boolean z10, TLRPC.User user) {
        this.f25389e = sm0Var;
        this.f25390f = str;
        this.f25387b = i3;
        this.f25388c = z10;
        this.d = user;
    }
}
