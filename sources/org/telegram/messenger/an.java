package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.an0;
public final class an implements RequestDelegate {
    public final int f23034a = 0;
    public final int f23035b;
    public final boolean f23036c;
    public final TLRPC.User d;
    public final fs f23037e;
    public final Object f23038f;

    public an(mp mpVar, int i7, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f23037e = mpVar;
        this.f23035b = i7;
        this.f23038f = chat;
        this.d = user;
        this.f23036c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        switch (this.f23034a) {
            case 0:
                mp mpVar = (mp) this.f23037e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f23038f;
                mpVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.f23035b));
                    tr messagesStorage = mpVar.getMessagesStorage();
                    if (chat != null) {
                        j3 = -chat.f28492id;
                    } else {
                        j3 = this.d.f28641id;
                    }
                    messagesStorage.c2(j3, arrayList, !this.f23036c, -1, 0, false, null);
                    mpVar.V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                g0.g3(new oi.q2((an0) this.f23037e, (String) this.f23038f, this.f23035b, tLObject, this.f23036c, this.d));
                return;
        }
    }

    public an(an0 an0Var, String str, int i7, boolean z10, TLRPC.User user) {
        this.f23037e = an0Var;
        this.f23038f = str;
        this.f23035b = i7;
        this.f23036c = z10;
        this.d = user;
    }
}
