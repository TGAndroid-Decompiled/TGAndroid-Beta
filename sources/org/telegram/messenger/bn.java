package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cn0;
public final class bn implements RequestDelegate {
    public final int f23138a = 0;
    public final int f23139b;
    public final boolean f23140c;
    public final TLRPC.User d;
    public final gs f23141e;
    public final Object f23142f;

    public bn(np npVar, int i7, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f23141e = npVar;
        this.f23139b = i7;
        this.f23142f = chat;
        this.d = user;
        this.f23140c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        switch (this.f23138a) {
            case 0:
                np npVar = (np) this.f23141e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f23142f;
                npVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.f23139b));
                    ur messagesStorage = npVar.getMessagesStorage();
                    if (chat != null) {
                        j3 = -chat.f28434id;
                    } else {
                        j3 = this.d.f28583id;
                    }
                    messagesStorage.c2(j3, arrayList, !this.f23140c, -1, 0, false, null);
                    npVar.V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                g0.g3(new oi.q2((cn0) this.f23141e, (String) this.f23142f, this.f23139b, tLObject, this.f23140c, this.d));
                return;
        }
    }

    public bn(cn0 cn0Var, String str, int i7, boolean z10, TLRPC.User user) {
        this.f23141e = cn0Var;
        this.f23142f = str;
        this.f23139b = i7;
        this.f23140c = z10;
        this.d = user;
    }
}
