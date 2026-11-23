package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cn0;
public final class bn implements RequestDelegate {
    public final int f23102a = 0;
    public final int f23103b;
    public final boolean f23104c;
    public final TLRPC.User d;
    public final gs f23105e;
    public final Object f23106f;

    public bn(np npVar, int i7, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f23105e = npVar;
        this.f23103b = i7;
        this.f23106f = chat;
        this.d = user;
        this.f23104c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        switch (this.f23102a) {
            case 0:
                np npVar = (np) this.f23105e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f23106f;
                npVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.f23103b));
                    ur messagesStorage = npVar.getMessagesStorage();
                    if (chat != null) {
                        j3 = -chat.f28398id;
                    } else {
                        j3 = this.d.f28547id;
                    }
                    messagesStorage.c2(j3, arrayList, !this.f23104c, -1, 0, false, null);
                    npVar.V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                g0.g3(new oi.o2((cn0) this.f23105e, (String) this.f23106f, this.f23103b, tLObject, this.f23104c, this.d));
                return;
        }
    }

    public bn(cn0 cn0Var, String str, int i7, boolean z10, TLRPC.User user) {
        this.f23105e = cn0Var;
        this.f23106f = str;
        this.f23103b = i7;
        this.f23104c = z10;
        this.d = user;
    }
}
